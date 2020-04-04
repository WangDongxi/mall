package com.xydq.mall.utils;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.MDC;

import java.util.Map;
import java.util.UUID;

public class ContextUtils {
    private ContextUtils() {}

    @Data
    public static class CurrentContext implements Cloneable {
        private Integer userId;
        private Integer adminId;

        @Override
        public CurrentContext clone() {
            try {
                return (CurrentContext) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static final ThreadLocal<CurrentContext> CONTEXT_THREAD_LOCAL =
                    ThreadLocal.withInitial(CurrentContext::new);

    public static CurrentContext getCurrentContext() {
        return CONTEXT_THREAD_LOCAL.get();
    }

    private static void setCurrentContext(CurrentContext context) {
        CONTEXT_THREAD_LOCAL.set(context);
    }


    public static final String REQUEST_ID = "requestId";


    public static void bindRequestIdToMDC(String requestId) {
        MDC.put(REQUEST_ID, requestId);
    }

    public static void bindRandomRequestIdToMDC() {
        bindRequestIdToMDC(UUID.randomUUID().toString().replaceAll("-", ""));
    }

    public static void removeRequestIdFromMDC() {
        MDC.remove(REQUEST_ID);
    }

    public static boolean bindRandomRequestIdToMDCIfNotExists() {
        if (StringUtils.isEmpty(MDC.get(REQUEST_ID))) {
            bindRandomRequestIdToMDC();
            return true;
        }
        return false;
    }

    /**
     * 导出MDC上下文
     *
     * @return 上下文
     */
    public static Map<String, String> exportMDCContext() {
        return MDC.getCopyOfContextMap();
    }

    /**
     * 导入MDC上下文
     *
     * @param context 上下文
     */
    public static void importMDCContext(Map<String, String> context) {
        MDC.setContextMap(context);
    }

    /**
     * 清理MDC上下文
     */
    public static void clearContext() {
        MDC.clear();
        CONTEXT_THREAD_LOCAL.remove();
    }

    /**
     * 装饰任务，使得任务执行时上下文与当前线程MDC上下文一致
     *
     * @param runnable 任务
     * @return 装饰后的任务
     */
    public static Runnable decorateTaskForAsyncPurpose(Runnable runnable) {
        return new RunnableContextWrapper(runnable);
    }

    private static class RunnableContextWrapper implements Runnable {
        private final Runnable runnable;
        private final Map<String, String> mdcContext;
        private final CurrentContext context;

        RunnableContextWrapper(Runnable runnable) {
            this.runnable = runnable;
            this.mdcContext = ContextUtils.exportMDCContext();
            this.context = ContextUtils.getCurrentContext().clone();
        }

        @Override
        public void run() {
            importMDCContext(mdcContext);
            bindRandomRequestIdToMDCIfNotExists();
            setCurrentContext(context);
            try {
                runnable.run();
            } finally {
                clearContext();
            }
        }
    }
}

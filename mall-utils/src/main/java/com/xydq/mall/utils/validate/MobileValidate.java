package com.xydq.mall.utils.validate;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author wanghuaidong
 * @date 2020/4/4
 */
public class MobileValidate {
    public static final List<String> SEGMENT_3_LIST = new ArrayList(36);
    public static final List<String> SEGMENT_2_LIST = Arrays.asList("13", "14", "15", "16", "17", "18", "19");
    public static final List<String> CHINA_MOBILE_SEGMENT_3_LIST;
    public static final List<String> CHINA_UNICOM_SEGMENT_3_LIST;
    public static final List<String> CHINA_TELECOM_SEGMENT_3_LIST;

    public MobileValidate() {
    }

    public static boolean validate(String mobile) {
        if (mobile != null && mobile.length() == 11) {
            String segment = mobile.substring(0, 2);
            if (SEGMENT_2_LIST.contains(segment)) {
                String regex = "^\\d{11}$";
                return Pattern.matches(regex, mobile);
            }
        }

        return false;
    }

    public static boolean isPhone(String phone) {
        if (!StringUtils.isBlank(phone) && phone.length() == 11) {
            String check = "^(((13[0-9])|(14[579])|(15([0-3]|[5-9]))|(16[6])|(17[0135678])|(18[0-9])|(19[89]))\\d{8})$";
            Pattern regex = Pattern.compile(check);
            Matcher matcher = regex.matcher(phone);
            return matcher.matches();
        } else {
            return false;
        }
    }

    static {
        SEGMENT_3_LIST.add("134");
        SEGMENT_3_LIST.add("135");
        SEGMENT_3_LIST.add("136");
        SEGMENT_3_LIST.add("137");
        SEGMENT_3_LIST.add("138");
        SEGMENT_3_LIST.add("139");
        SEGMENT_3_LIST.add("150");
        SEGMENT_3_LIST.add("151");
        SEGMENT_3_LIST.add("152");
        SEGMENT_3_LIST.add("157");
        SEGMENT_3_LIST.add("158");
        SEGMENT_3_LIST.add("159");
        SEGMENT_3_LIST.add("182");
        SEGMENT_3_LIST.add("183");
        SEGMENT_3_LIST.add("184");
        SEGMENT_3_LIST.add("187");
        SEGMENT_3_LIST.add("188");
        SEGMENT_3_LIST.add("178");
        SEGMENT_3_LIST.add("147");
        SEGMENT_3_LIST.add("198");
        CHINA_MOBILE_SEGMENT_3_LIST = new ArrayList();
        CHINA_MOBILE_SEGMENT_3_LIST.add("134");
        CHINA_MOBILE_SEGMENT_3_LIST.add("135");
        CHINA_MOBILE_SEGMENT_3_LIST.add("136");
        CHINA_MOBILE_SEGMENT_3_LIST.add("137");
        CHINA_MOBILE_SEGMENT_3_LIST.add("138");
        CHINA_MOBILE_SEGMENT_3_LIST.add("139");
        CHINA_MOBILE_SEGMENT_3_LIST.add("150");
        CHINA_MOBILE_SEGMENT_3_LIST.add("151");
        CHINA_MOBILE_SEGMENT_3_LIST.add("152");
        CHINA_MOBILE_SEGMENT_3_LIST.add("157");
        CHINA_MOBILE_SEGMENT_3_LIST.add("158");
        CHINA_MOBILE_SEGMENT_3_LIST.add("159");
        CHINA_MOBILE_SEGMENT_3_LIST.add("182");
        CHINA_MOBILE_SEGMENT_3_LIST.add("183");
        CHINA_MOBILE_SEGMENT_3_LIST.add("184");
        CHINA_MOBILE_SEGMENT_3_LIST.add("187");
        CHINA_MOBILE_SEGMENT_3_LIST.add("188");
        CHINA_MOBILE_SEGMENT_3_LIST.add("178");
        CHINA_MOBILE_SEGMENT_3_LIST.add("147");
        CHINA_MOBILE_SEGMENT_3_LIST.add("198");
        SEGMENT_3_LIST.add("130");
        SEGMENT_3_LIST.add("131");
        SEGMENT_3_LIST.add("132");
        SEGMENT_3_LIST.add("155");
        SEGMENT_3_LIST.add("156");
        SEGMENT_3_LIST.add("185");
        SEGMENT_3_LIST.add("186");
        SEGMENT_3_LIST.add("176");
        SEGMENT_3_LIST.add("145");
        SEGMENT_3_LIST.add("166");
        CHINA_UNICOM_SEGMENT_3_LIST = new ArrayList();
        CHINA_UNICOM_SEGMENT_3_LIST.add("130");
        CHINA_UNICOM_SEGMENT_3_LIST.add("131");
        CHINA_UNICOM_SEGMENT_3_LIST.add("132");
        CHINA_UNICOM_SEGMENT_3_LIST.add("155");
        CHINA_UNICOM_SEGMENT_3_LIST.add("156");
        CHINA_UNICOM_SEGMENT_3_LIST.add("185");
        CHINA_UNICOM_SEGMENT_3_LIST.add("186");
        CHINA_UNICOM_SEGMENT_3_LIST.add("176");
        CHINA_UNICOM_SEGMENT_3_LIST.add("145");
        CHINA_UNICOM_SEGMENT_3_LIST.add("166");
        SEGMENT_3_LIST.add("133");
        SEGMENT_3_LIST.add("153");
        SEGMENT_3_LIST.add("180");
        SEGMENT_3_LIST.add("181");
        SEGMENT_3_LIST.add("189");
        SEGMENT_3_LIST.add("177");
        SEGMENT_3_LIST.add("199");
        CHINA_TELECOM_SEGMENT_3_LIST = new ArrayList();
        CHINA_TELECOM_SEGMENT_3_LIST.add("133");
        CHINA_TELECOM_SEGMENT_3_LIST.add("153");
        CHINA_TELECOM_SEGMENT_3_LIST.add("180");
        CHINA_TELECOM_SEGMENT_3_LIST.add("181");
        CHINA_TELECOM_SEGMENT_3_LIST.add("189");
        CHINA_TELECOM_SEGMENT_3_LIST.add("177");
        CHINA_TELECOM_SEGMENT_3_LIST.add("199");
        SEGMENT_3_LIST.add("170");
        SEGMENT_3_LIST.add("171");
    }
}

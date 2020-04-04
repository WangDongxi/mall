package com.xydq.mall.core.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author wanghuaidong
 * @date 2020/4/4
 */
@Data
@Builder
public class IndexDTO implements Serializable {
    private static final long serialVersionUID = -3252610631749314852L;
    private List<BannerDTO> bannerList;
    private List<CategoryDTO> categoryList;
    private List<GoodsDTO> goodsList;

    @Data
    @Builder
    public static class GoodsDTO implements Serializable {
        private static final long serialVersionUID = 8183139866011562318L;
        private Integer goodsId;
        private String goodsName;
        private String goodsPic;
        private String brief;
        private Long price;
        private Long salePrice;
    }

    @Data
    @Builder
    public static class CategoryDTO implements Serializable {
        private static final long serialVersionUID = 4132187658226287496L;
        private Integer categoryId;
        private String categoryName;
        private String iconUrl;
    }

    @Data
    @Builder
    public static class BannerDTO implements Serializable {
        private static final long serialVersionUID = 2251849894650179806L;
        private String picUrl;
        private String linkUrl;
    }

}

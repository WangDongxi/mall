package com.xydq.mall.core.biz;

import com.xydq.mall.ad.dao.domain.MallBanner;
import com.xydq.mall.ad.service.MallBannerService;
import com.xydq.mall.core.dto.IndexDTO;
import com.xydq.mall.goods.dao.domain.MallCatagory;
import com.xydq.mall.goods.dao.domain.MallGoods;
import com.xydq.mall.goods.service.MallCategoryService;
import com.xydq.mall.goods.service.MallGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wanghuaidong
 * @date 2020/4/4
 */
@Service
public class MallIndexBizService {

    @Autowired
    private MallGoodsService mallGoodsService;
    @Autowired
    private MallBannerService mallBannerService;
    @Autowired
    private MallCategoryService mallCategoryService;

    public IndexDTO getIndexDTO() {
        List<MallBanner> mallBanners = mallBannerService.getBanner();
        List<IndexDTO.BannerDTO> bannerDTOList = mallBanners.stream().map(m ->
                IndexDTO.BannerDTO.builder().picUrl(m.getPicUrl()).linkUrl(m.getLinkUrl()).build())
                .collect(Collectors.toList());
        List<MallCatagory> mallCatagories = mallCategoryService.getIndexCategory();
        List<IndexDTO.CategoryDTO> categoryDTOList = mallCatagories.stream().map(c ->
                IndexDTO.CategoryDTO.builder().categoryId(c.getId()).categoryName(c.getCategoryName()).iconUrl(c.getIconUrl()).build())
                .collect(Collectors.toList());
        List<MallGoods> mallGoods = mallGoodsService.getIndexHotGoods();
        List<IndexDTO.GoodsDTO> goodsDTOList = mallGoods.stream().map(g ->
                IndexDTO.GoodsDTO.builder().brief(g.getBrief())
                        .goodsId(g.getId()).goodsName(g.getGoodsName())
                        .goodsPic(g.getGoodsPic()).price(g.getPrice()).salePrice(g.getSalePrice()).build())
                .collect(Collectors.toList());
        return IndexDTO.builder().bannerList(bannerDTOList).categoryList(categoryDTOList).goodsList(goodsDTOList).build();
    }

}

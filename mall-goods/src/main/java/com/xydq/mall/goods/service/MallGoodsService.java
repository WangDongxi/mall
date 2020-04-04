package com.xydq.mall.goods.service;

import com.github.pagehelper.PageHelper;
import com.xydq.mall.goods.dao.domain.MallGoods;
import com.xydq.mall.goods.dao.domain.MallGoodsExample;
import com.xydq.mall.goods.dao.mapper.MallGoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wanghuaidong
 * @date 2020/4/4
 */
@Service
public class MallGoodsService {

    public static final Integer DEFAULT_HOT_GOODS_NUM = 4;

    @Autowired
    private MallGoodsMapper mallGoodsMapper;

    public List<MallGoods> getIndexHotGoods() {
        MallGoodsExample example = new MallGoodsExample();
        example.createCriteria().andDeletedIdEqualTo(0).andHotGoodsEqualTo(true)
                .andOnSaleEqualTo(true).andRemainNumGreaterThan(0);
        example.setOrderByClause("sort desc");
        PageHelper.startPage(1, DEFAULT_HOT_GOODS_NUM);
        return mallGoodsMapper.selectByExample(example);
    }
}

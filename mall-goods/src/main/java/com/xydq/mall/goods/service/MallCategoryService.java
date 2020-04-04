package com.xydq.mall.goods.service;

import com.github.pagehelper.PageHelper;
import com.xydq.mall.goods.dao.domain.MallCatagory;
import com.xydq.mall.goods.dao.domain.MallCatagoryExample;
import com.xydq.mall.goods.dao.mapper.MallCatagoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wanghuaidong
 * @date 2020/4/4
 */
@Service
public class MallCategoryService {

    private static final Integer DEFAULT_CATEGORY_NUM = 8;

    @Autowired
    private MallCatagoryMapper mallCatagoryMapper;

    public List<MallCatagory> getIndexCategory() {
        MallCatagoryExample example = new MallCatagoryExample();
        example.createCriteria().andDeletedIdEqualTo(0);
        example.setOrderByClause("sort desc");
        PageHelper.startPage(1, DEFAULT_CATEGORY_NUM);
        return mallCatagoryMapper.selectByExample(example);
    }
}

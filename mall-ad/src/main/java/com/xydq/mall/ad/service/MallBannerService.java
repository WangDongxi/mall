package com.xydq.mall.ad.service;

import com.github.pagehelper.PageHelper;
import com.xydq.mall.ad.dao.domain.MallBanner;
import com.xydq.mall.ad.dao.domain.MallBannerExample;
import com.xydq.mall.ad.dao.mapper.MallBannerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wanghuaidong
 * @date 2020/4/4
 */
@Service
public class MallBannerService {

    public static final Integer DEFAULT_BANNER_NUM = 4;

    @Autowired
    private MallBannerMapper mallBannerMapper;

    public List<MallBanner> getBanner() {
        MallBannerExample example = new MallBannerExample();
        example.createCriteria().andDeletedIdEqualTo(0).andEnableEqualTo(true);
        example.setOrderByClause("sort desc");
        PageHelper.startPage(1, DEFAULT_BANNER_NUM);
        return mallBannerMapper.selectByExample(example);
    }

}

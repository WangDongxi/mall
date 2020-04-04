package com.xydq.mall.goods.dao.mapper;

import com.xydq.mall.goods.dao.domain.MallBrand;
import com.xydq.mall.goods.dao.domain.MallBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallBrandMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_brand
     *
     * @mbg.generated
     */
    long countByExample(MallBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_brand
     *
     * @mbg.generated
     */
    int deleteByExample(MallBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_brand
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_brand
     *
     * @mbg.generated
     */
    int insert(MallBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_brand
     *
     * @mbg.generated
     */
    int insertSelective(MallBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_brand
     *
     * @mbg.generated
     */
    List<MallBrand> selectByExample(MallBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_brand
     *
     * @mbg.generated
     */
    MallBrand selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_brand
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MallBrand record, @Param("example") MallBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_brand
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MallBrand record, @Param("example") MallBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_brand
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MallBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_brand
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MallBrand record);
}
package com.xydq.mall.goods.dao.mapper;

import com.xydq.mall.goods.dao.domain.MallGoods;
import com.xydq.mall.goods.dao.domain.MallGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods
     *
     * @mbg.generated
     */
    long countByExample(MallGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods
     *
     * @mbg.generated
     */
    int deleteByExample(MallGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods
     *
     * @mbg.generated
     */
    int insert(MallGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods
     *
     * @mbg.generated
     */
    int insertSelective(MallGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods
     *
     * @mbg.generated
     */
    List<MallGoods> selectByExample(MallGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods
     *
     * @mbg.generated
     */
    MallGoods selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MallGoods record, @Param("example") MallGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MallGoods record, @Param("example") MallGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MallGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MallGoods record);
}
package com.xydq.mall.goods.dao.domain;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table mall_brand
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class MallBrand {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_brand.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   品牌名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_brand.brand_name
     *
     * @mbg.generated
     */
    private String brandName;

    /**
     * Database Column Remarks:
     *   品牌描述
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_brand.desc
     *
     * @mbg.generated
     */
    private String desc;

    /**
     * Database Column Remarks:
     *   品牌标签地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_brand.icon_url
     *
     * @mbg.generated
     */
    private String iconUrl;

    /**
     * Database Column Remarks:
     *   品牌优先级
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_brand.sort
     *
     * @mbg.generated
     */
    private Integer sort;

    /**
     * Database Column Remarks:
     *   新增时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_brand.add_time
     *
     * @mbg.generated
     */
    private Date addTime;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_brand.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * Database Column Remarks:
     *   删除逻辑
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_brand.deleted_id
     *
     * @mbg.generated
     */
    private Integer deletedId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_brand.id
     *
     * @return the value of mall_brand.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_brand.id
     *
     * @param id the value for mall_brand.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_brand.brand_name
     *
     * @return the value of mall_brand.brand_name
     *
     * @mbg.generated
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_brand.brand_name
     *
     * @param brandName the value for mall_brand.brand_name
     *
     * @mbg.generated
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_brand.desc
     *
     * @return the value of mall_brand.desc
     *
     * @mbg.generated
     */
    public String getDesc() {
        return desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_brand.desc
     *
     * @param desc the value for mall_brand.desc
     *
     * @mbg.generated
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_brand.icon_url
     *
     * @return the value of mall_brand.icon_url
     *
     * @mbg.generated
     */
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_brand.icon_url
     *
     * @param iconUrl the value for mall_brand.icon_url
     *
     * @mbg.generated
     */
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_brand.sort
     *
     * @return the value of mall_brand.sort
     *
     * @mbg.generated
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_brand.sort
     *
     * @param sort the value for mall_brand.sort
     *
     * @mbg.generated
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_brand.add_time
     *
     * @return the value of mall_brand.add_time
     *
     * @mbg.generated
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_brand.add_time
     *
     * @param addTime the value for mall_brand.add_time
     *
     * @mbg.generated
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_brand.update_time
     *
     * @return the value of mall_brand.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_brand.update_time
     *
     * @param updateTime the value for mall_brand.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_brand.deleted_id
     *
     * @return the value of mall_brand.deleted_id
     *
     * @mbg.generated
     */
    public Integer getDeletedId() {
        return deletedId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_brand.deleted_id
     *
     * @param deletedId the value for mall_brand.deleted_id
     *
     * @mbg.generated
     */
    public void setDeletedId(Integer deletedId) {
        this.deletedId = deletedId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_brand
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", brandName=").append(brandName);
        sb.append(", desc=").append(desc);
        sb.append(", iconUrl=").append(iconUrl);
        sb.append(", sort=").append(sort);
        sb.append(", addTime=").append(addTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", deletedId=").append(deletedId);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_brand
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        MallBrand other = (MallBrand) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBrandName() == null ? other.getBrandName() == null : this.getBrandName().equals(other.getBrandName()))
            && (this.getDesc() == null ? other.getDesc() == null : this.getDesc().equals(other.getDesc()))
            && (this.getIconUrl() == null ? other.getIconUrl() == null : this.getIconUrl().equals(other.getIconUrl()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getAddTime() == null ? other.getAddTime() == null : this.getAddTime().equals(other.getAddTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getDeletedId() == null ? other.getDeletedId() == null : this.getDeletedId().equals(other.getDeletedId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_brand
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBrandName() == null) ? 0 : getBrandName().hashCode());
        result = prime * result + ((getDesc() == null) ? 0 : getDesc().hashCode());
        result = prime * result + ((getIconUrl() == null) ? 0 : getIconUrl().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getAddTime() == null) ? 0 : getAddTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getDeletedId() == null) ? 0 : getDeletedId().hashCode());
        return result;
    }
}
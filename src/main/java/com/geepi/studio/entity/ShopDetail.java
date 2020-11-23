package com.geepi.studio.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author geepi
 * @since 2020-05-04
 */
@TableName("wl_shop_detail")
public class ShopDetail extends Model<ShopDetail> {

private static final long serialVersionUID=1L;

    private Integer id;

    private Integer categoryId;

    private String isOnSale;

    private String name;

    private Integer goodsNumber;

    private String sellVolume;

    private String keywords;

    private BigDecimal retailPrice;

    private BigDecimal minRetailPrice;

    private BigDecimal costPrice;

    private BigDecimal minCostPrice;

    private String goodsBrief;

    private String goodsDesc;

    private String sortOrder;

    private String isIndex;

    private String isNew;

    private String goodsUnit;

    private String httpsPicUrl;

    private String listPicUrl;

    private Integer freightTemplateId;

    private String freightType;

    private String isDelete;

    private String hasGallery;

    private String hasDone;

    private Date createTime;

    private Date updateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getIsOnSale() {
        return isOnSale;
    }

    public void setIsOnSale(String isOnSale) {
        this.isOnSale = isOnSale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public String getSellVolume() {
        return sellVolume;
    }

    public void setSellVolume(String sellVolume) {
        this.sellVolume = sellVolume;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public BigDecimal getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(BigDecimal retailPrice) {
        this.retailPrice = retailPrice;
    }

    public BigDecimal getMinRetailPrice() {
        return minRetailPrice;
    }

    public void setMinRetailPrice(BigDecimal minRetailPrice) {
        this.minRetailPrice = minRetailPrice;
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    public BigDecimal getMinCostPrice() {
        return minCostPrice;
    }

    public void setMinCostPrice(BigDecimal minCostPrice) {
        this.minCostPrice = minCostPrice;
    }

    public String getGoodsBrief() {
        return goodsBrief;
    }

    public void setGoodsBrief(String goodsBrief) {
        this.goodsBrief = goodsBrief;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getIsIndex() {
        return isIndex;
    }

    public void setIsIndex(String isIndex) {
        this.isIndex = isIndex;
    }

    public String getIsNew() {
        return isNew;
    }

    public void setIsNew(String isNew) {
        this.isNew = isNew;
    }

    public String getGoodsUnit() {
        return goodsUnit;
    }

    public void setGoodsUnit(String goodsUnit) {
        this.goodsUnit = goodsUnit;
    }

    public String getHttpsPicUrl() {
        return httpsPicUrl;
    }

    public void setHttpsPicUrl(String httpsPicUrl) {
        this.httpsPicUrl = httpsPicUrl;
    }

    public String getListPicUrl() {
        return listPicUrl;
    }

    public void setListPicUrl(String listPicUrl) {
        this.listPicUrl = listPicUrl;
    }

    public Integer getFreightTemplateId() {
        return freightTemplateId;
    }

    public void setFreightTemplateId(Integer freightTemplateId) {
        this.freightTemplateId = freightTemplateId;
    }

    public String getFreightType() {
        return freightType;
    }

    public void setFreightType(String freightType) {
        this.freightType = freightType;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public String getHasGallery() {
        return hasGallery;
    }

    public void setHasGallery(String hasGallery) {
        this.hasGallery = hasGallery;
    }

    public String getHasDone() {
        return hasDone;
    }

    public void setHasDone(String hasDone) {
        this.hasDone = hasDone;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "ShopDetail{" +
        "id=" + id +
        ", categoryId=" + categoryId +
        ", isOnSale=" + isOnSale +
        ", name=" + name +
        ", goodsNumber=" + goodsNumber +
        ", sellVolume=" + sellVolume +
        ", keywords=" + keywords +
        ", retailPrice=" + retailPrice +
        ", minRetailPrice=" + minRetailPrice +
        ", costPrice=" + costPrice +
        ", minCostPrice=" + minCostPrice +
        ", goodsBrief=" + goodsBrief +
        ", goodsDesc=" + goodsDesc +
        ", sortOrder=" + sortOrder +
        ", isIndex=" + isIndex +
        ", isNew=" + isNew +
        ", goodsUnit=" + goodsUnit +
        ", httpsPicUrl=" + httpsPicUrl +
        ", listPicUrl=" + listPicUrl +
        ", freightTemplateId=" + freightTemplateId +
        ", freightType=" + freightType +
        ", isDelete=" + isDelete +
        ", hasGallery=" + hasGallery +
        ", hasDone=" + hasDone +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}

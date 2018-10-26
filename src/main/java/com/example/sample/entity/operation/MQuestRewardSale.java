package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MQuestRewardSaleListener.class)
@Table(name = "m_quest_reward_sale")
public class MQuestRewardSale {

    /** */
    @Id
    @Column(name = "quest_id")
    Integer questId;

    /** */
    @Id
    @Column(name = "shop_id")
    Integer shopId;

    /** */
    @Id
    @Column(name = "goods_id")
    Integer goodsId;

    /** */
    @Column(name = "sale_price")
    Integer salePrice;

    /** */
    @Column(name = "point_price")
    Integer pointPrice;

    /** */
    @Column(name = "sale_time")
    Integer saleTime;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the questId.
     * 
     * @return the questId
     */
    public Integer getQuestId() {
        return questId;
    }

    /** 
     * Sets the questId.
     * 
     * @param questId the questId
     */
    public void setQuestId(Integer questId) {
        this.questId = questId;
    }

    /** 
     * Returns the shopId.
     * 
     * @return the shopId
     */
    public Integer getShopId() {
        return shopId;
    }

    /** 
     * Sets the shopId.
     * 
     * @param shopId the shopId
     */
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    /** 
     * Returns the goodsId.
     * 
     * @return the goodsId
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /** 
     * Sets the goodsId.
     * 
     * @param goodsId the goodsId
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /** 
     * Returns the salePrice.
     * 
     * @return the salePrice
     */
    public Integer getSalePrice() {
        return salePrice;
    }

    /** 
     * Sets the salePrice.
     * 
     * @param salePrice the salePrice
     */
    public void setSalePrice(Integer salePrice) {
        this.salePrice = salePrice;
    }

    /** 
     * Returns the pointPrice.
     * 
     * @return the pointPrice
     */
    public Integer getPointPrice() {
        return pointPrice;
    }

    /** 
     * Sets the pointPrice.
     * 
     * @param pointPrice the pointPrice
     */
    public void setPointPrice(Integer pointPrice) {
        this.pointPrice = pointPrice;
    }

    /** 
     * Returns the saleTime.
     * 
     * @return the saleTime
     */
    public Integer getSaleTime() {
        return saleTime;
    }

    /** 
     * Sets the saleTime.
     * 
     * @param saleTime the saleTime
     */
    public void setSaleTime(Integer saleTime) {
        this.saleTime = saleTime;
    }

    /** 
     * Returns the createDate.
     * 
     * @return the createDate
     */
    public LocalDateTime getCreateDate() {
        return createDate;
    }

    /** 
     * Sets the createDate.
     * 
     * @param createDate the createDate
     */
    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    /** 
     * Returns the updateDate.
     * 
     * @return the updateDate
     */
    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    /** 
     * Sets the updateDate.
     * 
     * @param updateDate the updateDate
     */
    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }
}
package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MGachaGoodsListener.class)
@Table(name = "m_gacha_goods")
public class MGachaGoods {

    /** */
    @Id
    @Column(name = "gacha_id")
    Integer gachaId;

    /** */
    @Id
    @Column(name = "goods_no")
    Integer goodsNo;

    /** */
    @Id
    @Column(name = "give_type")
    Integer giveType;

    /** */
    @Column(name = "item_type")
    Integer itemType;

    /** */
    @Column(name = "item_id")
    Integer itemId;

    /** */
    @Column(name = "item_val")
    Integer itemVal;

    /** */
    @Column(name = "rare_flg")
    Boolean rareFlg;

    /** */
    @Column(name = "probability")
    Integer probability;

    /** */
    @Column(name = "create_time")
    LocalDateTime createTime;

    /** */
    @Column(name = "update_time")
    LocalDateTime updateTime;

    /** */
    @Column(name = "production_rarity")
    Integer productionRarity;

    /** */
    @Column(name = "unique_type")
    Integer uniqueType;

    /** */
    @Column(name = "rare_type")
    Integer rareType;

    /** */
    @Column(name = "start_date")
    LocalDateTime startDate;

    /** */
    @Column(name = "end_date")
    LocalDateTime endDate;

    /** 
     * Returns the gachaId.
     * 
     * @return the gachaId
     */
    public Integer getGachaId() {
        return gachaId;
    }

    /** 
     * Sets the gachaId.
     * 
     * @param gachaId the gachaId
     */
    public void setGachaId(Integer gachaId) {
        this.gachaId = gachaId;
    }

    /** 
     * Returns the goodsNo.
     * 
     * @return the goodsNo
     */
    public Integer getGoodsNo() {
        return goodsNo;
    }

    /** 
     * Sets the goodsNo.
     * 
     * @param goodsNo the goodsNo
     */
    public void setGoodsNo(Integer goodsNo) {
        this.goodsNo = goodsNo;
    }

    /** 
     * Returns the giveType.
     * 
     * @return the giveType
     */
    public Integer getGiveType() {
        return giveType;
    }

    /** 
     * Sets the giveType.
     * 
     * @param giveType the giveType
     */
    public void setGiveType(Integer giveType) {
        this.giveType = giveType;
    }

    /** 
     * Returns the itemType.
     * 
     * @return the itemType
     */
    public Integer getItemType() {
        return itemType;
    }

    /** 
     * Sets the itemType.
     * 
     * @param itemType the itemType
     */
    public void setItemType(Integer itemType) {
        this.itemType = itemType;
    }

    /** 
     * Returns the itemId.
     * 
     * @return the itemId
     */
    public Integer getItemId() {
        return itemId;
    }

    /** 
     * Sets the itemId.
     * 
     * @param itemId the itemId
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /** 
     * Returns the itemVal.
     * 
     * @return the itemVal
     */
    public Integer getItemVal() {
        return itemVal;
    }

    /** 
     * Sets the itemVal.
     * 
     * @param itemVal the itemVal
     */
    public void setItemVal(Integer itemVal) {
        this.itemVal = itemVal;
    }

    /** 
     * Returns the rareFlg.
     * 
     * @return the rareFlg
     */
    public Boolean getRareFlg() {
        return rareFlg;
    }

    /** 
     * Sets the rareFlg.
     * 
     * @param rareFlg the rareFlg
     */
    public void setRareFlg(Boolean rareFlg) {
        this.rareFlg = rareFlg;
    }

    /** 
     * Returns the probability.
     * 
     * @return the probability
     */
    public Integer getProbability() {
        return probability;
    }

    /** 
     * Sets the probability.
     * 
     * @param probability the probability
     */
    public void setProbability(Integer probability) {
        this.probability = probability;
    }

    /** 
     * Returns the createTime.
     * 
     * @return the createTime
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /** 
     * Sets the createTime.
     * 
     * @param createTime the createTime
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /** 
     * Returns the updateTime.
     * 
     * @return the updateTime
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /** 
     * Sets the updateTime.
     * 
     * @param updateTime the updateTime
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    /** 
     * Returns the productionRarity.
     * 
     * @return the productionRarity
     */
    public Integer getProductionRarity() {
        return productionRarity;
    }

    /** 
     * Sets the productionRarity.
     * 
     * @param productionRarity the productionRarity
     */
    public void setProductionRarity(Integer productionRarity) {
        this.productionRarity = productionRarity;
    }

    /** 
     * Returns the uniqueType.
     * 
     * @return the uniqueType
     */
    public Integer getUniqueType() {
        return uniqueType;
    }

    /** 
     * Sets the uniqueType.
     * 
     * @param uniqueType the uniqueType
     */
    public void setUniqueType(Integer uniqueType) {
        this.uniqueType = uniqueType;
    }

    /** 
     * Returns the rareType.
     * 
     * @return the rareType
     */
    public Integer getRareType() {
        return rareType;
    }

    /** 
     * Sets the rareType.
     * 
     * @param rareType the rareType
     */
    public void setRareType(Integer rareType) {
        this.rareType = rareType;
    }

    /** 
     * Returns the startDate.
     * 
     * @return the startDate
     */
    public LocalDateTime getStartDate() {
        return startDate;
    }

    /** 
     * Sets the startDate.
     * 
     * @param startDate the startDate
     */
    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    /** 
     * Returns the endDate.
     * 
     * @return the endDate
     */
    public LocalDateTime getEndDate() {
        return endDate;
    }

    /** 
     * Sets the endDate.
     * 
     * @param endDate the endDate
     */
    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }
}
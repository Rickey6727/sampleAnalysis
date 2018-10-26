package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MLotteryInsideListener.class)
@Table(name = "m_lottery_inside")
public class MLotteryInside {

    /** */
    @Id
    @Column(name = "lottery_id")
    Integer lotteryId;

    /** */
    @Id
    @Column(name = "lottery_no")
    Integer lotteryNo;

    /** */
    @Column(name = "item_type")
    Integer itemType;

    /** */
    @Column(name = "clothes_id")
    Integer clothesId;

    /** */
    @Column(name = "reel_count")
    Integer reelCount;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "goods_type")
    Integer goodsType;

    /** 
     * Returns the lotteryId.
     * 
     * @return the lotteryId
     */
    public Integer getLotteryId() {
        return lotteryId;
    }

    /** 
     * Sets the lotteryId.
     * 
     * @param lotteryId the lotteryId
     */
    public void setLotteryId(Integer lotteryId) {
        this.lotteryId = lotteryId;
    }

    /** 
     * Returns the lotteryNo.
     * 
     * @return the lotteryNo
     */
    public Integer getLotteryNo() {
        return lotteryNo;
    }

    /** 
     * Sets the lotteryNo.
     * 
     * @param lotteryNo the lotteryNo
     */
    public void setLotteryNo(Integer lotteryNo) {
        this.lotteryNo = lotteryNo;
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
     * Returns the clothesId.
     * 
     * @return the clothesId
     */
    public Integer getClothesId() {
        return clothesId;
    }

    /** 
     * Sets the clothesId.
     * 
     * @param clothesId the clothesId
     */
    public void setClothesId(Integer clothesId) {
        this.clothesId = clothesId;
    }

    /** 
     * Returns the reelCount.
     * 
     * @return the reelCount
     */
    public Integer getReelCount() {
        return reelCount;
    }

    /** 
     * Sets the reelCount.
     * 
     * @param reelCount the reelCount
     */
    public void setReelCount(Integer reelCount) {
        this.reelCount = reelCount;
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
     * Returns the goodsType.
     * 
     * @return the goodsType
     */
    public Integer getGoodsType() {
        return goodsType;
    }

    /** 
     * Sets the goodsType.
     * 
     * @param goodsType the goodsType
     */
    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
    }
}
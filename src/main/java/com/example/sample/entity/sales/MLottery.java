package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MLotteryListener.class)
@Table(name = "m_lottery")
public class MLottery {

    /** */
    @Id
    @Column(name = "lottery_id")
    Integer lotteryId;

    /** */
    @Id
    @Column(name = "gacha_id")
    Integer gachaId;

    /** */
    @Id
    @Column(name = "lottery_type")
    Integer lotteryType;

    /** */
    @Column(name = "price")
    Integer price;

    /** */
    @Column(name = "reel_count")
    Integer reelCount;

    /** */
    @Column(name = "start_date")
    LocalDateTime startDate;

    /** */
    @Column(name = "end_date")
    LocalDateTime endDate;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

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
     * Returns the lotteryType.
     * 
     * @return the lotteryType
     */
    public Integer getLotteryType() {
        return lotteryType;
    }

    /** 
     * Sets the lotteryType.
     * 
     * @param lotteryType the lotteryType
     */
    public void setLotteryType(Integer lotteryType) {
        this.lotteryType = lotteryType;
    }

    /** 
     * Returns the price.
     * 
     * @return the price
     */
    public Integer getPrice() {
        return price;
    }

    /** 
     * Sets the price.
     * 
     * @param price the price
     */
    public void setPrice(Integer price) {
        this.price = price;
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
}
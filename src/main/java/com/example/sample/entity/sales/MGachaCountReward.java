package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MGachaCountRewardListener.class)
@Table(name = "m_gacha_count_reward")
public class MGachaCountReward {

    /** */
    @Id
    @Column(name = "gacha_id")
    Integer gachaId;

    /** */
    @Id
    @Column(name = "gacha_count")
    Integer gachaCount;

    /** */
    @Column(name = "start_date")
    LocalDateTime startDate;

    /** */
    @Column(name = "end_date")
    LocalDateTime endDate;

    /** */
    @Column(name = "item_id")
    Integer itemId;

    /** */
    @Column(name = "item_type")
    Integer itemType;

    /** */
    @Column(name = "item_val")
    Integer itemVal;

    /** */
    @Column(name = "create_time")
    LocalDateTime createTime;

    /** */
    @Column(name = "update_time")
    LocalDateTime updateTime;

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
     * Returns the gachaCount.
     * 
     * @return the gachaCount
     */
    public Integer getGachaCount() {
        return gachaCount;
    }

    /** 
     * Sets the gachaCount.
     * 
     * @param gachaCount the gachaCount
     */
    public void setGachaCount(Integer gachaCount) {
        this.gachaCount = gachaCount;
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
}
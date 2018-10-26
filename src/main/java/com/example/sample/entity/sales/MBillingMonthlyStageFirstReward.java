package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MBillingMonthlyStageFirstRewardListener.class)
@Table(name = "m_billing_monthly_stage_first_reward")
public class MBillingMonthlyStageFirstReward {

    /** */
    @Id
    @Column(name = "stage_id")
    Integer stageId;

    /** */
    @Id
    @Column(name = "item_id")
    Integer itemId;

    /** */
    @Id
    @Column(name = "item_type")
    Integer itemType;

    /** */
    @Column(name = "item_val")
    Integer itemVal;

    /** */
    @Column(name = "following_flg")
    Integer followingFlg;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the stageId.
     * 
     * @return the stageId
     */
    public Integer getStageId() {
        return stageId;
    }

    /** 
     * Sets the stageId.
     * 
     * @param stageId the stageId
     */
    public void setStageId(Integer stageId) {
        this.stageId = stageId;
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
     * Returns the followingFlg.
     * 
     * @return the followingFlg
     */
    public Integer getFollowingFlg() {
        return followingFlg;
    }

    /** 
     * Sets the followingFlg.
     * 
     * @param followingFlg the followingFlg
     */
    public void setFollowingFlg(Integer followingFlg) {
        this.followingFlg = followingFlg;
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
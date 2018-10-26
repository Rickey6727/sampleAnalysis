package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MCcpFamilyListener.class)
@Table(name = "m_ccp_family")
public class MCcpFamily {

    /** */
    @Id
    @Column(name = "application_id")
    Integer applicationId;

    /** */
    @Column(name = "reward_npc_id")
    Integer rewardNpcId;

    /** */
    @Column(name = "start_date")
    LocalDateTime startDate;

    /** */
    @Column(name = "end_date")
    LocalDateTime endDate;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** */
    @Column(name = "max_present_count")
    Integer maxPresentCount;

    /** */
    @Column(name = "cheer_present_id")
    Integer cheerPresentId;

    /** */
    @Column(name = "cheer_present_type")
    Integer cheerPresentType;

    /** */
    @Column(name = "cheer_present_amount")
    Integer cheerPresentAmount;

    /** 
     * Returns the applicationId.
     * 
     * @return the applicationId
     */
    public Integer getApplicationId() {
        return applicationId;
    }

    /** 
     * Sets the applicationId.
     * 
     * @param applicationId the applicationId
     */
    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    /** 
     * Returns the rewardNpcId.
     * 
     * @return the rewardNpcId
     */
    public Integer getRewardNpcId() {
        return rewardNpcId;
    }

    /** 
     * Sets the rewardNpcId.
     * 
     * @param rewardNpcId the rewardNpcId
     */
    public void setRewardNpcId(Integer rewardNpcId) {
        this.rewardNpcId = rewardNpcId;
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

    /** 
     * Returns the maxPresentCount.
     * 
     * @return the maxPresentCount
     */
    public Integer getMaxPresentCount() {
        return maxPresentCount;
    }

    /** 
     * Sets the maxPresentCount.
     * 
     * @param maxPresentCount the maxPresentCount
     */
    public void setMaxPresentCount(Integer maxPresentCount) {
        this.maxPresentCount = maxPresentCount;
    }

    /** 
     * Returns the cheerPresentId.
     * 
     * @return the cheerPresentId
     */
    public Integer getCheerPresentId() {
        return cheerPresentId;
    }

    /** 
     * Sets the cheerPresentId.
     * 
     * @param cheerPresentId the cheerPresentId
     */
    public void setCheerPresentId(Integer cheerPresentId) {
        this.cheerPresentId = cheerPresentId;
    }

    /** 
     * Returns the cheerPresentType.
     * 
     * @return the cheerPresentType
     */
    public Integer getCheerPresentType() {
        return cheerPresentType;
    }

    /** 
     * Sets the cheerPresentType.
     * 
     * @param cheerPresentType the cheerPresentType
     */
    public void setCheerPresentType(Integer cheerPresentType) {
        this.cheerPresentType = cheerPresentType;
    }

    /** 
     * Returns the cheerPresentAmount.
     * 
     * @return the cheerPresentAmount
     */
    public Integer getCheerPresentAmount() {
        return cheerPresentAmount;
    }

    /** 
     * Sets the cheerPresentAmount.
     * 
     * @param cheerPresentAmount the cheerPresentAmount
     */
    public void setCheerPresentAmount(Integer cheerPresentAmount) {
        this.cheerPresentAmount = cheerPresentAmount;
    }
}
package com.example.sample.entity.event;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TCaptureUserStateListener.class)
@Table(name = "t_capture_user_state")
public class TCaptureUserState {

    /** */
    @Id
    @Column(name = "event_id")
    Integer eventId;

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Column(name = "current_point")
    Long currentPoint;

    /** */
    @Column(name = "current_partition_id")
    Integer currentPartitionId;

    /** */
    @Column(name = "current_stage")
    Integer currentStage;

    /** */
    @Column(name = "fever_type")
    Integer feverType;

    /** */
    @Column(name = "limit_time")
    LocalDateTime limitTime;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;
    
    /** */
    @Column(name = "count")
    Integer totalCount;

    /** 
     * Returns the eventId.
     * 
     * @return the eventId
     */
    public Integer getEventId() {
        return eventId;
    }

    /** 
     * Sets the eventId.
     * 
     * @param eventId the eventId
     */
    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    /** 
     * Returns the accountId.
     * 
     * @return the accountId
     */
    public Integer getAccountId() {
        return accountId;
    }

    /** 
     * Sets the accountId.
     * 
     * @param accountId the accountId
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    /** 
     * Returns the currentPoint.
     * 
     * @return the currentPoint
     */
    public Long getCurrentPoint() {
        return currentPoint;
    }

    /** 
     * Sets the currentPoint.
     * 
     * @param currentPoint the currentPoint
     */
    public void setCurrentPoint(Long currentPoint) {
        this.currentPoint = currentPoint;
    }

    /** 
     * Returns the currentPartitionId.
     * 
     * @return the currentPartitionId
     */
    public Integer getCurrentPartitionId() {
        return currentPartitionId;
    }

    /** 
     * Sets the currentPartitionId.
     * 
     * @param currentPartitionId the currentPartitionId
     */
    public void setCurrentPartitionId(Integer currentPartitionId) {
        this.currentPartitionId = currentPartitionId;
    }

    /** 
     * Returns the currentStage.
     * 
     * @return the currentStage
     */
    public Integer getCurrentStage() {
        return currentStage;
    }

    /** 
     * Sets the currentStage.
     * 
     * @param currentStage the currentStage
     */
    public void setCurrentStage(Integer currentStage) {
        this.currentStage = currentStage;
    }

    /** 
     * Returns the feverType.
     * 
     * @return the feverType
     */
    public Integer getFeverType() {
        return feverType;
    }

    /** 
     * Sets the feverType.
     * 
     * @param feverType the feverType
     */
    public void setFeverType(Integer feverType) {
        this.feverType = feverType;
    }

    /** 
     * Returns the limitTime.
     * 
     * @return the limitTime
     */
    public LocalDateTime getLimitTime() {
        return limitTime;
    }

    /** 
     * Sets the limitTime.
     * 
     * @param limitTime the limitTime
     */
    public void setLimitTime(LocalDateTime limitTime) {
        this.limitTime = limitTime;
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
     * Returns the totalCount.
     * 
     * @return the totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /** 
     * Sets the totalCount.
     * 
     * @param totalCount the totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
}
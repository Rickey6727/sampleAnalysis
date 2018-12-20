package com.example.sample.entity.event;

import java.math.BigInteger;
import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TDeliveryEventStateListener.class)
@Table(name = "t_delivery_event_state")
public class TDeliveryEventState {

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
    @Column(name = "fever_type")
    Integer feverType;

    /** */
    @Column(name = "current_partition_id")
    Integer currentPartitionId;

    /** */
    @Column(name = "limit_date")
    LocalDateTime limitDate;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** */
    @Column(name = "unlock_count")
    Integer unlockCount;
    
    /** */
    @Column(name = "sum")
    BigInteger totalDeliveryCount;
    
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
     * Returns the limitDate.
     * 
     * @return the limitDate
     */
    public LocalDateTime getLimitDate() {
        return limitDate;
    }

    /** 
     * Sets the limitDate.
     * 
     * @param limitDate the limitDate
     */
    public void setLimitDate(LocalDateTime limitDate) {
        this.limitDate = limitDate;
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
     * Returns the unlockCount.
     * 
     * @return the unlockCount
     */
    public Integer getUnlockCount() {
        return unlockCount;
    }

    /** 
     * Sets the unlockCount.
     * 
     * @param unlockCount the unlockCount
     */
    public void setUnlockCount(Integer unlockCount) {
        this.unlockCount = unlockCount;
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
    
    /** 
     * Returns the totalDeliveryCount.
     * 
     * @return the totalDeliveryCount
     */
    public BigInteger getTotalDeliveryCount() {
        return totalDeliveryCount;
    }

    /** 
     * Sets the totalDeliveryCount.
     * 
     * @param totalDeliveryCount the totalDeliveryCount
     */
    public void setTotalDeliveryCount(BigInteger totalDeliveryCount) {
        this.totalDeliveryCount = totalDeliveryCount;
    }
}
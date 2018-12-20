package com.example.sample.entity.event;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TLeagueEventAccountListener.class)
@Table(name = "t_league_event_account")
public class TLeagueEventAccount {

    /** */
    @Id
    @Column(name = "event_id")
    Integer eventId;

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Column(name = "life_point")
    Integer lifePoint;

    /** */
    @Column(name = "current_partition_id")
    Integer currentPartitionId;

    /** */
    @Column(name = "current_point")
    Long currentPoint;

    /** */
    @Column(name = "next_recover_time")
    LocalDateTime nextRecoverTime;

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
     * Returns the lifePoint.
     * 
     * @return the lifePoint
     */
    public Integer getLifePoint() {
        return lifePoint;
    }

    /** 
     * Sets the lifePoint.
     * 
     * @param lifePoint the lifePoint
     */
    public void setLifePoint(Integer lifePoint) {
        this.lifePoint = lifePoint;
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
     * Returns the nextRecoverTime.
     * 
     * @return the nextRecoverTime
     */
    public LocalDateTime getNextRecoverTime() {
        return nextRecoverTime;
    }

    /** 
     * Sets the nextRecoverTime.
     * 
     * @param nextRecoverTime the nextRecoverTime
     */
    public void setNextRecoverTime(LocalDateTime nextRecoverTime) {
        this.nextRecoverTime = nextRecoverTime;
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
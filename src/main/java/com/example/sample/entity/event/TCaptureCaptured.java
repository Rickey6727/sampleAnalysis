package com.example.sample.entity.event;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TCaptureCapturedListener.class)
@Table(name = "t_capture_captured")
public class TCaptureCaptured {

    /** */
    @Id
    @Column(name = "event_id")
    Integer eventId;

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Id
    @Column(name = "sheep_id")
    Integer sheepId;

    /** */
    @Column(name = "capture_count")
    Integer captureCount;
    
    /** */
    @Column(name = "sum")
    Integer totalCaptureCount;

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
     * Returns the sheepId.
     * 
     * @return the sheepId
     */
    public Integer getSheepId() {
        return sheepId;
    }

    /** 
     * Sets the sheepId.
     * 
     * @param sheepId the sheepId
     */
    public void setSheepId(Integer sheepId) {
        this.sheepId = sheepId;
    }

    /** 
     * Returns the captureCount.
     * 
     * @return the captureCount
     */
    public Integer getCaptureCount() {
        return captureCount;
    }

    /** 
     * Sets the captureCount.
     * 
     * @param captureCount the captureCount
     */
    public void setCaptureCount(Integer captureCount) {
        this.captureCount = captureCount;
    }
    
    /** 
     * Returns the totalCaptureCount.
     * 
     * @return the totalCaptureCount
     */
    public Integer getTotalCaptureCount() {
        return totalCaptureCount;
    }

    /** 
     * Sets the totalCaptureCount.
     * 
     * @param totalCaptureCount the totalCaptureCount
     */
    public void setTotalCaptureCount(Integer totalCaptureCount) {
        this.totalCaptureCount = totalCaptureCount;
    }
}
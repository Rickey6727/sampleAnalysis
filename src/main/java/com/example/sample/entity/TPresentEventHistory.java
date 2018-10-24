package com.example.sample.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TPresentEventHistoryListener.class)
@Table(name = "t_present_event_history")
public class TPresentEventHistory {

    /** */
    @Id
    @Column(name = "event_id")
    Integer eventId;

    /** */
    @Id
    @Column(name = "t_account_id")
    Integer tAccountId;

    /** */
    @Id
    @Column(name = "f_account_id")
    Integer fAccountId;

    /** */
    @Column(name = "present_count")
    Integer presentCount;

    /** */
    @Column(name = "add_date")
    LocalDateTime addDate;

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
     * Returns the tAccountId.
     * 
     * @return the tAccountId
     */
    public Integer getTAccountId() {
        return tAccountId;
    }

    /** 
     * Sets the tAccountId.
     * 
     * @param tAccountId the tAccountId
     */
    public void setTAccountId(Integer tAccountId) {
        this.tAccountId = tAccountId;
    }

    /** 
     * Returns the fAccountId.
     * 
     * @return the fAccountId
     */
    public Integer getFAccountId() {
        return fAccountId;
    }

    /** 
     * Sets the fAccountId.
     * 
     * @param fAccountId the fAccountId
     */
    public void setFAccountId(Integer fAccountId) {
        this.fAccountId = fAccountId;
    }

    /** 
     * Returns the presentCount.
     * 
     * @return the presentCount
     */
    public Integer getPresentCount() {
        return presentCount;
    }

    /** 
     * Sets the presentCount.
     * 
     * @param presentCount the presentCount
     */
    public void setPresentCount(Integer presentCount) {
        this.presentCount = presentCount;
    }

    /** 
     * Returns the addDate.
     * 
     * @return the addDate
     */
    public LocalDateTime getAddDate() {
        return addDate;
    }

    /** 
     * Sets the addDate.
     * 
     * @param addDate the addDate
     */
    public void setAddDate(LocalDateTime addDate) {
        this.addDate = addDate;
    }
}
package com.example.sample.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TPresentEventMessageHistoryListener.class)
@Table(name = "t_present_event_message_history")
public class TPresentEventMessageHistory {

    /** */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "serial_id")
    Long serialId;

    /** */
    @Column(name = "event_id")
    Integer eventId;

    /** */
    @Column(name = "f_account_id")
    Integer fAccountId;

    /** */
    @Column(name = "t_account_id")
    Integer tAccountId;

    /** */
    @Column(name = "send_date")
    LocalDateTime sendDate;

    /** 
     * Returns the serialId.
     * 
     * @return the serialId
     */
    public Long getSerialId() {
        return serialId;
    }

    /** 
     * Sets the serialId.
     * 
     * @param serialId the serialId
     */
    public void setSerialId(Long serialId) {
        this.serialId = serialId;
    }

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
     * Returns the sendDate.
     * 
     * @return the sendDate
     */
    public LocalDateTime getSendDate() {
        return sendDate;
    }

    /** 
     * Sets the sendDate.
     * 
     * @param sendDate the sendDate
     */
    public void setSendDate(LocalDateTime sendDate) {
        this.sendDate = sendDate;
    }
}
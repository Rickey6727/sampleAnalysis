package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MPresentEventSendConditionListener.class)
@Table(name = "m_present_event_send_condition")
public class MPresentEventSendCondition {

    /** */
    @Id
    @Column(name = "event_id")
    Integer eventId;

    /** */
    @Column(name = "send_cnt")
    Integer sendCnt;

    /** */
    @Column(name = "person_cnt")
    Integer personCnt;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

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
     * Returns the sendCnt.
     * 
     * @return the sendCnt
     */
    public Integer getSendCnt() {
        return sendCnt;
    }

    /** 
     * Sets the sendCnt.
     * 
     * @param sendCnt the sendCnt
     */
    public void setSendCnt(Integer sendCnt) {
        this.sendCnt = sendCnt;
    }

    /** 
     * Returns the personCnt.
     * 
     * @return the personCnt
     */
    public Integer getPersonCnt() {
        return personCnt;
    }

    /** 
     * Sets the personCnt.
     * 
     * @param personCnt the personCnt
     */
    public void setPersonCnt(Integer personCnt) {
        this.personCnt = personCnt;
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
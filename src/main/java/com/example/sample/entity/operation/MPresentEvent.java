package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MPresentEventListener.class)
@Table(name = "m_present_event")
public class MPresentEvent {

    /** */
    @Id
    @Column(name = "event_id")
    Integer eventId;

    /** */
    @Column(name = "event_name")
    String eventName;

    /** */
    @Column(name = "event_page")
    String eventPage;

    /** */
    @Column(name = "message_id")
    Integer messageId;

    /** */
    @Column(name = "del_flg")
    Integer delFlg;

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
     * Returns the eventName.
     * 
     * @return the eventName
     */
    public String getEventName() {
        return eventName;
    }

    /** 
     * Sets the eventName.
     * 
     * @param eventName the eventName
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    /** 
     * Returns the eventPage.
     * 
     * @return the eventPage
     */
    public String getEventPage() {
        return eventPage;
    }

    /** 
     * Sets the eventPage.
     * 
     * @param eventPage the eventPage
     */
    public void setEventPage(String eventPage) {
        this.eventPage = eventPage;
    }

    /** 
     * Returns the messageId.
     * 
     * @return the messageId
     */
    public Integer getMessageId() {
        return messageId;
    }

    /** 
     * Sets the messageId.
     * 
     * @param messageId the messageId
     */
    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    /** 
     * Returns the delFlg.
     * 
     * @return the delFlg
     */
    public Integer getDelFlg() {
        return delFlg;
    }

    /** 
     * Sets the delFlg.
     * 
     * @param delFlg the delFlg
     */
    public void setDelFlg(Integer delFlg) {
        this.delFlg = delFlg;
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
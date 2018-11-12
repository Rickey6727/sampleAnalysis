package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MPresentEventMessageListener.class)
@Table(name = "m_present_event_message")
public class MPresentEventMessage {

    /** */
    @Id
    @Column(name = "message_id")
    Integer messageId;

    /** */
    @Column(name = "subject")
    String subject;

    /** */
    @Column(name = "body")
    String body;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

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
     * Returns the subject.
     * 
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /** 
     * Sets the subject.
     * 
     * @param subject the subject
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /** 
     * Returns the body.
     * 
     * @return the body
     */
    public String getBody() {
        return body;
    }

    /** 
     * Sets the body.
     * 
     * @param body the body
     */
    public void setBody(String body) {
        this.body = body;
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
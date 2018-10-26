package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MExchangeSpMessageListener.class)
@Table(name = "m_exchange_sp_message")
public class MExchangeSpMessage {

    /** */
    @Id
    @Column(name = "message_type")
    Integer messageType;

    /** */
    @Column(name = "title")
    String title;

    /** */
    @Column(name = "confirm_message")
    String confirmMessage;

    /** */
    @Column(name = "complete_message")
    String completeMessage;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the messageType.
     * 
     * @return the messageType
     */
    public Integer getMessageType() {
        return messageType;
    }

    /** 
     * Sets the messageType.
     * 
     * @param messageType the messageType
     */
    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }

    /** 
     * Returns the title.
     * 
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /** 
     * Sets the title.
     * 
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /** 
     * Returns the confirmMessage.
     * 
     * @return the confirmMessage
     */
    public String getConfirmMessage() {
        return confirmMessage;
    }

    /** 
     * Sets the confirmMessage.
     * 
     * @param confirmMessage the confirmMessage
     */
    public void setConfirmMessage(String confirmMessage) {
        this.confirmMessage = confirmMessage;
    }

    /** 
     * Returns the completeMessage.
     * 
     * @return the completeMessage
     */
    public String getCompleteMessage() {
        return completeMessage;
    }

    /** 
     * Sets the completeMessage.
     * 
     * @param completeMessage the completeMessage
     */
    public void setCompleteMessage(String completeMessage) {
        this.completeMessage = completeMessage;
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
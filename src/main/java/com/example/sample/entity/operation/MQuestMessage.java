package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MQuestMessageListener.class)
@Table(name = "m_quest_message")
public class MQuestMessage {

    /** */
    @Id
    @Column(name = "quest_id")
    Integer questId;

    /** */
    @Column(name = "message_id")
    Integer messageId;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the questId.
     * 
     * @return the questId
     */
    public Integer getQuestId() {
        return questId;
    }

    /** 
     * Sets the questId.
     * 
     * @param questId the questId
     */
    public void setQuestId(Integer questId) {
        this.questId = questId;
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
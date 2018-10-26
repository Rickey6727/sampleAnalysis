package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MPushMessageListener.class)
@Table(name = "m_push_message")
public class MPushMessage {

    /** */
    @Id
    @Column(name = "push_message_id")
    Integer pushMessageId;

    /** */
    @Column(name = "push_message_ja")
    String pushMessageJa;

    /** */
    @Column(name = "push_message_en")
    String pushMessageEn;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the pushMessageId.
     * 
     * @return the pushMessageId
     */
    public Integer getPushMessageId() {
        return pushMessageId;
    }

    /** 
     * Sets the pushMessageId.
     * 
     * @param pushMessageId the pushMessageId
     */
    public void setPushMessageId(Integer pushMessageId) {
        this.pushMessageId = pushMessageId;
    }

    /** 
     * Returns the pushMessageJa.
     * 
     * @return the pushMessageJa
     */
    public String getPushMessageJa() {
        return pushMessageJa;
    }

    /** 
     * Sets the pushMessageJa.
     * 
     * @param pushMessageJa the pushMessageJa
     */
    public void setPushMessageJa(String pushMessageJa) {
        this.pushMessageJa = pushMessageJa;
    }

    /** 
     * Returns the pushMessageEn.
     * 
     * @return the pushMessageEn
     */
    public String getPushMessageEn() {
        return pushMessageEn;
    }

    /** 
     * Sets the pushMessageEn.
     * 
     * @param pushMessageEn the pushMessageEn
     */
    public void setPushMessageEn(String pushMessageEn) {
        this.pushMessageEn = pushMessageEn;
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
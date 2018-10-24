package com.example.sample.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TNotice17Listener.class)
@Table(name = "t_notice_17")
public class TNotice17 {

    /** */
    @Id
    @Column(name = "notice_id")
    Long noticeId;

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Column(name = "from_account_id")
    Integer fromAccountId;

    /** */
    @Column(name = "notice_type")
    Integer noticeType;

    /** */
    @Column(name = "message_id")
    Integer messageId;

    /** */
    @Column(name = "read_flg")
    Short readFlg;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the noticeId.
     * 
     * @return the noticeId
     */
    public Long getNoticeId() {
        return noticeId;
    }

    /** 
     * Sets the noticeId.
     * 
     * @param noticeId the noticeId
     */
    public void setNoticeId(Long noticeId) {
        this.noticeId = noticeId;
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
     * Returns the fromAccountId.
     * 
     * @return the fromAccountId
     */
    public Integer getFromAccountId() {
        return fromAccountId;
    }

    /** 
     * Sets the fromAccountId.
     * 
     * @param fromAccountId the fromAccountId
     */
    public void setFromAccountId(Integer fromAccountId) {
        this.fromAccountId = fromAccountId;
    }

    /** 
     * Returns the noticeType.
     * 
     * @return the noticeType
     */
    public Integer getNoticeType() {
        return noticeType;
    }

    /** 
     * Sets the noticeType.
     * 
     * @param noticeType the noticeType
     */
    public void setNoticeType(Integer noticeType) {
        this.noticeType = noticeType;
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
     * Returns the readFlg.
     * 
     * @return the readFlg
     */
    public Short getReadFlg() {
        return readFlg;
    }

    /** 
     * Sets the readFlg.
     * 
     * @param readFlg the readFlg
     */
    public void setReadFlg(Short readFlg) {
        this.readFlg = readFlg;
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
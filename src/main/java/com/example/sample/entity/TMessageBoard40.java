package com.example.sample.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TMessageBoard40Listener.class)
@Table(name = "t_message_board_40")
public class TMessageBoard40 {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Id
    @Column(name = "comment_id")
    Long commentId;

    /** */
    @Column(name = "from_account_id")
    Integer fromAccountId;

    /** */
    @Column(name = "body")
    String body;

    /** */
    @Column(name = "check_flg")
    Integer checkFlg;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** */
    @Column(name = "delete_flg")
    Boolean deleteFlg;

    /** */
    @Column(name = "response_num")
    Integer responseNum;

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
     * Returns the commentId.
     * 
     * @return the commentId
     */
    public Long getCommentId() {
        return commentId;
    }

    /** 
     * Sets the commentId.
     * 
     * @param commentId the commentId
     */
    public void setCommentId(Long commentId) {
        this.commentId = commentId;
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
     * Returns the checkFlg.
     * 
     * @return the checkFlg
     */
    public Integer getCheckFlg() {
        return checkFlg;
    }

    /** 
     * Sets the checkFlg.
     * 
     * @param checkFlg the checkFlg
     */
    public void setCheckFlg(Integer checkFlg) {
        this.checkFlg = checkFlg;
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

    /** 
     * Returns the deleteFlg.
     * 
     * @return the deleteFlg
     */
    public Boolean getDeleteFlg() {
        return deleteFlg;
    }

    /** 
     * Sets the deleteFlg.
     * 
     * @param deleteFlg the deleteFlg
     */
    public void setDeleteFlg(Boolean deleteFlg) {
        this.deleteFlg = deleteFlg;
    }

    /** 
     * Returns the responseNum.
     * 
     * @return the responseNum
     */
    public Integer getResponseNum() {
        return responseNum;
    }

    /** 
     * Sets the responseNum.
     * 
     * @param responseNum the responseNum
     */
    public void setResponseNum(Integer responseNum) {
        this.responseNum = responseNum;
    }
}
package com.example.sample.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TMessageBoardResponse98Listener.class)
@Table(name = "t_message_board_response_98")
public class TMessageBoardResponse98 {

    /** */
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Column(name = "comment_id")
    Long commentId;

    /** */
    @Column(name = "parent_comment_id")
    Long parentCommentId;

    /** */
    @Column(name = "from_account_id")
    Integer fromAccountId;

    /** */
    @Column(name = "body")
    String body;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** */
    @Column(name = "delete_flg")
    Boolean deleteFlg;

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
     * Returns the parentCommentId.
     * 
     * @return the parentCommentId
     */
    public Long getParentCommentId() {
        return parentCommentId;
    }

    /** 
     * Sets the parentCommentId.
     * 
     * @param parentCommentId the parentCommentId
     */
    public void setParentCommentId(Long parentCommentId) {
        this.parentCommentId = parentCommentId;
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
}
package com.example.sample.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TFriendRelationship54Listener.class)
@Table(name = "t_friend_relationship_54")
public class TFriendRelationship54 {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Id
    @Column(name = "friend_account_id")
    Integer friendAccountId;

    /** */
    @Column(name = "friend_state")
    Short friendState;

    /** */
    @Column(name = "access_block_flg")
    Short accessBlockFlg;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

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
     * Returns the friendAccountId.
     * 
     * @return the friendAccountId
     */
    public Integer getFriendAccountId() {
        return friendAccountId;
    }

    /** 
     * Sets the friendAccountId.
     * 
     * @param friendAccountId the friendAccountId
     */
    public void setFriendAccountId(Integer friendAccountId) {
        this.friendAccountId = friendAccountId;
    }

    /** 
     * Returns the friendState.
     * 
     * @return the friendState
     */
    public Short getFriendState() {
        return friendState;
    }

    /** 
     * Sets the friendState.
     * 
     * @param friendState the friendState
     */
    public void setFriendState(Short friendState) {
        this.friendState = friendState;
    }

    /** 
     * Returns the accessBlockFlg.
     * 
     * @return the accessBlockFlg
     */
    public Short getAccessBlockFlg() {
        return accessBlockFlg;
    }

    /** 
     * Sets the accessBlockFlg.
     * 
     * @param accessBlockFlg the accessBlockFlg
     */
    public void setAccessBlockFlg(Short accessBlockFlg) {
        this.accessBlockFlg = accessBlockFlg;
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
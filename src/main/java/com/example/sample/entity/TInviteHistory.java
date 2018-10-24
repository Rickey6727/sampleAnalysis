package com.example.sample.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TInviteHistoryListener.class)
@Table(name = "t_invite_history")
public class TInviteHistory {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Id
    @Column(name = "friend_account_id")
    Integer friendAccountId;

    /** */
    @Column(name = "invite_id")
    Integer inviteId;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

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
     * Returns the inviteId.
     * 
     * @return the inviteId
     */
    public Integer getInviteId() {
        return inviteId;
    }

    /** 
     * Sets the inviteId.
     * 
     * @param inviteId the inviteId
     */
    public void setInviteId(Integer inviteId) {
        this.inviteId = inviteId;
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
}
package com.example.sample.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TFriendInviteAchievementListener.class)
@Table(name = "t_friend_invite_achievement")
public class TFriendInviteAchievement {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Column(name = "to_account_id")
    Integer toAccountId;

    /** */
    @Column(name = "to_uuid")
    String toUuid;

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
     * Returns the toAccountId.
     * 
     * @return the toAccountId
     */
    public Integer getToAccountId() {
        return toAccountId;
    }

    /** 
     * Sets the toAccountId.
     * 
     * @param toAccountId the toAccountId
     */
    public void setToAccountId(Integer toAccountId) {
        this.toAccountId = toAccountId;
    }

    /** 
     * Returns the toUuid.
     * 
     * @return the toUuid
     */
    public String getToUuid() {
        return toUuid;
    }

    /** 
     * Sets the toUuid.
     * 
     * @param toUuid the toUuid
     */
    public void setToUuid(String toUuid) {
        this.toUuid = toUuid;
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
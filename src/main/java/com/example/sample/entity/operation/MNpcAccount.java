package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MNpcAccountListener.class)
@Table(name = "m_npc_account")
public class MNpcAccount {

    /** */
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Column(name = "town_id")
    Integer townId;

    /** */
    @Column(name = "quest_id")
    Integer questId;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** */
    @Column(name = "friend_enable_flg")
    Integer friendEnableFlg;

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
     * Returns the townId.
     * 
     * @return the townId
     */
    public Integer getTownId() {
        return townId;
    }

    /** 
     * Sets the townId.
     * 
     * @param townId the townId
     */
    public void setTownId(Integer townId) {
        this.townId = townId;
    }

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
     * Returns the friendEnableFlg.
     * 
     * @return the friendEnableFlg
     */
    public Integer getFriendEnableFlg() {
        return friendEnableFlg;
    }

    /** 
     * Sets the friendEnableFlg.
     * 
     * @param friendEnableFlg the friendEnableFlg
     */
    public void setFriendEnableFlg(Integer friendEnableFlg) {
        this.friendEnableFlg = friendEnableFlg;
    }
}
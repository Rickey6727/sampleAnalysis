package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MNpcMessageListener.class)
@Table(name = "m_npc_message")
public class MNpcMessage {

    /** */
    @Id
    @Column(name = "npc_account_id")
    Integer npcAccountId;

    /** */
    @Id
    @Column(name = "country_cd")
    Integer countryCd;

    /** */
    @Id
    @Column(name = "town_rank")
    Integer townRank;

    /** */
    @Id
    @Column(name = "quest_id")
    Integer questId;

    /** */
    @Column(name = "message")
    String message;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the npcAccountId.
     * 
     * @return the npcAccountId
     */
    public Integer getNpcAccountId() {
        return npcAccountId;
    }

    /** 
     * Sets the npcAccountId.
     * 
     * @param npcAccountId the npcAccountId
     */
    public void setNpcAccountId(Integer npcAccountId) {
        this.npcAccountId = npcAccountId;
    }

    /** 
     * Returns the countryCd.
     * 
     * @return the countryCd
     */
    public Integer getCountryCd() {
        return countryCd;
    }

    /** 
     * Sets the countryCd.
     * 
     * @param countryCd the countryCd
     */
    public void setCountryCd(Integer countryCd) {
        this.countryCd = countryCd;
    }

    /** 
     * Returns the townRank.
     * 
     * @return the townRank
     */
    public Integer getTownRank() {
        return townRank;
    }

    /** 
     * Sets the townRank.
     * 
     * @param townRank the townRank
     */
    public void setTownRank(Integer townRank) {
        this.townRank = townRank;
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
     * Returns the message.
     * 
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /** 
     * Sets the message.
     * 
     * @param message the message
     */
    public void setMessage(String message) {
        this.message = message;
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
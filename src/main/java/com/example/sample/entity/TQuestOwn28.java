package com.example.sample.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TQuestOwn28Listener.class)
@Table(name = "t_quest_own_28")
public class TQuestOwn28 {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Id
    @Column(name = "quest_id")
    Integer questId;

    /** */
    @Id
    @Column(name = "condition_no")
    Integer conditionNo;

    /** */
    @Column(name = "now_count")
    Integer nowCount;

    /** */
    @Column(name = "complete_flg")
    Short completeFlg;

    /** */
    @Column(name = "read_flg")
    Short readFlg;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** */
    @Column(name = "clear_date")
    LocalDateTime clearDate;

    /** */
    @Column(name = "start_flg")
    Boolean startFlg;

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
     * Returns the conditionNo.
     * 
     * @return the conditionNo
     */
    public Integer getConditionNo() {
        return conditionNo;
    }

    /** 
     * Sets the conditionNo.
     * 
     * @param conditionNo the conditionNo
     */
    public void setConditionNo(Integer conditionNo) {
        this.conditionNo = conditionNo;
    }

    /** 
     * Returns the nowCount.
     * 
     * @return the nowCount
     */
    public Integer getNowCount() {
        return nowCount;
    }

    /** 
     * Sets the nowCount.
     * 
     * @param nowCount the nowCount
     */
    public void setNowCount(Integer nowCount) {
        this.nowCount = nowCount;
    }

    /** 
     * Returns the completeFlg.
     * 
     * @return the completeFlg
     */
    public Short getCompleteFlg() {
        return completeFlg;
    }

    /** 
     * Sets the completeFlg.
     * 
     * @param completeFlg the completeFlg
     */
    public void setCompleteFlg(Short completeFlg) {
        this.completeFlg = completeFlg;
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

    /** 
     * Returns the clearDate.
     * 
     * @return the clearDate
     */
    public LocalDateTime getClearDate() {
        return clearDate;
    }

    /** 
     * Sets the clearDate.
     * 
     * @param clearDate the clearDate
     */
    public void setClearDate(LocalDateTime clearDate) {
        this.clearDate = clearDate;
    }

    /** 
     * Returns the startFlg.
     * 
     * @return the startFlg
     */
    public Boolean getStartFlg() {
        return startFlg;
    }

    /** 
     * Sets the startFlg.
     * 
     * @param startFlg the startFlg
     */
    public void setStartFlg(Boolean startFlg) {
        this.startFlg = startFlg;
    }
}
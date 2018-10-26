package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MCocoppaQuestListener.class)
@Table(name = "m_cocoppa_quest")
public class MCocoppaQuest {

    /** */
    @Id
    @Column(name = "campaign_id")
    Integer campaignId;

    /** */
    @Id
    @Column(name = "sort_num")
    Integer sortNum;

    /** */
    @Id
    @Column(name = "quest_id")
    Integer questId;

    /** */
    @Column(name = "start_date")
    LocalDateTime startDate;

    /** */
    @Column(name = "end_date")
    LocalDateTime endDate;

    /** */
    @Column(name = "del_flg")
    Short delFlg;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the campaignId.
     * 
     * @return the campaignId
     */
    public Integer getCampaignId() {
        return campaignId;
    }

    /** 
     * Sets the campaignId.
     * 
     * @param campaignId the campaignId
     */
    public void setCampaignId(Integer campaignId) {
        this.campaignId = campaignId;
    }

    /** 
     * Returns the sortNum.
     * 
     * @return the sortNum
     */
    public Integer getSortNum() {
        return sortNum;
    }

    /** 
     * Sets the sortNum.
     * 
     * @param sortNum the sortNum
     */
    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
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
     * Returns the startDate.
     * 
     * @return the startDate
     */
    public LocalDateTime getStartDate() {
        return startDate;
    }

    /** 
     * Sets the startDate.
     * 
     * @param startDate the startDate
     */
    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    /** 
     * Returns the endDate.
     * 
     * @return the endDate
     */
    public LocalDateTime getEndDate() {
        return endDate;
    }

    /** 
     * Sets the endDate.
     * 
     * @param endDate the endDate
     */
    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    /** 
     * Returns the delFlg.
     * 
     * @return the delFlg
     */
    public Short getDelFlg() {
        return delFlg;
    }

    /** 
     * Sets the delFlg.
     * 
     * @param delFlg the delFlg
     */
    public void setDelFlg(Short delFlg) {
        this.delFlg = delFlg;
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
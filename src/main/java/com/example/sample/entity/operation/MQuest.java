package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * クエストマスタ
 */
@Entity(listener = MQuestListener.class)
@Table(name = "m_quest")
public class MQuest {

    /** クエストID */
    @Id
    @Column(name = "quest_id")
    Integer questId;

    /** クエスト種別 */
    @Column(name = "quest_type")
    Integer questType;

    /** クリア条件ID */
    @Column(name = "condition_id")
    Integer conditionId;

    /** イベントID */
    @Column(name = "event_id")
    Integer eventId;

    /** 開始日時 */
    @Column(name = "start_date")
    LocalDateTime startDate;

    /** 終了日時 */
    @Column(name = "end_date")
    LocalDateTime endDate;

    /** 表示タイプ */
    @Column(name = "display_type")
    Short displayType;

    /** 削除フラグ */
    @Column(name = "del_flg")
    Short delFlg;

    /** 登録日時 */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** 更新日時 */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** */
    @Column(name = "reward_type")
    Integer rewardType;

    /** */
    @Column(name = "reward_id")
    Integer rewardId;

    /** */
    @Column(name = "generating_id")
    Integer generatingId;

    /** */
    @Column(name = "start_dialog_id")
    Integer startDialogId;

    /** */
    @Column(name = "end_dialog_id")
    Integer endDialogId;

    /** */
    @Column(name = "quest_mode")
    Integer questMode;

    /** */
    @Column(name = "quest_category")
    Integer questCategory;

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
     * Returns the questType.
     * 
     * @return the questType
     */
    public Integer getQuestType() {
        return questType;
    }

    /** 
     * Sets the questType.
     * 
     * @param questType the questType
     */
    public void setQuestType(Integer questType) {
        this.questType = questType;
    }

    /** 
     * Returns the conditionId.
     * 
     * @return the conditionId
     */
    public Integer getConditionId() {
        return conditionId;
    }

    /** 
     * Sets the conditionId.
     * 
     * @param conditionId the conditionId
     */
    public void setConditionId(Integer conditionId) {
        this.conditionId = conditionId;
    }

    /** 
     * Returns the eventId.
     * 
     * @return the eventId
     */
    public Integer getEventId() {
        return eventId;
    }

    /** 
     * Sets the eventId.
     * 
     * @param eventId the eventId
     */
    public void setEventId(Integer eventId) {
        this.eventId = eventId;
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
     * Returns the displayType.
     * 
     * @return the displayType
     */
    public Short getDisplayType() {
        return displayType;
    }

    /** 
     * Sets the displayType.
     * 
     * @param displayType the displayType
     */
    public void setDisplayType(Short displayType) {
        this.displayType = displayType;
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

    /** 
     * Returns the rewardType.
     * 
     * @return the rewardType
     */
    public Integer getRewardType() {
        return rewardType;
    }

    /** 
     * Sets the rewardType.
     * 
     * @param rewardType the rewardType
     */
    public void setRewardType(Integer rewardType) {
        this.rewardType = rewardType;
    }

    /** 
     * Returns the rewardId.
     * 
     * @return the rewardId
     */
    public Integer getRewardId() {
        return rewardId;
    }

    /** 
     * Sets the rewardId.
     * 
     * @param rewardId the rewardId
     */
    public void setRewardId(Integer rewardId) {
        this.rewardId = rewardId;
    }

    /** 
     * Returns the generatingId.
     * 
     * @return the generatingId
     */
    public Integer getGeneratingId() {
        return generatingId;
    }

    /** 
     * Sets the generatingId.
     * 
     * @param generatingId the generatingId
     */
    public void setGeneratingId(Integer generatingId) {
        this.generatingId = generatingId;
    }

    /** 
     * Returns the startDialogId.
     * 
     * @return the startDialogId
     */
    public Integer getStartDialogId() {
        return startDialogId;
    }

    /** 
     * Sets the startDialogId.
     * 
     * @param startDialogId the startDialogId
     */
    public void setStartDialogId(Integer startDialogId) {
        this.startDialogId = startDialogId;
    }

    /** 
     * Returns the endDialogId.
     * 
     * @return the endDialogId
     */
    public Integer getEndDialogId() {
        return endDialogId;
    }

    /** 
     * Sets the endDialogId.
     * 
     * @param endDialogId the endDialogId
     */
    public void setEndDialogId(Integer endDialogId) {
        this.endDialogId = endDialogId;
    }

    /** 
     * Returns the questMode.
     * 
     * @return the questMode
     */
    public Integer getQuestMode() {
        return questMode;
    }

    /** 
     * Sets the questMode.
     * 
     * @param questMode the questMode
     */
    public void setQuestMode(Integer questMode) {
        this.questMode = questMode;
    }

    /** 
     * Returns the questCategory.
     * 
     * @return the questCategory
     */
    public Integer getQuestCategory() {
        return questCategory;
    }

    /** 
     * Sets the questCategory.
     * 
     * @param questCategory the questCategory
     */
    public void setQuestCategory(Integer questCategory) {
        this.questCategory = questCategory;
    }
}
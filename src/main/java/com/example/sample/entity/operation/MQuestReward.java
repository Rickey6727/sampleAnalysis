package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * クエスト報酬マスタ
 */
@Entity(listener = MQuestRewardListener.class)
@Table(name = "m_quest_reward")
public class MQuestReward {

    /** クエストID */
    @Id
    @Column(name = "quest_id")
    Integer questId;

    /** 通番 */
    @Id
    @Column(name = "quest_no")
    Integer questNo;

    /** 報酬ID */
    @Column(name = "reward_id")
    Integer rewardId;

    /** 報酬種別 */
    @Column(name = "reward_type")
    Integer rewardType;

    /** 報酬付与カウント */
    @Column(name = "reward_count")
    Integer rewardCount;

    /** 登録日時 */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** 更新日時 */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** */
    @Column(name = "unique_type")
    Integer uniqueType;

    /** */
    @Column(name = "rare_type")
    Integer rareType;

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
     * Returns the questNo.
     * 
     * @return the questNo
     */
    public Integer getQuestNo() {
        return questNo;
    }

    /** 
     * Sets the questNo.
     * 
     * @param questNo the questNo
     */
    public void setQuestNo(Integer questNo) {
        this.questNo = questNo;
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
     * Returns the rewardCount.
     * 
     * @return the rewardCount
     */
    public Integer getRewardCount() {
        return rewardCount;
    }

    /** 
     * Sets the rewardCount.
     * 
     * @param rewardCount the rewardCount
     */
    public void setRewardCount(Integer rewardCount) {
        this.rewardCount = rewardCount;
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
     * Returns the uniqueType.
     * 
     * @return the uniqueType
     */
    public Integer getUniqueType() {
        return uniqueType;
    }

    /** 
     * Sets the uniqueType.
     * 
     * @param uniqueType the uniqueType
     */
    public void setUniqueType(Integer uniqueType) {
        this.uniqueType = uniqueType;
    }

    /** 
     * Returns the rareType.
     * 
     * @return the rareType
     */
    public Integer getRareType() {
        return rareType;
    }

    /** 
     * Sets the rareType.
     * 
     * @param rareType the rareType
     */
    public void setRareType(Integer rareType) {
        this.rareType = rareType;
    }
}
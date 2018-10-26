package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MEventCheerRewardListener.class)
@Table(name = "m_event_cheer_reward")
public class MEventCheerReward {

    /** */
    @Id
    @Column(name = "event_id")
    Integer eventId;

    /** */
    @Id
    @Column(name = "show_action_type")
    Integer showActionType;

    /** */
    @Column(name = "gacha_count")
    Integer gachaCount;

    /** */
    @Column(name = "reward_item_id")
    Integer rewardItemId;

    /** */
    @Column(name = "reward_item_type")
    Integer rewardItemType;

    /** */
    @Column(name = "item_probability")
    Integer itemProbability;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

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
     * Returns the showActionType.
     * 
     * @return the showActionType
     */
    public Integer getShowActionType() {
        return showActionType;
    }

    /** 
     * Sets the showActionType.
     * 
     * @param showActionType the showActionType
     */
    public void setShowActionType(Integer showActionType) {
        this.showActionType = showActionType;
    }

    /** 
     * Returns the gachaCount.
     * 
     * @return the gachaCount
     */
    public Integer getGachaCount() {
        return gachaCount;
    }

    /** 
     * Sets the gachaCount.
     * 
     * @param gachaCount the gachaCount
     */
    public void setGachaCount(Integer gachaCount) {
        this.gachaCount = gachaCount;
    }

    /** 
     * Returns the rewardItemId.
     * 
     * @return the rewardItemId
     */
    public Integer getRewardItemId() {
        return rewardItemId;
    }

    /** 
     * Sets the rewardItemId.
     * 
     * @param rewardItemId the rewardItemId
     */
    public void setRewardItemId(Integer rewardItemId) {
        this.rewardItemId = rewardItemId;
    }

    /** 
     * Returns the rewardItemType.
     * 
     * @return the rewardItemType
     */
    public Integer getRewardItemType() {
        return rewardItemType;
    }

    /** 
     * Sets the rewardItemType.
     * 
     * @param rewardItemType the rewardItemType
     */
    public void setRewardItemType(Integer rewardItemType) {
        this.rewardItemType = rewardItemType;
    }

    /** 
     * Returns the itemProbability.
     * 
     * @return the itemProbability
     */
    public Integer getItemProbability() {
        return itemProbability;
    }

    /** 
     * Sets the itemProbability.
     * 
     * @param itemProbability the itemProbability
     */
    public void setItemProbability(Integer itemProbability) {
        this.itemProbability = itemProbability;
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
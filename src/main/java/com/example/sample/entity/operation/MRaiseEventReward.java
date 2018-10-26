package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MRaiseEventRewardListener.class)
@Table(name = "m_raise_event_reward")
public class MRaiseEventReward {

    /** */
    @Id
    @Column(name = "event_id")
    Integer eventId;

    /** */
    @Id
    @Column(name = "lot_group_id")
    Integer lotGroupId;

    /** */
    @Column(name = "probability")
    Integer probability;

    /** */
    @Column(name = "item_type")
    Integer itemType;

    /** */
    @Id
    @Column(name = "item_id")
    Integer itemId;

    /** */
    @Column(name = "del_flg")
    Integer delFlg;

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
     * Returns the lotGroupId.
     * 
     * @return the lotGroupId
     */
    public Integer getLotGroupId() {
        return lotGroupId;
    }

    /** 
     * Sets the lotGroupId.
     * 
     * @param lotGroupId the lotGroupId
     */
    public void setLotGroupId(Integer lotGroupId) {
        this.lotGroupId = lotGroupId;
    }

    /** 
     * Returns the probability.
     * 
     * @return the probability
     */
    public Integer getProbability() {
        return probability;
    }

    /** 
     * Sets the probability.
     * 
     * @param probability the probability
     */
    public void setProbability(Integer probability) {
        this.probability = probability;
    }

    /** 
     * Returns the itemType.
     * 
     * @return the itemType
     */
    public Integer getItemType() {
        return itemType;
    }

    /** 
     * Sets the itemType.
     * 
     * @param itemType the itemType
     */
    public void setItemType(Integer itemType) {
        this.itemType = itemType;
    }

    /** 
     * Returns the itemId.
     * 
     * @return the itemId
     */
    public Integer getItemId() {
        return itemId;
    }

    /** 
     * Sets the itemId.
     * 
     * @param itemId the itemId
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /** 
     * Returns the delFlg.
     * 
     * @return the delFlg
     */
    public Integer getDelFlg() {
        return delFlg;
    }

    /** 
     * Sets the delFlg.
     * 
     * @param delFlg the delFlg
     */
    public void setDelFlg(Integer delFlg) {
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
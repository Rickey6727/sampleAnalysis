package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MRaiseEventNpcRewardListener.class)
@Table(name = "m_raise_event_npc_reward")
public class MRaiseEventNpcReward {

    /** */
    @Id
    @Column(name = "event_id")
    Integer eventId;

    /** */
    @Id
    @Column(name = "rare")
    Short rare;

    /** */
    @Id
    @Column(name = "group_no")
    Short groupNo;

    /** */
    @Id
    @Column(name = "item_id")
    Integer itemId;

    /** */
    @Column(name = "item_type")
    Integer itemType;

    /** */
    @Column(name = "item_count")
    Integer itemCount;

    /** */
    @Column(name = "probability")
    Integer probability;

    /** */
    @Column(name = "probability2")
    Integer probability2;

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
     * Returns the rare.
     * 
     * @return the rare
     */
    public Short getRare() {
        return rare;
    }

    /** 
     * Sets the rare.
     * 
     * @param rare the rare
     */
    public void setRare(Short rare) {
        this.rare = rare;
    }

    /** 
     * Returns the groupNo.
     * 
     * @return the groupNo
     */
    public Short getGroupNo() {
        return groupNo;
    }

    /** 
     * Sets the groupNo.
     * 
     * @param groupNo the groupNo
     */
    public void setGroupNo(Short groupNo) {
        this.groupNo = groupNo;
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
     * Returns the itemCount.
     * 
     * @return the itemCount
     */
    public Integer getItemCount() {
        return itemCount;
    }

    /** 
     * Sets the itemCount.
     * 
     * @param itemCount the itemCount
     */
    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
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
     * Returns the probability2.
     * 
     * @return the probability2
     */
    public Integer getProbability2() {
        return probability2;
    }

    /** 
     * Sets the probability2.
     * 
     * @param probability2 the probability2
     */
    public void setProbability2(Integer probability2) {
        this.probability2 = probability2;
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
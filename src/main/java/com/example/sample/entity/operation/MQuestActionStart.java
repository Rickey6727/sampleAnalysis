package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MQuestActionStartListener.class)
@Table(name = "m_quest_action_start")
public class MQuestActionStart {

    /** */
    @Id
    @Column(name = "quest_id")
    Integer questId;

    /** */
    @Column(name = "action_type")
    Integer actionType;

    /** */
    @Column(name = "action_id")
    Integer actionId;

    /** */
    @Column(name = "start_time")
    Integer startTime;

    /** */
    @Column(name = "challenge_time")
    Integer challengeTime;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

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
     * Returns the actionType.
     * 
     * @return the actionType
     */
    public Integer getActionType() {
        return actionType;
    }

    /** 
     * Sets the actionType.
     * 
     * @param actionType the actionType
     */
    public void setActionType(Integer actionType) {
        this.actionType = actionType;
    }

    /** 
     * Returns the actionId.
     * 
     * @return the actionId
     */
    public Integer getActionId() {
        return actionId;
    }

    /** 
     * Sets the actionId.
     * 
     * @param actionId the actionId
     */
    public void setActionId(Integer actionId) {
        this.actionId = actionId;
    }

    /** 
     * Returns the startTime.
     * 
     * @return the startTime
     */
    public Integer getStartTime() {
        return startTime;
    }

    /** 
     * Sets the startTime.
     * 
     * @param startTime the startTime
     */
    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    /** 
     * Returns the challengeTime.
     * 
     * @return the challengeTime
     */
    public Integer getChallengeTime() {
        return challengeTime;
    }

    /** 
     * Sets the challengeTime.
     * 
     * @param challengeTime the challengeTime
     */
    public void setChallengeTime(Integer challengeTime) {
        this.challengeTime = challengeTime;
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
package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MQuestLinkedListener.class)
@Table(name = "m_quest_linked")
public class MQuestLinked {

    /** */
    @Id
    @Column(name = "quest_id")
    Integer questId;

    /** */
    @Id
    @Column(name = "linked_quest_id")
    Integer linkedQuestId;

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
     * Returns the linkedQuestId.
     * 
     * @return the linkedQuestId
     */
    public Integer getLinkedQuestId() {
        return linkedQuestId;
    }

    /** 
     * Sets the linkedQuestId.
     * 
     * @param linkedQuestId the linkedQuestId
     */
    public void setLinkedQuestId(Integer linkedQuestId) {
        this.linkedQuestId = linkedQuestId;
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
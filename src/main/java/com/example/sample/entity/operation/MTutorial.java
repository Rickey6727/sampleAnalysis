package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MTutorialListener.class)
@Table(name = "m_tutorial")
public class MTutorial {

    /** */
    @Id
    @Column(name = "tutorial_id")
    Integer tutorialId;

    /** */
    @Column(name = "tutorial_type")
    Integer tutorialType;

    /** */
    @Column(name = "title")
    String title;

    /** */
    @Column(name = "condition_quest_id")
    Integer conditionQuestId;

    /** */
    @Column(name = "start_date")
    LocalDateTime startDate;

    /** */
    @Column(name = "end_date")
    LocalDateTime endDate;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** */
    @Column(name = "event_flg")
    Boolean eventFlg;

    /** */
    @Column(name = "quest_kind")
    Integer questKind;

    /** */
    @Column(name = "del_flg")
    Integer delFlg;

    /** 
     * Returns the tutorialId.
     * 
     * @return the tutorialId
     */
    public Integer getTutorialId() {
        return tutorialId;
    }

    /** 
     * Sets the tutorialId.
     * 
     * @param tutorialId the tutorialId
     */
    public void setTutorialId(Integer tutorialId) {
        this.tutorialId = tutorialId;
    }

    /** 
     * Returns the tutorialType.
     * 
     * @return the tutorialType
     */
    public Integer getTutorialType() {
        return tutorialType;
    }

    /** 
     * Sets the tutorialType.
     * 
     * @param tutorialType the tutorialType
     */
    public void setTutorialType(Integer tutorialType) {
        this.tutorialType = tutorialType;
    }

    /** 
     * Returns the title.
     * 
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /** 
     * Sets the title.
     * 
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /** 
     * Returns the conditionQuestId.
     * 
     * @return the conditionQuestId
     */
    public Integer getConditionQuestId() {
        return conditionQuestId;
    }

    /** 
     * Sets the conditionQuestId.
     * 
     * @param conditionQuestId the conditionQuestId
     */
    public void setConditionQuestId(Integer conditionQuestId) {
        this.conditionQuestId = conditionQuestId;
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
     * Returns the eventFlg.
     * 
     * @return the eventFlg
     */
    public Boolean getEventFlg() {
        return eventFlg;
    }

    /** 
     * Sets the eventFlg.
     * 
     * @param eventFlg the eventFlg
     */
    public void setEventFlg(Boolean eventFlg) {
        this.eventFlg = eventFlg;
    }

    /** 
     * Returns the questKind.
     * 
     * @return the questKind
     */
    public Integer getQuestKind() {
        return questKind;
    }

    /** 
     * Sets the questKind.
     * 
     * @param questKind the questKind
     */
    public void setQuestKind(Integer questKind) {
        this.questKind = questKind;
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
}
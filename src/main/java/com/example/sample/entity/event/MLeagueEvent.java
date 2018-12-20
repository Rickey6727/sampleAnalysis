package com.example.sample.entity.event;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MLeagueEventListener.class)
@Table(name = "m_league_event")
public class MLeagueEvent {

    /** */
    @Id
    @Column(name = "event_id")
    Integer eventId;

    /** */
    @Column(name = "start_date")
    Timestamp startDate;

    /** */
    @Column(name = "end_date")
    Timestamp endDate;

    /** */
    @Column(name = "base_probability")
    Integer baseProbability;

    /** */
    @Column(name = "helper_facility_id")
    Integer helperFacilityId;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** */
    @Column(name = "start_tutorial_id")
    Integer startTutorialId;

    /** */
    @Column(name = "end_tutorial_id")
    Integer endTutorialId;

    /** */
    @Column(name = "reward_tutorial_id")
    Integer rewardTutorialId;
    
    /** */
    @Column(name = "term")
    Integer term;

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
    public Timestamp getStartDate() {
        return startDate;
    }

    /** 
     * Sets the startDate.
     * 
     * @param startDate the startDate
     */
    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    /** 
     * Returns the endDate.
     * 
     * @return the endDate
     */
    public Timestamp getEndDate() {
        return endDate;
    }

    /** 
     * Sets the endDate.
     * 
     * @param endDate the endDate
     */
    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    /** 
     * Returns the baseProbability.
     * 
     * @return the baseProbability
     */
    public Integer getBaseProbability() {
        return baseProbability;
    }

    /** 
     * Sets the baseProbability.
     * 
     * @param baseProbability the baseProbability
     */
    public void setBaseProbability(Integer baseProbability) {
        this.baseProbability = baseProbability;
    }

    /** 
     * Returns the helperFacilityId.
     * 
     * @return the helperFacilityId
     */
    public Integer getHelperFacilityId() {
        return helperFacilityId;
    }

    /** 
     * Sets the helperFacilityId.
     * 
     * @param helperFacilityId the helperFacilityId
     */
    public void setHelperFacilityId(Integer helperFacilityId) {
        this.helperFacilityId = helperFacilityId;
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
     * Returns the startTutorialId.
     * 
     * @return the startTutorialId
     */
    public Integer getStartTutorialId() {
        return startTutorialId;
    }

    /** 
     * Sets the startTutorialId.
     * 
     * @param startTutorialId the startTutorialId
     */
    public void setStartTutorialId(Integer startTutorialId) {
        this.startTutorialId = startTutorialId;
    }

    /** 
     * Returns the endTutorialId.
     * 
     * @return the endTutorialId
     */
    public Integer getEndTutorialId() {
        return endTutorialId;
    }

    /** 
     * Sets the endTutorialId.
     * 
     * @param endTutorialId the endTutorialId
     */
    public void setEndTutorialId(Integer endTutorialId) {
        this.endTutorialId = endTutorialId;
    }

    /** 
     * Returns the rewardTutorialId.
     * 
     * @return the rewardTutorialId
     */
    public Integer getRewardTutorialId() {
        return rewardTutorialId;
    }

    /** 
     * Sets the rewardTutorialId.
     * 
     * @param rewardTutorialId the rewardTutorialId
     */
    public void setRewardTutorialId(Integer rewardTutorialId) {
        this.rewardTutorialId = rewardTutorialId;
    }
    
    /** 
     * Returns the term.
     * 
     * @return the term
     */
    public Integer getTerm() {
        return term;
    }

    /** 
     * Sets the term.
     * 
     * @param term the term
     */
    public void setTerm(Integer term) {
        this.term = term;
    }
}
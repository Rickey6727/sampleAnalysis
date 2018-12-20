package com.example.sample.entity.event;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MCaptureEventListener.class)
@Table(name = "m_capture_event")
public class MCaptureEvent {

    /** */
    @Id
    @Column(name = "event_id")
    Integer eventId;

    /** */
    @Column(name = "max_stage")
    Integer maxStage;

    /** */
    @Column(name = "start_date")
    Timestamp startDate;

    /** */
    @Column(name = "end_date")
    Timestamp endDate;

    /** */
    @Column(name = "lucky_gacha_id")
    Integer luckyGachaId;

    /** */
    @Column(name = "event_shop_id")
    Integer eventShopId;

    /** */
    @Column(name = "start_tutorial_id")
    Integer startTutorialId;

    /** */
    @Column(name = "end_tutorial_id")
    Integer endTutorialId;

    /** */
    @Column(name = "del_flg")
    Integer delFlg;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;
    
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
     * Returns the maxStage.
     * 
     * @return the maxStage
     */
    public Integer getMaxStage() {
        return maxStage;
    }

    /** 
     * Sets the maxStage.
     * 
     * @param maxStage the maxStage
     */
    public void setMaxStage(Integer maxStage) {
        this.maxStage = maxStage;
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
     * Returns the luckyGachaId.
     * 
     * @return the luckyGachaId
     */
    public Integer getLuckyGachaId() {
        return luckyGachaId;
    }

    /** 
     * Sets the luckyGachaId.
     * 
     * @param luckyGachaId the luckyGachaId
     */
    public void setLuckyGachaId(Integer luckyGachaId) {
        this.luckyGachaId = luckyGachaId;
    }

    /** 
     * Returns the eventShopId.
     * 
     * @return the eventShopId
     */
    public Integer getEventShopId() {
        return eventShopId;
    }

    /** 
     * Sets the eventShopId.
     * 
     * @param eventShopId the eventShopId
     */
    public void setEventShopId(Integer eventShopId) {
        this.eventShopId = eventShopId;
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
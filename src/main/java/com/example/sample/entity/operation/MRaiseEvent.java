package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MRaiseEventListener.class)
@Table(name = "m_raise_event")
public class MRaiseEvent {

    /** */
    @Id
    @Column(name = "event_id")
    Integer eventId;

    /** */
    @Column(name = "present_event_id")
    Integer presentEventId;

    /** */
    @Column(name = "home_banner_back_img")
    String homeBannerBackImg;

    /** */
    @Column(name = "home_banner_img")
    String homeBannerImg;

    /** */
    @Column(name = "care_point")
    Integer carePoint;

    /** */
    @Column(name = "first_bonus_count")
    Integer firstBonusCount;

    /** */
    @Column(name = "start_date")
    LocalDateTime startDate;

    /** */
    @Column(name = "end_date")
    LocalDateTime endDate;

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
     * Returns the presentEventId.
     * 
     * @return the presentEventId
     */
    public Integer getPresentEventId() {
        return presentEventId;
    }

    /** 
     * Sets the presentEventId.
     * 
     * @param presentEventId the presentEventId
     */
    public void setPresentEventId(Integer presentEventId) {
        this.presentEventId = presentEventId;
    }

    /** 
     * Returns the homeBannerBackImg.
     * 
     * @return the homeBannerBackImg
     */
    public String getHomeBannerBackImg() {
        return homeBannerBackImg;
    }

    /** 
     * Sets the homeBannerBackImg.
     * 
     * @param homeBannerBackImg the homeBannerBackImg
     */
    public void setHomeBannerBackImg(String homeBannerBackImg) {
        this.homeBannerBackImg = homeBannerBackImg;
    }

    /** 
     * Returns the homeBannerImg.
     * 
     * @return the homeBannerImg
     */
    public String getHomeBannerImg() {
        return homeBannerImg;
    }

    /** 
     * Sets the homeBannerImg.
     * 
     * @param homeBannerImg the homeBannerImg
     */
    public void setHomeBannerImg(String homeBannerImg) {
        this.homeBannerImg = homeBannerImg;
    }

    /** 
     * Returns the carePoint.
     * 
     * @return the carePoint
     */
    public Integer getCarePoint() {
        return carePoint;
    }

    /** 
     * Sets the carePoint.
     * 
     * @param carePoint the carePoint
     */
    public void setCarePoint(Integer carePoint) {
        this.carePoint = carePoint;
    }

    /** 
     * Returns the firstBonusCount.
     * 
     * @return the firstBonusCount
     */
    public Integer getFirstBonusCount() {
        return firstBonusCount;
    }

    /** 
     * Sets the firstBonusCount.
     * 
     * @param firstBonusCount the firstBonusCount
     */
    public void setFirstBonusCount(Integer firstBonusCount) {
        this.firstBonusCount = firstBonusCount;
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
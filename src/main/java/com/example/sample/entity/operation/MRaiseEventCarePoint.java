package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MRaiseEventCarePointListener.class)
@Table(name = "m_raise_event_care_point")
public class MRaiseEventCarePoint {

    /** */
    @Id
    @Column(name = "event_id")
    Integer eventId;

    /** */
    @Column(name = "min_point")
    Integer minPoint;

    /** */
    @Column(name = "max_point")
    Integer maxPoint;

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
     * Returns the minPoint.
     * 
     * @return the minPoint
     */
    public Integer getMinPoint() {
        return minPoint;
    }

    /** 
     * Sets the minPoint.
     * 
     * @param minPoint the minPoint
     */
    public void setMinPoint(Integer minPoint) {
        this.minPoint = minPoint;
    }

    /** 
     * Returns the maxPoint.
     * 
     * @return the maxPoint
     */
    public Integer getMaxPoint() {
        return maxPoint;
    }

    /** 
     * Sets the maxPoint.
     * 
     * @param maxPoint the maxPoint
     */
    public void setMaxPoint(Integer maxPoint) {
        this.maxPoint = maxPoint;
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
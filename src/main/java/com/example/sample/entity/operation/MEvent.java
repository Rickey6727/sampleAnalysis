package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * m_event
 */
@Entity(listener = MEventListener.class)
@Table(name = "m_event")
public class MEvent {

    /** イベントID */
    @Id
    @Column(name = "event_id")
    Integer eventId;

    /** イベント種別 */
    @Id
    @Column(name = "incident_type")
    Integer incidentType;

    /** イベント関連ID */
    @Column(name = "incident_id")
    Integer incidentId;

    /** 開始日時 */
    @Column(name = "start_date")
    LocalDateTime startDate;

    /** 終了日時 */
    @Column(name = "end_date")
    LocalDateTime endDate;

    /** 削除フラグ */
    @Column(name = "del_flg")
    Integer delFlg;

    /** 登録日時 */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** 更新日時 */
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
     * Returns the incidentType.
     * 
     * @return the incidentType
     */
    public Integer getIncidentType() {
        return incidentType;
    }

    /** 
     * Sets the incidentType.
     * 
     * @param incidentType the incidentType
     */
    public void setIncidentType(Integer incidentType) {
        this.incidentType = incidentType;
    }

    /** 
     * Returns the incidentId.
     * 
     * @return the incidentId
     */
    public Integer getIncidentId() {
        return incidentId;
    }

    /** 
     * Sets the incidentId.
     * 
     * @param incidentId the incidentId
     */
    public void setIncidentId(Integer incidentId) {
        this.incidentId = incidentId;
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
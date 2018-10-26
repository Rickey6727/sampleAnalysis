package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MCheerEventListener.class)
@Table(name = "m_cheer_event")
public class MCheerEvent {

    /** */
    @Id
    @Column(name = "cheer_event_id")
    Integer cheerEventId;

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
    @Column(name = "display_start_date")
    LocalDateTime displayStartDate;

    /** */
    @Column(name = "display_end_date")
    LocalDateTime displayEndDate;

    /** 
     * Returns the cheerEventId.
     * 
     * @return the cheerEventId
     */
    public Integer getCheerEventId() {
        return cheerEventId;
    }

    /** 
     * Sets the cheerEventId.
     * 
     * @param cheerEventId the cheerEventId
     */
    public void setCheerEventId(Integer cheerEventId) {
        this.cheerEventId = cheerEventId;
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
     * Returns the displayStartDate.
     * 
     * @return the displayStartDate
     */
    public LocalDateTime getDisplayStartDate() {
        return displayStartDate;
    }

    /** 
     * Sets the displayStartDate.
     * 
     * @param displayStartDate the displayStartDate
     */
    public void setDisplayStartDate(LocalDateTime displayStartDate) {
        this.displayStartDate = displayStartDate;
    }

    /** 
     * Returns the displayEndDate.
     * 
     * @return the displayEndDate
     */
    public LocalDateTime getDisplayEndDate() {
        return displayEndDate;
    }

    /** 
     * Sets the displayEndDate.
     * 
     * @param displayEndDate the displayEndDate
     */
    public void setDisplayEndDate(LocalDateTime displayEndDate) {
        this.displayEndDate = displayEndDate;
    }
}
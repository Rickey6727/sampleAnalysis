package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MCheerEventDetailListener.class)
@Table(name = "m_cheer_event_detail")
public class MCheerEventDetail {

    /** */
    @Id
    @Column(name = "cheer_event_id")
    Integer cheerEventId;

    /** */
    @Id
    @Column(name = "event_type_id")
    Integer eventTypeId;

    /** */
    @Id
    @Column(name = "condition_order")
    Integer conditionOrder;

    /** */
    @Column(name = "condition_count")
    Integer conditionCount;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

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
     * Returns the eventTypeId.
     * 
     * @return the eventTypeId
     */
    public Integer getEventTypeId() {
        return eventTypeId;
    }

    /** 
     * Sets the eventTypeId.
     * 
     * @param eventTypeId the eventTypeId
     */
    public void setEventTypeId(Integer eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    /** 
     * Returns the conditionOrder.
     * 
     * @return the conditionOrder
     */
    public Integer getConditionOrder() {
        return conditionOrder;
    }

    /** 
     * Sets the conditionOrder.
     * 
     * @param conditionOrder the conditionOrder
     */
    public void setConditionOrder(Integer conditionOrder) {
        this.conditionOrder = conditionOrder;
    }

    /** 
     * Returns the conditionCount.
     * 
     * @return the conditionCount
     */
    public Integer getConditionCount() {
        return conditionCount;
    }

    /** 
     * Sets the conditionCount.
     * 
     * @param conditionCount the conditionCount
     */
    public void setConditionCount(Integer conditionCount) {
        this.conditionCount = conditionCount;
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
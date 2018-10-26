package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MCoinEventBridgeListener.class)
@Table(name = "m_coin_event_bridge")
public class MCoinEventBridge {

    /** */
    @Id
    @Column(name = "event_id")
    Integer eventId;

    /** */
    @Column(name = "first_half_start_date")
    LocalDateTime firstHalfStartDate;

    /** */
    @Column(name = "first_half_end_date")
    LocalDateTime firstHalfEndDate;

    /** */
    @Column(name = "second_half_start_date")
    LocalDateTime secondHalfStartDate;

    /** */
    @Column(name = "second_half_end_date")
    LocalDateTime secondHalfEndDate;

    /** */
    @Column(name = "charge_start_date")
    LocalDateTime chargeStartDate;

    /** */
    @Column(name = "charge_end_date")
    LocalDateTime chargeEndDate;

    /** */
    @Column(name = "charge_condition_1")
    Integer chargeCondition1;

    /** */
    @Column(name = "charge_condition_2")
    Integer chargeCondition2;

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
     * Returns the firstHalfStartDate.
     * 
     * @return the firstHalfStartDate
     */
    public LocalDateTime getFirstHalfStartDate() {
        return firstHalfStartDate;
    }

    /** 
     * Sets the firstHalfStartDate.
     * 
     * @param firstHalfStartDate the firstHalfStartDate
     */
    public void setFirstHalfStartDate(LocalDateTime firstHalfStartDate) {
        this.firstHalfStartDate = firstHalfStartDate;
    }

    /** 
     * Returns the firstHalfEndDate.
     * 
     * @return the firstHalfEndDate
     */
    public LocalDateTime getFirstHalfEndDate() {
        return firstHalfEndDate;
    }

    /** 
     * Sets the firstHalfEndDate.
     * 
     * @param firstHalfEndDate the firstHalfEndDate
     */
    public void setFirstHalfEndDate(LocalDateTime firstHalfEndDate) {
        this.firstHalfEndDate = firstHalfEndDate;
    }

    /** 
     * Returns the secondHalfStartDate.
     * 
     * @return the secondHalfStartDate
     */
    public LocalDateTime getSecondHalfStartDate() {
        return secondHalfStartDate;
    }

    /** 
     * Sets the secondHalfStartDate.
     * 
     * @param secondHalfStartDate the secondHalfStartDate
     */
    public void setSecondHalfStartDate(LocalDateTime secondHalfStartDate) {
        this.secondHalfStartDate = secondHalfStartDate;
    }

    /** 
     * Returns the secondHalfEndDate.
     * 
     * @return the secondHalfEndDate
     */
    public LocalDateTime getSecondHalfEndDate() {
        return secondHalfEndDate;
    }

    /** 
     * Sets the secondHalfEndDate.
     * 
     * @param secondHalfEndDate the secondHalfEndDate
     */
    public void setSecondHalfEndDate(LocalDateTime secondHalfEndDate) {
        this.secondHalfEndDate = secondHalfEndDate;
    }

    /** 
     * Returns the chargeStartDate.
     * 
     * @return the chargeStartDate
     */
    public LocalDateTime getChargeStartDate() {
        return chargeStartDate;
    }

    /** 
     * Sets the chargeStartDate.
     * 
     * @param chargeStartDate the chargeStartDate
     */
    public void setChargeStartDate(LocalDateTime chargeStartDate) {
        this.chargeStartDate = chargeStartDate;
    }

    /** 
     * Returns the chargeEndDate.
     * 
     * @return the chargeEndDate
     */
    public LocalDateTime getChargeEndDate() {
        return chargeEndDate;
    }

    /** 
     * Sets the chargeEndDate.
     * 
     * @param chargeEndDate the chargeEndDate
     */
    public void setChargeEndDate(LocalDateTime chargeEndDate) {
        this.chargeEndDate = chargeEndDate;
    }

    /** 
     * Returns the chargeCondition1.
     * 
     * @return the chargeCondition1
     */
    public Integer getChargeCondition1() {
        return chargeCondition1;
    }

    /** 
     * Sets the chargeCondition1.
     * 
     * @param chargeCondition1 the chargeCondition1
     */
    public void setChargeCondition1(Integer chargeCondition1) {
        this.chargeCondition1 = chargeCondition1;
    }

    /** 
     * Returns the chargeCondition2.
     * 
     * @return the chargeCondition2
     */
    public Integer getChargeCondition2() {
        return chargeCondition2;
    }

    /** 
     * Sets the chargeCondition2.
     * 
     * @param chargeCondition2 the chargeCondition2
     */
    public void setChargeCondition2(Integer chargeCondition2) {
        this.chargeCondition2 = chargeCondition2;
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
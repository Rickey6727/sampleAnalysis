package com.example.sample.entity.operation;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MRaiseEventExchangeListener.class)
@Table(name = "m_raise_event_exchange")
public class MRaiseEventExchange {

    /** */
    @Id
    @Column(name = "event_id")
    Integer eventId;

    /** */
    @Id
    @Column(name = "exchange_no")
    Short exchangeNo;

    /** */
    @Column(name = "exchange_id")
    Integer exchangeId;

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
     * Returns the exchangeNo.
     * 
     * @return the exchangeNo
     */
    public Short getExchangeNo() {
        return exchangeNo;
    }

    /** 
     * Sets the exchangeNo.
     * 
     * @param exchangeNo the exchangeNo
     */
    public void setExchangeNo(Short exchangeNo) {
        this.exchangeNo = exchangeNo;
    }

    /** 
     * Returns the exchangeId.
     * 
     * @return the exchangeId
     */
    public Integer getExchangeId() {
        return exchangeId;
    }

    /** 
     * Sets the exchangeId.
     * 
     * @param exchangeId the exchangeId
     */
    public void setExchangeId(Integer exchangeId) {
        this.exchangeId = exchangeId;
    }
}
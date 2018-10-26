package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TEventCoinHistoryListener.class)
@Table(name = "t_event_coin_history")
public class TEventCoinHistory {

    /** */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "serial_id")
    Long serialId;

    /** */
    @Column(name = "event_id")
    Integer eventId;

    /** */
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Column(name = "native_type")
    Integer nativeType;

    /** */
    @Column(name = "transaction_amount")
    Integer transactionAmount;

    /** */
    @Column(name = "transaction_cd")
    Integer transactionCd;

    /** */
    @Column(name = "transaction_time")
    LocalDateTime transactionTime;

    /** 
     * Returns the serialId.
     * 
     * @return the serialId
     */
    public Long getSerialId() {
        return serialId;
    }

    /** 
     * Sets the serialId.
     * 
     * @param serialId the serialId
     */
    public void setSerialId(Long serialId) {
        this.serialId = serialId;
    }

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
     * Returns the accountId.
     * 
     * @return the accountId
     */
    public Integer getAccountId() {
        return accountId;
    }

    /** 
     * Sets the accountId.
     * 
     * @param accountId the accountId
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    /** 
     * Returns the nativeType.
     * 
     * @return the nativeType
     */
    public Integer getNativeType() {
        return nativeType;
    }

    /** 
     * Sets the nativeType.
     * 
     * @param nativeType the nativeType
     */
    public void setNativeType(Integer nativeType) {
        this.nativeType = nativeType;
    }

    /** 
     * Returns the transactionAmount.
     * 
     * @return the transactionAmount
     */
    public Integer getTransactionAmount() {
        return transactionAmount;
    }

    /** 
     * Sets the transactionAmount.
     * 
     * @param transactionAmount the transactionAmount
     */
    public void setTransactionAmount(Integer transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    /** 
     * Returns the transactionCd.
     * 
     * @return the transactionCd
     */
    public Integer getTransactionCd() {
        return transactionCd;
    }

    /** 
     * Sets the transactionCd.
     * 
     * @param transactionCd the transactionCd
     */
    public void setTransactionCd(Integer transactionCd) {
        this.transactionCd = transactionCd;
    }

    /** 
     * Returns the transactionTime.
     * 
     * @return the transactionTime
     */
    public LocalDateTime getTransactionTime() {
        return transactionTime;
    }

    /** 
     * Sets the transactionTime.
     * 
     * @param transactionTime the transactionTime
     */
    public void setTransactionTime(LocalDateTime transactionTime) {
        this.transactionTime = transactionTime;
    }
}
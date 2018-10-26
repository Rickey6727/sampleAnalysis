package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MExchangeListener.class)
@Table(name = "m_exchange")
public class MExchange {

    /** */
    @Id
    @Column(name = "exchange_id")
    Integer exchangeId;

    /** */
    @Column(name = "before_exchange_id")
    Integer beforeExchangeId;

    /** */
    @Column(name = "after_exchange_id")
    Integer afterExchangeId;

    /** */
    @Column(name = "exchange_flg")
    Integer exchangeFlg;

    /** */
    @Column(name = "retry_flg")
    Integer retryFlg;

    /** */
    @Column(name = "mobile_exchange_flg")
    Integer mobileExchangeFlg;

    /** */
    @Column(name = "start_date")
    LocalDateTime startDate;

    /** */
    @Column(name = "end_date")
    LocalDateTime endDate;

    /** */
    @Column(name = "non_repetition_flg")
    Integer nonRepetitionFlg;

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

    /** 
     * Returns the beforeExchangeId.
     * 
     * @return the beforeExchangeId
     */
    public Integer getBeforeExchangeId() {
        return beforeExchangeId;
    }

    /** 
     * Sets the beforeExchangeId.
     * 
     * @param beforeExchangeId the beforeExchangeId
     */
    public void setBeforeExchangeId(Integer beforeExchangeId) {
        this.beforeExchangeId = beforeExchangeId;
    }

    /** 
     * Returns the afterExchangeId.
     * 
     * @return the afterExchangeId
     */
    public Integer getAfterExchangeId() {
        return afterExchangeId;
    }

    /** 
     * Sets the afterExchangeId.
     * 
     * @param afterExchangeId the afterExchangeId
     */
    public void setAfterExchangeId(Integer afterExchangeId) {
        this.afterExchangeId = afterExchangeId;
    }

    /** 
     * Returns the exchangeFlg.
     * 
     * @return the exchangeFlg
     */
    public Integer getExchangeFlg() {
        return exchangeFlg;
    }

    /** 
     * Sets the exchangeFlg.
     * 
     * @param exchangeFlg the exchangeFlg
     */
    public void setExchangeFlg(Integer exchangeFlg) {
        this.exchangeFlg = exchangeFlg;
    }

    /** 
     * Returns the retryFlg.
     * 
     * @return the retryFlg
     */
    public Integer getRetryFlg() {
        return retryFlg;
    }

    /** 
     * Sets the retryFlg.
     * 
     * @param retryFlg the retryFlg
     */
    public void setRetryFlg(Integer retryFlg) {
        this.retryFlg = retryFlg;
    }

    /** 
     * Returns the mobileExchangeFlg.
     * 
     * @return the mobileExchangeFlg
     */
    public Integer getMobileExchangeFlg() {
        return mobileExchangeFlg;
    }

    /** 
     * Sets the mobileExchangeFlg.
     * 
     * @param mobileExchangeFlg the mobileExchangeFlg
     */
    public void setMobileExchangeFlg(Integer mobileExchangeFlg) {
        this.mobileExchangeFlg = mobileExchangeFlg;
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
     * Returns the nonRepetitionFlg.
     * 
     * @return the nonRepetitionFlg
     */
    public Integer getNonRepetitionFlg() {
        return nonRepetitionFlg;
    }

    /** 
     * Sets the nonRepetitionFlg.
     * 
     * @param nonRepetitionFlg the nonRepetitionFlg
     */
    public void setNonRepetitionFlg(Integer nonRepetitionFlg) {
        this.nonRepetitionFlg = nonRepetitionFlg;
    }
}
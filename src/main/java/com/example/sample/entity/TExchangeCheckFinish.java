package com.example.sample.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TExchangeCheckFinishListener.class)
@Table(name = "t_exchange_check_finish")
public class TExchangeCheckFinish {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Id
    @Column(name = "exchange_id")
    Integer exchangeId;

    /** */
    @Column(name = "exchange_date")
    LocalDateTime exchangeDate;

    /** */
    @Column(name = "medium_type")
    Integer mediumType;

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
     * Returns the exchangeDate.
     * 
     * @return the exchangeDate
     */
    public LocalDateTime getExchangeDate() {
        return exchangeDate;
    }

    /** 
     * Sets the exchangeDate.
     * 
     * @param exchangeDate the exchangeDate
     */
    public void setExchangeDate(LocalDateTime exchangeDate) {
        this.exchangeDate = exchangeDate;
    }

    /** 
     * Returns the mediumType.
     * 
     * @return the mediumType
     */
    public Integer getMediumType() {
        return mediumType;
    }

    /** 
     * Sets the mediumType.
     * 
     * @param mediumType the mediumType
     */
    public void setMediumType(Integer mediumType) {
        this.mediumType = mediumType;
    }
}
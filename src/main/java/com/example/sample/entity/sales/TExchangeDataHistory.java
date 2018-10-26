package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TExchangeDataHistoryListener.class)
@Table(name = "t_exchange_data_history")
public class TExchangeDataHistory {

    /** */
    @Column(name = "exchange_time")
    LocalDateTime exchangeTime;

    /** */
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Column(name = "exchange_id")
    Integer exchangeId;

    /** */
    @Column(name = "device_type")
    Integer deviceType;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** 
     * Returns the exchangeTime.
     * 
     * @return the exchangeTime
     */
    public LocalDateTime getExchangeTime() {
        return exchangeTime;
    }

    /** 
     * Sets the exchangeTime.
     * 
     * @param exchangeTime the exchangeTime
     */
    public void setExchangeTime(LocalDateTime exchangeTime) {
        this.exchangeTime = exchangeTime;
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
     * Returns the deviceType.
     * 
     * @return the deviceType
     */
    public Integer getDeviceType() {
        return deviceType;
    }

    /** 
     * Sets the deviceType.
     * 
     * @param deviceType the deviceType
     */
    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
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
}
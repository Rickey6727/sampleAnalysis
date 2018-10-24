package com.example.sample.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TDeviceChangeHistoryListener.class)
@Table(name = "t_device_change_history")
public class TDeviceChangeHistory {

    /** */
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Column(name = "before_alliance_type")
    Integer beforeAllianceType;

    /** */
    @Column(name = "after_alliance_type")
    Integer afterAllianceType;

    /** */
    @Column(name = "clear_g_coin_amount")
    Integer clearGCoinAmount;

    /** */
    @Column(name = "change_date")
    LocalDateTime changeDate;

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
     * Returns the beforeAllianceType.
     * 
     * @return the beforeAllianceType
     */
    public Integer getBeforeAllianceType() {
        return beforeAllianceType;
    }

    /** 
     * Sets the beforeAllianceType.
     * 
     * @param beforeAllianceType the beforeAllianceType
     */
    public void setBeforeAllianceType(Integer beforeAllianceType) {
        this.beforeAllianceType = beforeAllianceType;
    }

    /** 
     * Returns the afterAllianceType.
     * 
     * @return the afterAllianceType
     */
    public Integer getAfterAllianceType() {
        return afterAllianceType;
    }

    /** 
     * Sets the afterAllianceType.
     * 
     * @param afterAllianceType the afterAllianceType
     */
    public void setAfterAllianceType(Integer afterAllianceType) {
        this.afterAllianceType = afterAllianceType;
    }

    /** 
     * Returns the clearGCoinAmount.
     * 
     * @return the clearGCoinAmount
     */
    public Integer getClearGCoinAmount() {
        return clearGCoinAmount;
    }

    /** 
     * Sets the clearGCoinAmount.
     * 
     * @param clearGCoinAmount the clearGCoinAmount
     */
    public void setClearGCoinAmount(Integer clearGCoinAmount) {
        this.clearGCoinAmount = clearGCoinAmount;
    }

    /** 
     * Returns the changeDate.
     * 
     * @return the changeDate
     */
    public LocalDateTime getChangeDate() {
        return changeDate;
    }

    /** 
     * Sets the changeDate.
     * 
     * @param changeDate the changeDate
     */
    public void setChangeDate(LocalDateTime changeDate) {
        this.changeDate = changeDate;
    }
}
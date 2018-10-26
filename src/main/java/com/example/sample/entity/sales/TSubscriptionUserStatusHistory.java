package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TSubscriptionUserStatusHistoryListener.class)
@Table(name = "t_subscription_user_status_history")
public class TSubscriptionUserStatusHistory {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Column(name = "user_status")
    Integer userStatus;

    /** */
    @Column(name = "continuous_num")
    Integer continuousNum;

    /** */
    @Column(name = "native_type")
    Integer nativeType;

    /** */
    @Column(name = "receipt_data")
    String receiptData;

    /** */
    @Column(name = "join_period")
    LocalDateTime joinPeriod;

    /** */
    @Column(name = "limit_period")
    LocalDateTime limitPeriod;

    /** */
    @Id
    @Column(name = "created_date")
    LocalDateTime createdDate;

    /** */
    @Column(name = "updated_date")
    LocalDateTime updatedDate;

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
     * Returns the userStatus.
     * 
     * @return the userStatus
     */
    public Integer getUserStatus() {
        return userStatus;
    }

    /** 
     * Sets the userStatus.
     * 
     * @param userStatus the userStatus
     */
    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    /** 
     * Returns the continuousNum.
     * 
     * @return the continuousNum
     */
    public Integer getContinuousNum() {
        return continuousNum;
    }

    /** 
     * Sets the continuousNum.
     * 
     * @param continuousNum the continuousNum
     */
    public void setContinuousNum(Integer continuousNum) {
        this.continuousNum = continuousNum;
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
     * Returns the receiptData.
     * 
     * @return the receiptData
     */
    public String getReceiptData() {
        return receiptData;
    }

    /** 
     * Sets the receiptData.
     * 
     * @param receiptData the receiptData
     */
    public void setReceiptData(String receiptData) {
        this.receiptData = receiptData;
    }

    /** 
     * Returns the joinPeriod.
     * 
     * @return the joinPeriod
     */
    public LocalDateTime getJoinPeriod() {
        return joinPeriod;
    }

    /** 
     * Sets the joinPeriod.
     * 
     * @param joinPeriod the joinPeriod
     */
    public void setJoinPeriod(LocalDateTime joinPeriod) {
        this.joinPeriod = joinPeriod;
    }

    /** 
     * Returns the limitPeriod.
     * 
     * @return the limitPeriod
     */
    public LocalDateTime getLimitPeriod() {
        return limitPeriod;
    }

    /** 
     * Sets the limitPeriod.
     * 
     * @param limitPeriod the limitPeriod
     */
    public void setLimitPeriod(LocalDateTime limitPeriod) {
        this.limitPeriod = limitPeriod;
    }

    /** 
     * Returns the createdDate.
     * 
     * @return the createdDate
     */
    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    /** 
     * Sets the createdDate.
     * 
     * @param createdDate the createdDate
     */
    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    /** 
     * Returns the updatedDate.
     * 
     * @return the updatedDate
     */
    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    /** 
     * Sets the updatedDate.
     * 
     * @param updatedDate the updatedDate
     */
    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }
}
package com.example.sample.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TPresentBoxLimitedTime89Listener.class)
@Table(name = "t_present_box_limited_time_89")
public class TPresentBoxLimitedTime89 {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Id
    @Column(name = "account_order_id")
    Integer accountOrderId;

    /** */
    @Column(name = "limited_time_date")
    LocalDateTime limitedTimeDate;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

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
     * Returns the accountOrderId.
     * 
     * @return the accountOrderId
     */
    public Integer getAccountOrderId() {
        return accountOrderId;
    }

    /** 
     * Sets the accountOrderId.
     * 
     * @param accountOrderId the accountOrderId
     */
    public void setAccountOrderId(Integer accountOrderId) {
        this.accountOrderId = accountOrderId;
    }

    /** 
     * Returns the limitedTimeDate.
     * 
     * @return the limitedTimeDate
     */
    public LocalDateTime getLimitedTimeDate() {
        return limitedTimeDate;
    }

    /** 
     * Sets the limitedTimeDate.
     * 
     * @param limitedTimeDate the limitedTimeDate
     */
    public void setLimitedTimeDate(LocalDateTime limitedTimeDate) {
        this.limitedTimeDate = limitedTimeDate;
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
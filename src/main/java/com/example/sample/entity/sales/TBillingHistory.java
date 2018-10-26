package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TBillingHistoryListener.class)
@Table(name = "t_billing_history")
public class TBillingHistory {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Id
    @Column(name = "transaction_id")
    Long transactionId;

    /** */
    @Column(name = "billing_id")
    Integer billingId;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

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
     * Returns the transactionId.
     * 
     * @return the transactionId
     */
    public Long getTransactionId() {
        return transactionId;
    }

    /** 
     * Sets the transactionId.
     * 
     * @param transactionId the transactionId
     */
    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    /** 
     * Returns the billingId.
     * 
     * @return the billingId
     */
    public Integer getBillingId() {
        return billingId;
    }

    /** 
     * Sets the billingId.
     * 
     * @param billingId the billingId
     */
    public void setBillingId(Integer billingId) {
        this.billingId = billingId;
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
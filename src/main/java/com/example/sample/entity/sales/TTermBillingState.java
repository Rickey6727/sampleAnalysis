package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TTermBillingStateListener.class)
@Table(name = "t_term_billing_state")
public class TTermBillingState {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Id
    @Column(name = "term_type")
    Integer termType;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** */
    @Column(name = "earned_date")
    LocalDateTime earnedDate;

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
     * Returns the termType.
     * 
     * @return the termType
     */
    public Integer getTermType() {
        return termType;
    }

    /** 
     * Sets the termType.
     * 
     * @param termType the termType
     */
    public void setTermType(Integer termType) {
        this.termType = termType;
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

    /** 
     * Returns the earnedDate.
     * 
     * @return the earnedDate
     */
    public LocalDateTime getEarnedDate() {
        return earnedDate;
    }

    /** 
     * Sets the earnedDate.
     * 
     * @param earnedDate the earnedDate
     */
    public void setEarnedDate(LocalDateTime earnedDate) {
        this.earnedDate = earnedDate;
    }
}
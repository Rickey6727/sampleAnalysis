package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TTermBillingHistoryListener.class)
@Table(name = "t_term_billing_history")
public class TTermBillingHistory {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Id
    @Column(name = "earned_date")
    LocalDateTime earnedDate;

    /** */
    @Column(name = "provided_count")
    Integer providedCount;

    /** */
    @Column(name = "last_provided_date")
    LocalDateTime lastProvidedDate;

    /** */
    @Column(name = "last_popup_show")
    Short lastPopupShow;

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

    /** 
     * Returns the providedCount.
     * 
     * @return the providedCount
     */
    public Integer getProvidedCount() {
        return providedCount;
    }

    /** 
     * Sets the providedCount.
     * 
     * @param providedCount the providedCount
     */
    public void setProvidedCount(Integer providedCount) {
        this.providedCount = providedCount;
    }

    /** 
     * Returns the lastProvidedDate.
     * 
     * @return the lastProvidedDate
     */
    public LocalDateTime getLastProvidedDate() {
        return lastProvidedDate;
    }

    /** 
     * Sets the lastProvidedDate.
     * 
     * @param lastProvidedDate the lastProvidedDate
     */
    public void setLastProvidedDate(LocalDateTime lastProvidedDate) {
        this.lastProvidedDate = lastProvidedDate;
    }

    /** 
     * Returns the lastPopupShow.
     * 
     * @return the lastPopupShow
     */
    public Short getLastPopupShow() {
        return lastPopupShow;
    }

    /** 
     * Sets the lastPopupShow.
     * 
     * @param lastPopupShow the lastPopupShow
     */
    public void setLastPopupShow(Short lastPopupShow) {
        this.lastPopupShow = lastPopupShow;
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
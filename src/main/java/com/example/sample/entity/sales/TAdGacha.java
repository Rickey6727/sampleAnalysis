package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TAdGachaListener.class)
@Table(name = "t_ad_gacha")
public class TAdGacha {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Column(name = "display_state")
    Integer displayState;

    /** */
    @Column(name = "start_date")
    LocalDateTime startDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** */
    @Column(name = "is_ignoring")
    Boolean isIgnoring;

    /** */
    @Column(name = "continuous_ignore_count")
    Integer continuousIgnoreCount;

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
     * Returns the displayState.
     * 
     * @return the displayState
     */
    public Integer getDisplayState() {
        return displayState;
    }

    /** 
     * Sets the displayState.
     * 
     * @param displayState the displayState
     */
    public void setDisplayState(Integer displayState) {
        this.displayState = displayState;
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
     * Returns the isIgnoring.
     * 
     * @return the isIgnoring
     */
    public Boolean getIsIgnoring() {
        return isIgnoring;
    }

    /** 
     * Sets the isIgnoring.
     * 
     * @param isIgnoring the isIgnoring
     */
    public void setIsIgnoring(Boolean isIgnoring) {
        this.isIgnoring = isIgnoring;
    }

    /** 
     * Returns the continuousIgnoreCount.
     * 
     * @return the continuousIgnoreCount
     */
    public Integer getContinuousIgnoreCount() {
        return continuousIgnoreCount;
    }

    /** 
     * Sets the continuousIgnoreCount.
     * 
     * @param continuousIgnoreCount the continuousIgnoreCount
     */
    public void setContinuousIgnoreCount(Integer continuousIgnoreCount) {
        this.continuousIgnoreCount = continuousIgnoreCount;
    }
}
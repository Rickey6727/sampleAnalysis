package com.example.sample.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TSupportItemStatusOfCheerListener.class)
@Table(name = "t_support_item_status_of_cheer")
public class TSupportItemStatusOfCheer {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Id
    @Column(name = "support_item_id")
    Integer supportItemId;

    /** */
    @Column(name = "use_count")
    Integer useCount;

    /** */
    @Column(name = "end_date")
    LocalDateTime endDate;

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
     * Returns the supportItemId.
     * 
     * @return the supportItemId
     */
    public Integer getSupportItemId() {
        return supportItemId;
    }

    /** 
     * Sets the supportItemId.
     * 
     * @param supportItemId the supportItemId
     */
    public void setSupportItemId(Integer supportItemId) {
        this.supportItemId = supportItemId;
    }

    /** 
     * Returns the useCount.
     * 
     * @return the useCount
     */
    public Integer getUseCount() {
        return useCount;
    }

    /** 
     * Sets the useCount.
     * 
     * @param useCount the useCount
     */
    public void setUseCount(Integer useCount) {
        this.useCount = useCount;
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
}
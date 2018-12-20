package com.example.sample.entity.history;

import java.time.LocalDate;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TLoginHistoryListener.class)
@Table(name = "t_login_history")
public class TLoginHistory {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Id
    @Column(name = "login_date")
    LocalDate loginDate;
    
    /** */
    @Id
    @Column(name = "count")
    Integer totalCount;

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
     * Returns the loginDate.
     * 
     * @return the loginDate
     */
    public LocalDate getLoginDate() {
        return loginDate;
    }

    /** 
     * Sets the loginDate.
     * 
     * @param loginDate the loginDate
     */
    public void setLoginDate(LocalDate loginDate) {
        this.loginDate = loginDate;
    }
    
    /** 
     * Returns the totalCount.
     * 
     * @return the totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /** 
     * Sets the totalCount.
     * 
     * @param totalCount the totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
}
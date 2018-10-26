package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TBeginnerBillingListener.class)
@Table(name = "t_beginner_billing")
public class TBeginnerBilling {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Column(name = "create_time")
    LocalDateTime createTime;

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
     * Returns the createTime.
     * 
     * @return the createTime
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /** 
     * Sets the createTime.
     * 
     * @param createTime the createTime
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
}
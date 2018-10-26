package com.example.sample.entity.sales;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TPaidBallListener.class)
@Table(name = "t_paid_ball")
public class TPaidBall {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Column(name = "paid_ball")
    Integer paidBall;

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
     * Returns the paidBall.
     * 
     * @return the paidBall
     */
    public Integer getPaidBall() {
        return paidBall;
    }

    /** 
     * Sets the paidBall.
     * 
     * @param paidBall the paidBall
     */
    public void setPaidBall(Integer paidBall) {
        this.paidBall = paidBall;
    }
}
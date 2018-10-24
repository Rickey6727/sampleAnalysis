package com.example.sample.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TAdCodeListener.class)
@Table(name = "t_ad_code")
public class TAdCode {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Column(name = "ac")
    String ac;

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
     * Returns the ac.
     * 
     * @return the ac
     */
    public String getAc() {
        return ac;
    }

    /** 
     * Sets the ac.
     * 
     * @param ac the ac
     */
    public void setAc(String ac) {
        this.ac = ac;
    }
}
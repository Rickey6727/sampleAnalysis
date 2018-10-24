package com.example.sample.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TNativeInviteFailHistoryListener.class)
@Table(name = "t_native_invite_fail_history")
public class TNativeInviteFailHistory {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Column(name = "input_invite_id")
    String inputInviteId;

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
     * Returns the inputInviteId.
     * 
     * @return the inputInviteId
     */
    public String getInputInviteId() {
        return inputInviteId;
    }

    /** 
     * Sets the inputInviteId.
     * 
     * @param inputInviteId the inputInviteId
     */
    public void setInputInviteId(String inputInviteId) {
        this.inputInviteId = inputInviteId;
    }
}
package com.example.sample.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TNativeInviteListener.class)
@Table(name = "t_native_invite")
public class TNativeInvite {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Column(name = "alliance_type")
    Integer allianceType;

    /** */
    @Column(name = "invite_id")
    String inviteId;

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
     * Returns the allianceType.
     * 
     * @return the allianceType
     */
    public Integer getAllianceType() {
        return allianceType;
    }

    /** 
     * Sets the allianceType.
     * 
     * @param allianceType the allianceType
     */
    public void setAllianceType(Integer allianceType) {
        this.allianceType = allianceType;
    }

    /** 
     * Returns the inviteId.
     * 
     * @return the inviteId
     */
    public String getInviteId() {
        return inviteId;
    }

    /** 
     * Sets the inviteId.
     * 
     * @param inviteId the inviteId
     */
    public void setInviteId(String inviteId) {
        this.inviteId = inviteId;
    }
}
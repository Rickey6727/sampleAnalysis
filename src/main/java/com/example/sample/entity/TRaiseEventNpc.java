package com.example.sample.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TRaiseEventNpcListener.class)
@Table(name = "t_raise_event_npc")
public class TRaiseEventNpc {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Column(name = "rare")
    Short rare;

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
     * Returns the rare.
     * 
     * @return the rare
     */
    public Short getRare() {
        return rare;
    }

    /** 
     * Sets the rare.
     * 
     * @param rare the rare
     */
    public void setRare(Short rare) {
        this.rare = rare;
    }
}
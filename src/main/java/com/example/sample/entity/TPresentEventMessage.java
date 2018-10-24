package com.example.sample.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TPresentEventMessageListener.class)
@Table(name = "t_present_event_message")
public class TPresentEventMessage {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Id
    @Column(name = "m_account_id")
    Integer mAccountId;

    /** */
    @Column(name = "event_id")
    Integer eventId;

    /** */
    @Column(name = "own_flg")
    Boolean ownFlg;

    /** */
    @Column(name = "add_date")
    LocalDateTime addDate;

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
     * Returns the mAccountId.
     * 
     * @return the mAccountId
     */
    public Integer getMAccountId() {
        return mAccountId;
    }

    /** 
     * Sets the mAccountId.
     * 
     * @param mAccountId the mAccountId
     */
    public void setMAccountId(Integer mAccountId) {
        this.mAccountId = mAccountId;
    }

    /** 
     * Returns the eventId.
     * 
     * @return the eventId
     */
    public Integer getEventId() {
        return eventId;
    }

    /** 
     * Sets the eventId.
     * 
     * @param eventId the eventId
     */
    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    /** 
     * Returns the ownFlg.
     * 
     * @return the ownFlg
     */
    public Boolean getOwnFlg() {
        return ownFlg;
    }

    /** 
     * Sets the ownFlg.
     * 
     * @param ownFlg the ownFlg
     */
    public void setOwnFlg(Boolean ownFlg) {
        this.ownFlg = ownFlg;
    }

    /** 
     * Returns the addDate.
     * 
     * @return the addDate
     */
    public LocalDateTime getAddDate() {
        return addDate;
    }

    /** 
     * Sets the addDate.
     * 
     * @param addDate the addDate
     */
    public void setAddDate(LocalDateTime addDate) {
        this.addDate = addDate;
    }
}
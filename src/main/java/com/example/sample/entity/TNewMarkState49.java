package com.example.sample.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TNewMarkState49Listener.class)
@Table(name = "t_new_mark_state_49")
public class TNewMarkState49 {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Id
    @Column(name = "screen_id")
    Integer screenId;

    /** */
    @Id
    @Column(name = "tab_id")
    Integer tabId;

    /** */
    @Column(name = "last_date")
    LocalDateTime lastDate;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

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
     * Returns the screenId.
     * 
     * @return the screenId
     */
    public Integer getScreenId() {
        return screenId;
    }

    /** 
     * Sets the screenId.
     * 
     * @param screenId the screenId
     */
    public void setScreenId(Integer screenId) {
        this.screenId = screenId;
    }

    /** 
     * Returns the tabId.
     * 
     * @return the tabId
     */
    public Integer getTabId() {
        return tabId;
    }

    /** 
     * Sets the tabId.
     * 
     * @param tabId the tabId
     */
    public void setTabId(Integer tabId) {
        this.tabId = tabId;
    }

    /** 
     * Returns the lastDate.
     * 
     * @return the lastDate
     */
    public LocalDateTime getLastDate() {
        return lastDate;
    }

    /** 
     * Sets the lastDate.
     * 
     * @param lastDate the lastDate
     */
    public void setLastDate(LocalDateTime lastDate) {
        this.lastDate = lastDate;
    }

    /** 
     * Returns the createDate.
     * 
     * @return the createDate
     */
    public LocalDateTime getCreateDate() {
        return createDate;
    }

    /** 
     * Sets the createDate.
     * 
     * @param createDate the createDate
     */
    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
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
}
package com.example.sample.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TComebackListener.class)
@Table(name = "t_comeback")
public class TComeback {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Id
    @Column(name = "login_id")
    Integer loginId;

    /** */
    @Column(name = "execute_state")
    Integer executeState;

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
     * Returns the loginId.
     * 
     * @return the loginId
     */
    public Integer getLoginId() {
        return loginId;
    }

    /** 
     * Sets the loginId.
     * 
     * @param loginId the loginId
     */
    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }

    /** 
     * Returns the executeState.
     * 
     * @return the executeState
     */
    public Integer getExecuteState() {
        return executeState;
    }

    /** 
     * Sets the executeState.
     * 
     * @param executeState the executeState
     */
    public void setExecuteState(Integer executeState) {
        this.executeState = executeState;
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
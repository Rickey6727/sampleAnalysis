package com.example.sample.entity.game;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TWoolStateListener.class)
@Table(name = "t_wool_state")
public class TWoolState {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Column(name = "acquire_point")
    Integer acquirePoint;

    /** */
    @Column(name = "wool_count")
    Integer woolCount;

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
     * Returns the acquirePoint.
     * 
     * @return the acquirePoint
     */
    public Integer getAcquirePoint() {
        return acquirePoint;
    }

    /** 
     * Sets the acquirePoint.
     * 
     * @param acquirePoint the acquirePoint
     */
    public void setAcquirePoint(Integer acquirePoint) {
        this.acquirePoint = acquirePoint;
    }

    /** 
     * Returns the woolCount.
     * 
     * @return the woolCount
     */
    public Integer getWoolCount() {
        return woolCount;
    }

    /** 
     * Sets the woolCount.
     * 
     * @param woolCount the woolCount
     */
    public void setWoolCount(Integer woolCount) {
        this.woolCount = woolCount;
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
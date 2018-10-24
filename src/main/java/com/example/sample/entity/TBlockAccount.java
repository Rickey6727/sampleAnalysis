package com.example.sample.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TBlockAccountListener.class)
@Table(name = "t_block_account")
public class TBlockAccount {

    /** */
    @Id
    @Column(name = "blocker_account_id")
    Integer blockerAccountId;

    /** */
    @Id
    @Column(name = "blocked_account_id")
    Integer blockedAccountId;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the blockerAccountId.
     * 
     * @return the blockerAccountId
     */
    public Integer getBlockerAccountId() {
        return blockerAccountId;
    }

    /** 
     * Sets the blockerAccountId.
     * 
     * @param blockerAccountId the blockerAccountId
     */
    public void setBlockerAccountId(Integer blockerAccountId) {
        this.blockerAccountId = blockerAccountId;
    }

    /** 
     * Returns the blockedAccountId.
     * 
     * @return the blockedAccountId
     */
    public Integer getBlockedAccountId() {
        return blockedAccountId;
    }

    /** 
     * Sets the blockedAccountId.
     * 
     * @param blockedAccountId the blockedAccountId
     */
    public void setBlockedAccountId(Integer blockedAccountId) {
        this.blockedAccountId = blockedAccountId;
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
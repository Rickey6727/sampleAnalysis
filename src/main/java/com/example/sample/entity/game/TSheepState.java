package com.example.sample.entity.game;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TSheepStateListener.class)
@Table(name = "t_sheep_state")
public class TSheepState {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Id
    @Column(name = "order_id")
    Integer orderId;

    /** */
    @Column(name = "sheep_id")
    Integer sheepId;

    /** */
    @Column(name = "sheep_birth_time")
    LocalDateTime sheepBirthTime;

    /** */
    @Column(name = "del_flg")
    Integer delFlg;

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
     * Returns the orderId.
     * 
     * @return the orderId
     */
    public Integer getOrderId() {
        return orderId;
    }

    /** 
     * Sets the orderId.
     * 
     * @param orderId the orderId
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /** 
     * Returns the sheepId.
     * 
     * @return the sheepId
     */
    public Integer getSheepId() {
        return sheepId;
    }

    /** 
     * Sets the sheepId.
     * 
     * @param sheepId the sheepId
     */
    public void setSheepId(Integer sheepId) {
        this.sheepId = sheepId;
    }

    /** 
     * Returns the sheepBirthTime.
     * 
     * @return the sheepBirthTime
     */
    public LocalDateTime getSheepBirthTime() {
        return sheepBirthTime;
    }

    /** 
     * Sets the sheepBirthTime.
     * 
     * @param sheepBirthTime the sheepBirthTime
     */
    public void setSheepBirthTime(LocalDateTime sheepBirthTime) {
        this.sheepBirthTime = sheepBirthTime;
    }

    /** 
     * Returns the delFlg.
     * 
     * @return the delFlg
     */
    public Integer getDelFlg() {
        return delFlg;
    }

    /** 
     * Sets the delFlg.
     * 
     * @param delFlg the delFlg
     */
    public void setDelFlg(Integer delFlg) {
        this.delFlg = delFlg;
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
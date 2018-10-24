package com.example.sample.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TEffectItemOwnListener.class)
@Table(name = "t_effect_item_own")
public class TEffectItemOwn {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Id
    @Column(name = "item_id")
    Integer itemId;

    /** */
    @Column(name = "used_flg")
    Integer usedFlg;

    /** */
    @Column(name = "used_date")
    LocalDateTime usedDate;

    /** */
    @Id
    @Column(name = "effect_end_date")
    LocalDateTime effectEndDate;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** */
    @Column(name = "effect_start_date")
    LocalDateTime effectStartDate;

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
     * Returns the itemId.
     * 
     * @return the itemId
     */
    public Integer getItemId() {
        return itemId;
    }

    /** 
     * Sets the itemId.
     * 
     * @param itemId the itemId
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /** 
     * Returns the usedFlg.
     * 
     * @return the usedFlg
     */
    public Integer getUsedFlg() {
        return usedFlg;
    }

    /** 
     * Sets the usedFlg.
     * 
     * @param usedFlg the usedFlg
     */
    public void setUsedFlg(Integer usedFlg) {
        this.usedFlg = usedFlg;
    }

    /** 
     * Returns the usedDate.
     * 
     * @return the usedDate
     */
    public LocalDateTime getUsedDate() {
        return usedDate;
    }

    /** 
     * Sets the usedDate.
     * 
     * @param usedDate the usedDate
     */
    public void setUsedDate(LocalDateTime usedDate) {
        this.usedDate = usedDate;
    }

    /** 
     * Returns the effectEndDate.
     * 
     * @return the effectEndDate
     */
    public LocalDateTime getEffectEndDate() {
        return effectEndDate;
    }

    /** 
     * Sets the effectEndDate.
     * 
     * @param effectEndDate the effectEndDate
     */
    public void setEffectEndDate(LocalDateTime effectEndDate) {
        this.effectEndDate = effectEndDate;
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

    /** 
     * Returns the effectStartDate.
     * 
     * @return the effectStartDate
     */
    public LocalDateTime getEffectStartDate() {
        return effectStartDate;
    }

    /** 
     * Sets the effectStartDate.
     * 
     * @param effectStartDate the effectStartDate
     */
    public void setEffectStartDate(LocalDateTime effectStartDate) {
        this.effectStartDate = effectStartDate;
    }
}
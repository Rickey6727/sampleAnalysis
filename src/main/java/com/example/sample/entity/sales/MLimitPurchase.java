package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MLimitPurchaseListener.class)
@Table(name = "m_limit_purchase")
public class MLimitPurchase {

    /** */
    @Id
    @Column(name = "limit_purchase_id")
    Integer limitPurchaseId;

    /** */
    @Column(name = "coin_type")
    Integer coinType;

    /** */
    @Column(name = "amount")
    Integer amount;

    /** */
    @Column(name = "original_coin_type")
    Integer originalCoinType;

    /** */
    @Column(name = "original_amount")
    Integer originalAmount;

    /** */
    @Column(name = "limit_count")
    Integer limitCount;

    /** */
    @Column(name = "del_flg")
    Integer delFlg;

    /** */
    @Column(name = "start_date")
    LocalDateTime startDate;

    /** */
    @Column(name = "end_date")
    LocalDateTime endDate;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the limitPurchaseId.
     * 
     * @return the limitPurchaseId
     */
    public Integer getLimitPurchaseId() {
        return limitPurchaseId;
    }

    /** 
     * Sets the limitPurchaseId.
     * 
     * @param limitPurchaseId the limitPurchaseId
     */
    public void setLimitPurchaseId(Integer limitPurchaseId) {
        this.limitPurchaseId = limitPurchaseId;
    }

    /** 
     * Returns the coinType.
     * 
     * @return the coinType
     */
    public Integer getCoinType() {
        return coinType;
    }

    /** 
     * Sets the coinType.
     * 
     * @param coinType the coinType
     */
    public void setCoinType(Integer coinType) {
        this.coinType = coinType;
    }

    /** 
     * Returns the amount.
     * 
     * @return the amount
     */
    public Integer getAmount() {
        return amount;
    }

    /** 
     * Sets the amount.
     * 
     * @param amount the amount
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /** 
     * Returns the originalCoinType.
     * 
     * @return the originalCoinType
     */
    public Integer getOriginalCoinType() {
        return originalCoinType;
    }

    /** 
     * Sets the originalCoinType.
     * 
     * @param originalCoinType the originalCoinType
     */
    public void setOriginalCoinType(Integer originalCoinType) {
        this.originalCoinType = originalCoinType;
    }

    /** 
     * Returns the originalAmount.
     * 
     * @return the originalAmount
     */
    public Integer getOriginalAmount() {
        return originalAmount;
    }

    /** 
     * Sets the originalAmount.
     * 
     * @param originalAmount the originalAmount
     */
    public void setOriginalAmount(Integer originalAmount) {
        this.originalAmount = originalAmount;
    }

    /** 
     * Returns the limitCount.
     * 
     * @return the limitCount
     */
    public Integer getLimitCount() {
        return limitCount;
    }

    /** 
     * Sets the limitCount.
     * 
     * @param limitCount the limitCount
     */
    public void setLimitCount(Integer limitCount) {
        this.limitCount = limitCount;
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
     * Returns the startDate.
     * 
     * @return the startDate
     */
    public LocalDateTime getStartDate() {
        return startDate;
    }

    /** 
     * Sets the startDate.
     * 
     * @param startDate the startDate
     */
    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    /** 
     * Returns the endDate.
     * 
     * @return the endDate
     */
    public LocalDateTime getEndDate() {
        return endDate;
    }

    /** 
     * Sets the endDate.
     * 
     * @param endDate the endDate
     */
    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
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
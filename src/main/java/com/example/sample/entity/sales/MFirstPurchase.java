package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MFirstPurchaseListener.class)
@Table(name = "m_first_purchase")
public class MFirstPurchase {

    /** */
    @Id
    @Column(name = "first_purchase_id")
    Integer firstPurchaseId;

    /** */
    @Column(name = "price_condition")
    Integer priceCondition;

    /** */
    @Column(name = "quest_id")
    Integer questId;

    /** */
    @Column(name = "limit_time")
    Integer limitTime;

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
     * Returns the firstPurchaseId.
     * 
     * @return the firstPurchaseId
     */
    public Integer getFirstPurchaseId() {
        return firstPurchaseId;
    }

    /** 
     * Sets the firstPurchaseId.
     * 
     * @param firstPurchaseId the firstPurchaseId
     */
    public void setFirstPurchaseId(Integer firstPurchaseId) {
        this.firstPurchaseId = firstPurchaseId;
    }

    /** 
     * Returns the priceCondition.
     * 
     * @return the priceCondition
     */
    public Integer getPriceCondition() {
        return priceCondition;
    }

    /** 
     * Sets the priceCondition.
     * 
     * @param priceCondition the priceCondition
     */
    public void setPriceCondition(Integer priceCondition) {
        this.priceCondition = priceCondition;
    }

    /** 
     * Returns the questId.
     * 
     * @return the questId
     */
    public Integer getQuestId() {
        return questId;
    }

    /** 
     * Sets the questId.
     * 
     * @param questId the questId
     */
    public void setQuestId(Integer questId) {
        this.questId = questId;
    }

    /** 
     * Returns the limitTime.
     * 
     * @return the limitTime
     */
    public Integer getLimitTime() {
        return limitTime;
    }

    /** 
     * Sets the limitTime.
     * 
     * @param limitTime the limitTime
     */
    public void setLimitTime(Integer limitTime) {
        this.limitTime = limitTime;
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
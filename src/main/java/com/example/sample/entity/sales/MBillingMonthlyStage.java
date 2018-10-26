package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MBillingMonthlyStageListener.class)
@Table(name = "m_billing_monthly_stage")
public class MBillingMonthlyStage {

    /** */
    @Id
    @Column(name = "billing_month")
    String billingMonth;

    /** */
    @Id
    @Column(name = "stage_id")
    Integer stageId;

    /** */
    @Column(name = "ios_coin_count")
    Integer iosCoinCount;

    /** */
    @Column(name = "and_coin_count")
    Integer andCoinCount;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the billingMonth.
     * 
     * @return the billingMonth
     */
    public String getBillingMonth() {
        return billingMonth;
    }

    /** 
     * Sets the billingMonth.
     * 
     * @param billingMonth the billingMonth
     */
    public void setBillingMonth(String billingMonth) {
        this.billingMonth = billingMonth;
    }

    /** 
     * Returns the stageId.
     * 
     * @return the stageId
     */
    public Integer getStageId() {
        return stageId;
    }

    /** 
     * Sets the stageId.
     * 
     * @param stageId the stageId
     */
    public void setStageId(Integer stageId) {
        this.stageId = stageId;
    }

    /** 
     * Returns the iosCoinCount.
     * 
     * @return the iosCoinCount
     */
    public Integer getIosCoinCount() {
        return iosCoinCount;
    }

    /** 
     * Sets the iosCoinCount.
     * 
     * @param iosCoinCount the iosCoinCount
     */
    public void setIosCoinCount(Integer iosCoinCount) {
        this.iosCoinCount = iosCoinCount;
    }

    /** 
     * Returns the andCoinCount.
     * 
     * @return the andCoinCount
     */
    public Integer getAndCoinCount() {
        return andCoinCount;
    }

    /** 
     * Sets the andCoinCount.
     * 
     * @param andCoinCount the andCoinCount
     */
    public void setAndCoinCount(Integer andCoinCount) {
        this.andCoinCount = andCoinCount;
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
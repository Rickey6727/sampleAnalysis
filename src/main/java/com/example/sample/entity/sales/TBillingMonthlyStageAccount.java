package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TBillingMonthlyStageAccountListener.class)
@Table(name = "t_billing_monthly_stage_account")
public class TBillingMonthlyStageAccount {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Id
    @Column(name = "billing_month")
    String billingMonth;

    /** */
    @Id
    @Column(name = "stage_id")
    Integer stageId;

    /** */
    @Column(name = "received_reward_flg")
    Integer receivedRewardFlg;

    /** */
    @Column(name = "received_following_reward_flg")
    Integer receivedFollowingRewardFlg;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** */
    @Column(name = "received_effect_reward_flg")
    Integer receivedEffectRewardFlg;

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
     * Returns the receivedRewardFlg.
     * 
     * @return the receivedRewardFlg
     */
    public Integer getReceivedRewardFlg() {
        return receivedRewardFlg;
    }

    /** 
     * Sets the receivedRewardFlg.
     * 
     * @param receivedRewardFlg the receivedRewardFlg
     */
    public void setReceivedRewardFlg(Integer receivedRewardFlg) {
        this.receivedRewardFlg = receivedRewardFlg;
    }

    /** 
     * Returns the receivedFollowingRewardFlg.
     * 
     * @return the receivedFollowingRewardFlg
     */
    public Integer getReceivedFollowingRewardFlg() {
        return receivedFollowingRewardFlg;
    }

    /** 
     * Sets the receivedFollowingRewardFlg.
     * 
     * @param receivedFollowingRewardFlg the receivedFollowingRewardFlg
     */
    public void setReceivedFollowingRewardFlg(Integer receivedFollowingRewardFlg) {
        this.receivedFollowingRewardFlg = receivedFollowingRewardFlg;
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
     * Returns the receivedEffectRewardFlg.
     * 
     * @return the receivedEffectRewardFlg
     */
    public Integer getReceivedEffectRewardFlg() {
        return receivedEffectRewardFlg;
    }

    /** 
     * Sets the receivedEffectRewardFlg.
     * 
     * @param receivedEffectRewardFlg the receivedEffectRewardFlg
     */
    public void setReceivedEffectRewardFlg(Integer receivedEffectRewardFlg) {
        this.receivedEffectRewardFlg = receivedEffectRewardFlg;
    }
}
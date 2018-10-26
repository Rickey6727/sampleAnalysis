package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TBillingMonthlyStageFirstAccountListener.class)
@Table(name = "t_billing_monthly_stage_first_account")
public class TBillingMonthlyStageFirstAccount {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Id
    @Column(name = "stage_id")
    Integer stageId;

    /** */
    @Column(name = "received_reward_flg")
    Integer receivedRewardFlg;

    /** */
    @Column(name = "popup_flg")
    Integer popupFlg;

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
     * Returns the popupFlg.
     * 
     * @return the popupFlg
     */
    public Integer getPopupFlg() {
        return popupFlg;
    }

    /** 
     * Sets the popupFlg.
     * 
     * @param popupFlg the popupFlg
     */
    public void setPopupFlg(Integer popupFlg) {
        this.popupFlg = popupFlg;
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
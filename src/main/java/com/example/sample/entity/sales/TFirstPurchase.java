package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TFirstPurchaseListener.class)
@Table(name = "t_first_purchase")
public class TFirstPurchase {

    /** */
    @Id
    @Column(name = "first_purchse_id")
    Integer firstPurchseId;

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Column(name = "complete_flg")
    Integer completeFlg;

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
     * Returns the firstPurchseId.
     * 
     * @return the firstPurchseId
     */
    public Integer getFirstPurchseId() {
        return firstPurchseId;
    }

    /** 
     * Sets the firstPurchseId.
     * 
     * @param firstPurchseId the firstPurchseId
     */
    public void setFirstPurchseId(Integer firstPurchseId) {
        this.firstPurchseId = firstPurchseId;
    }

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
     * Returns the completeFlg.
     * 
     * @return the completeFlg
     */
    public Integer getCompleteFlg() {
        return completeFlg;
    }

    /** 
     * Sets the completeFlg.
     * 
     * @param completeFlg the completeFlg
     */
    public void setCompleteFlg(Integer completeFlg) {
        this.completeFlg = completeFlg;
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
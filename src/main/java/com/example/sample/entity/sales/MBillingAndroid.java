package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MBillingAndroidListener.class)
@Table(name = "m_billing_android")
public class MBillingAndroid {

    /** */
    @Id
    @Column(name = "billing_id")
    Integer billingId;

    /** */
    @Column(name = "product_id")
    String productId;

    /** */
    @Column(name = "pay_amount")
    Integer payAmount;

    /** */
    @Column(name = "free_amount")
    Integer freeAmount;

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
     * Returns the billingId.
     * 
     * @return the billingId
     */
    public Integer getBillingId() {
        return billingId;
    }

    /** 
     * Sets the billingId.
     * 
     * @param billingId the billingId
     */
    public void setBillingId(Integer billingId) {
        this.billingId = billingId;
    }

    /** 
     * Returns the productId.
     * 
     * @return the productId
     */
    public String getProductId() {
        return productId;
    }

    /** 
     * Sets the productId.
     * 
     * @param productId the productId
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /** 
     * Returns the payAmount.
     * 
     * @return the payAmount
     */
    public Integer getPayAmount() {
        return payAmount;
    }

    /** 
     * Sets the payAmount.
     * 
     * @param payAmount the payAmount
     */
    public void setPayAmount(Integer payAmount) {
        this.payAmount = payAmount;
    }

    /** 
     * Returns the freeAmount.
     * 
     * @return the freeAmount
     */
    public Integer getFreeAmount() {
        return freeAmount;
    }

    /** 
     * Sets the freeAmount.
     * 
     * @param freeAmount the freeAmount
     */
    public void setFreeAmount(Integer freeAmount) {
        this.freeAmount = freeAmount;
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
package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MSubscriptionBillingAndroidListener.class)
@Table(name = "m_subscription_billing_android")
public class MSubscriptionBillingAndroid {

    /** */
    @Id
    @Column(name = "billing_id")
    Integer billingId;

    /** */
    @Column(name = "product_id")
    String productId;

    /** */
    @Column(name = "subscription_type")
    Integer subscriptionType;

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
     * Returns the subscriptionType.
     * 
     * @return the subscriptionType
     */
    public Integer getSubscriptionType() {
        return subscriptionType;
    }

    /** 
     * Sets the subscriptionType.
     * 
     * @param subscriptionType the subscriptionType
     */
    public void setSubscriptionType(Integer subscriptionType) {
        this.subscriptionType = subscriptionType;
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
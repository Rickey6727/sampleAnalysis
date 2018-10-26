package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TBillingHistoryAndroidListener.class)
@Table(name = "t_billing_history_android")
public class TBillingHistoryAndroid {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Id
    @Column(name = "purchase_token")
    String purchaseToken;

    /** */
    @Column(name = "order_id")
    String orderId;

    /** */
    @Column(name = "product_id")
    String productId;

    /** */
    @Column(name = "package_name")
    String packageName;

    /** */
    @Column(name = "purchase_time")
    LocalDateTime purchaseTime;

    /** */
    @Column(name = "purchase_status")
    Short purchaseStatus;

    /** */
    @Column(name = "developer_payload")
    String developerPayload;

    /** */
    @Column(name = "signature")
    String signature;

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
     * Returns the purchaseToken.
     * 
     * @return the purchaseToken
     */
    public String getPurchaseToken() {
        return purchaseToken;
    }

    /** 
     * Sets the purchaseToken.
     * 
     * @param purchaseToken the purchaseToken
     */
    public void setPurchaseToken(String purchaseToken) {
        this.purchaseToken = purchaseToken;
    }

    /** 
     * Returns the orderId.
     * 
     * @return the orderId
     */
    public String getOrderId() {
        return orderId;
    }

    /** 
     * Sets the orderId.
     * 
     * @param orderId the orderId
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
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
     * Returns the packageName.
     * 
     * @return the packageName
     */
    public String getPackageName() {
        return packageName;
    }

    /** 
     * Sets the packageName.
     * 
     * @param packageName the packageName
     */
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /** 
     * Returns the purchaseTime.
     * 
     * @return the purchaseTime
     */
    public LocalDateTime getPurchaseTime() {
        return purchaseTime;
    }

    /** 
     * Sets the purchaseTime.
     * 
     * @param purchaseTime the purchaseTime
     */
    public void setPurchaseTime(LocalDateTime purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    /** 
     * Returns the purchaseStatus.
     * 
     * @return the purchaseStatus
     */
    public Short getPurchaseStatus() {
        return purchaseStatus;
    }

    /** 
     * Sets the purchaseStatus.
     * 
     * @param purchaseStatus the purchaseStatus
     */
    public void setPurchaseStatus(Short purchaseStatus) {
        this.purchaseStatus = purchaseStatus;
    }

    /** 
     * Returns the developerPayload.
     * 
     * @return the developerPayload
     */
    public String getDeveloperPayload() {
        return developerPayload;
    }

    /** 
     * Sets the developerPayload.
     * 
     * @param developerPayload the developerPayload
     */
    public void setDeveloperPayload(String developerPayload) {
        this.developerPayload = developerPayload;
    }

    /** 
     * Returns the signature.
     * 
     * @return the signature
     */
    public String getSignature() {
        return signature;
    }

    /** 
     * Sets the signature.
     * 
     * @param signature the signature
     */
    public void setSignature(String signature) {
        this.signature = signature;
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
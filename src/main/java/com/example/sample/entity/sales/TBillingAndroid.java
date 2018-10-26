package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TBillingAndroidListener.class)
@Table(name = "t_billing_android")
public class TBillingAndroid {

    /** */
    @Id
    @Column(name = "purchase_token")
    String purchaseToken;

    /** */
    @Column(name = "billing_status")
    Short billingStatus;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

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
     * Returns the billingStatus.
     * 
     * @return the billingStatus
     */
    public Short getBillingStatus() {
        return billingStatus;
    }

    /** 
     * Sets the billingStatus.
     * 
     * @param billingStatus the billingStatus
     */
    public void setBillingStatus(Short billingStatus) {
        this.billingStatus = billingStatus;
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
}
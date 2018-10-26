package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MTermBillingAndroidListener.class)
@Table(name = "m_term_billing_android")
public class MTermBillingAndroid {

    /** */
    @Id
    @Column(name = "billing_id")
    Integer billingId;

    /** */
    @Column(name = "product_id")
    String productId;

    /** */
    @Column(name = "term_type")
    Integer termType;

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
     * Returns the termType.
     * 
     * @return the termType
     */
    public Integer getTermType() {
        return termType;
    }

    /** 
     * Sets the termType.
     * 
     * @param termType the termType
     */
    public void setTermType(Integer termType) {
        this.termType = termType;
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
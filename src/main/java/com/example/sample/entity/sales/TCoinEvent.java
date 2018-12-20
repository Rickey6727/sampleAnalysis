package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TCoinEventListener.class)
@Table(name = "t_coin_event")
public class TCoinEvent {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Id
    @Column(name = "event_id")
    Integer eventId;

    /** */
    @Id
    @Column(name = "native_type")
    Integer nativeType;

    /** */
    @Id
    @Column(name = "product_id")
    String productId;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "purchase_count")
    Integer purchaseCount;
    
    /** */
    @Column(name = "count")
    Integer totalCount;

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
     * Returns the eventId.
     * 
     * @return the eventId
     */
    public Integer getEventId() {
        return eventId;
    }

    /** 
     * Sets the eventId.
     * 
     * @param eventId the eventId
     */
    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    /** 
     * Returns the nativeType.
     * 
     * @return the nativeType
     */
    public Integer getNativeType() {
        return nativeType;
    }

    /** 
     * Sets the nativeType.
     * 
     * @param nativeType the nativeType
     */
    public void setNativeType(Integer nativeType) {
        this.nativeType = nativeType;
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
     * Returns the purchaseCount.
     * 
     * @return the purchaseCount
     */
    public Integer getPurchaseCount() {
        return purchaseCount;
    }

    /** 
     * Sets the purchaseCount.
     * 
     * @param purchaseCount the purchaseCount
     */
    public void setPurchaseCount(Integer purchaseCount) {
        this.purchaseCount = purchaseCount;
    }
    
    /** 
     * Returns the totalCount.
     * 
     * @return the totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /** 
     * Sets the totalCount.
     * 
     * @param totalCount the totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
}
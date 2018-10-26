package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MCoinEventPurchaseBonusListener.class)
@Table(name = "m_coin_event_purchase_bonus")
public class MCoinEventPurchaseBonus {

    /** */
    @Id
    @Column(name = "event_id")
    Integer eventId;

    /** */
    @Id
    @Column(name = "product_id")
    String productId;

    /** */
    @Column(name = "message_id")
    Integer messageId;

    /** */
    @Id
    @Column(name = "item_type")
    Integer itemType;

    /** */
    @Id
    @Column(name = "item_id")
    Integer itemId;

    /** */
    @Column(name = "item_count")
    Integer itemCount;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** */
    @Column(name = "purchase_count")
    Integer purchaseCount;

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
     * Returns the messageId.
     * 
     * @return the messageId
     */
    public Integer getMessageId() {
        return messageId;
    }

    /** 
     * Sets the messageId.
     * 
     * @param messageId the messageId
     */
    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    /** 
     * Returns the itemType.
     * 
     * @return the itemType
     */
    public Integer getItemType() {
        return itemType;
    }

    /** 
     * Sets the itemType.
     * 
     * @param itemType the itemType
     */
    public void setItemType(Integer itemType) {
        this.itemType = itemType;
    }

    /** 
     * Returns the itemId.
     * 
     * @return the itemId
     */
    public Integer getItemId() {
        return itemId;
    }

    /** 
     * Sets the itemId.
     * 
     * @param itemId the itemId
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /** 
     * Returns the itemCount.
     * 
     * @return the itemCount
     */
    public Integer getItemCount() {
        return itemCount;
    }

    /** 
     * Sets the itemCount.
     * 
     * @param itemCount the itemCount
     */
    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
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
}
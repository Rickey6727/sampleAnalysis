package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MFirstPurchaseItemListener.class)
@Table(name = "m_first_purchase_item")
public class MFirstPurchaseItem {

    /** */
    @Id
    @Column(name = "first_purchase_id")
    Integer firstPurchaseId;

    /** */
    @Id
    @Column(name = "item_no")
    Integer itemNo;

    /** */
    @Column(name = "item_type")
    Integer itemType;

    /** */
    @Column(name = "item_id")
    Integer itemId;

    /** */
    @Column(name = "item_count")
    Integer itemCount;

    /** */
    @Column(name = "present_message_id")
    Integer presentMessageId;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the firstPurchaseId.
     * 
     * @return the firstPurchaseId
     */
    public Integer getFirstPurchaseId() {
        return firstPurchaseId;
    }

    /** 
     * Sets the firstPurchaseId.
     * 
     * @param firstPurchaseId the firstPurchaseId
     */
    public void setFirstPurchaseId(Integer firstPurchaseId) {
        this.firstPurchaseId = firstPurchaseId;
    }

    /** 
     * Returns the itemNo.
     * 
     * @return the itemNo
     */
    public Integer getItemNo() {
        return itemNo;
    }

    /** 
     * Sets the itemNo.
     * 
     * @param itemNo the itemNo
     */
    public void setItemNo(Integer itemNo) {
        this.itemNo = itemNo;
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
     * Returns the presentMessageId.
     * 
     * @return the presentMessageId
     */
    public Integer getPresentMessageId() {
        return presentMessageId;
    }

    /** 
     * Sets the presentMessageId.
     * 
     * @param presentMessageId the presentMessageId
     */
    public void setPresentMessageId(Integer presentMessageId) {
        this.presentMessageId = presentMessageId;
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
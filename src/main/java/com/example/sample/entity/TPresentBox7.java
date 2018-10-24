package com.example.sample.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TPresentBox7Listener.class)
@Table(name = "t_present_box_7")
public class TPresentBox7 {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Id
    @Column(name = "account_order_id")
    Integer accountOrderId;

    /** */
    @Column(name = "message_id")
    Integer messageId;

    /** */
    @Column(name = "item_type")
    Integer itemType;

    /** */
    @Column(name = "item_id")
    Integer itemId;

    /** */
    @Column(name = "item_val")
    Integer itemVal;

    /** */
    @Column(name = "get_flg")
    Short getFlg;

    /** */
    @Column(name = "del_flg")
    Short delFlg;

    /** */
    @Column(name = "all_present_id")
    Integer allPresentId;

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
     * Returns the accountOrderId.
     * 
     * @return the accountOrderId
     */
    public Integer getAccountOrderId() {
        return accountOrderId;
    }

    /** 
     * Sets the accountOrderId.
     * 
     * @param accountOrderId the accountOrderId
     */
    public void setAccountOrderId(Integer accountOrderId) {
        this.accountOrderId = accountOrderId;
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
     * Returns the itemVal.
     * 
     * @return the itemVal
     */
    public Integer getItemVal() {
        return itemVal;
    }

    /** 
     * Sets the itemVal.
     * 
     * @param itemVal the itemVal
     */
    public void setItemVal(Integer itemVal) {
        this.itemVal = itemVal;
    }

    /** 
     * Returns the getFlg.
     * 
     * @return the getFlg
     */
    public Short getGetFlg() {
        return getFlg;
    }

    /** 
     * Sets the getFlg.
     * 
     * @param getFlg the getFlg
     */
    public void setGetFlg(Short getFlg) {
        this.getFlg = getFlg;
    }

    /** 
     * Returns the delFlg.
     * 
     * @return the delFlg
     */
    public Short getDelFlg() {
        return delFlg;
    }

    /** 
     * Sets the delFlg.
     * 
     * @param delFlg the delFlg
     */
    public void setDelFlg(Short delFlg) {
        this.delFlg = delFlg;
    }

    /** 
     * Returns the allPresentId.
     * 
     * @return the allPresentId
     */
    public Integer getAllPresentId() {
        return allPresentId;
    }

    /** 
     * Sets the allPresentId.
     * 
     * @param allPresentId the allPresentId
     */
    public void setAllPresentId(Integer allPresentId) {
        this.allPresentId = allPresentId;
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
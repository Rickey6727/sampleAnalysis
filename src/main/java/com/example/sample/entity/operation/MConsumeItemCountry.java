package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * 国別消費アイテム名称マスター
 */
@Entity(listener = MConsumeItemCountryListener.class)
@Table(name = "m_consume_item_country")
public class MConsumeItemCountry {

    /** 消費アイテムID */
    @Id
    @Column(name = "item_id")
    Integer itemId;

    /** 国識別コード */
    @Id
    @Column(name = "country_cd")
    Integer countryCd;

    /** 消費アイテム名称 */
    @Column(name = "item_name")
    String itemName;

    /** 説明 */
    @Column(name = "item_description")
    String itemDescription;

    /** 作成日時 */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** 更新時間 */
    @Column(name = "update_date")
    LocalDateTime updateDate;

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
     * Returns the countryCd.
     * 
     * @return the countryCd
     */
    public Integer getCountryCd() {
        return countryCd;
    }

    /** 
     * Sets the countryCd.
     * 
     * @param countryCd the countryCd
     */
    public void setCountryCd(Integer countryCd) {
        this.countryCd = countryCd;
    }

    /** 
     * Returns the itemName.
     * 
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /** 
     * Sets the itemName.
     * 
     * @param itemName the itemName
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /** 
     * Returns the itemDescription.
     * 
     * @return the itemDescription
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /** 
     * Sets the itemDescription.
     * 
     * @param itemDescription the itemDescription
     */
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
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
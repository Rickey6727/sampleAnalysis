package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MItemPackListener.class)
@Table(name = "m_item_pack")
public class MItemPack {

    /** */
    @Id
    @Column(name = "pack_id")
    Integer packId;

    /** */
    @Id
    @Column(name = "item_type")
    Integer itemType;

    /** */
    @Id
    @Column(name = "item_id")
    Integer itemId;

    /** */
    @Column(name = "item_val")
    Integer itemVal;

    /** */
    @Column(name = "del_flg")
    Integer delFlg;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** */
    @Column(name = "importance_flg")
    Integer importanceFlg;

    /** 
     * Returns the packId.
     * 
     * @return the packId
     */
    public Integer getPackId() {
        return packId;
    }

    /** 
     * Sets the packId.
     * 
     * @param packId the packId
     */
    public void setPackId(Integer packId) {
        this.packId = packId;
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

    /** 
     * Returns the importanceFlg.
     * 
     * @return the importanceFlg
     */
    public Integer getImportanceFlg() {
        return importanceFlg;
    }

    /** 
     * Sets the importanceFlg.
     * 
     * @param importanceFlg the importanceFlg
     */
    public void setImportanceFlg(Integer importanceFlg) {
        this.importanceFlg = importanceFlg;
    }
}
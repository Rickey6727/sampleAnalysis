package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MGainItemListener.class)
@Table(name = "m_gain_item")
public class MGainItem {

    /** */
    @Id
    @Column(name = "gain_id")
    Integer gainId;

    /** */
    @Id
    @Column(name = "no")
    Integer no;

    /** */
    @Column(name = "item_id")
    Integer itemId;

    /** */
    @Column(name = "item_type")
    Integer itemType;

    /** */
    @Column(name = "item_count")
    Integer itemCount;

    /** */
    @Column(name = "add_date")
    LocalDateTime addDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** */
    @Column(name = "unique_type")
    Integer uniqueType;

    /** */
    @Column(name = "rare_type")
    Integer rareType;

    /** 
     * Returns the gainId.
     * 
     * @return the gainId
     */
    public Integer getGainId() {
        return gainId;
    }

    /** 
     * Sets the gainId.
     * 
     * @param gainId the gainId
     */
    public void setGainId(Integer gainId) {
        this.gainId = gainId;
    }

    /** 
     * Returns the no.
     * 
     * @return the no
     */
    public Integer getNo() {
        return no;
    }

    /** 
     * Sets the no.
     * 
     * @param no the no
     */
    public void setNo(Integer no) {
        this.no = no;
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
     * Returns the addDate.
     * 
     * @return the addDate
     */
    public LocalDateTime getAddDate() {
        return addDate;
    }

    /** 
     * Sets the addDate.
     * 
     * @param addDate the addDate
     */
    public void setAddDate(LocalDateTime addDate) {
        this.addDate = addDate;
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
     * Returns the uniqueType.
     * 
     * @return the uniqueType
     */
    public Integer getUniqueType() {
        return uniqueType;
    }

    /** 
     * Sets the uniqueType.
     * 
     * @param uniqueType the uniqueType
     */
    public void setUniqueType(Integer uniqueType) {
        this.uniqueType = uniqueType;
    }

    /** 
     * Returns the rareType.
     * 
     * @return the rareType
     */
    public Integer getRareType() {
        return rareType;
    }

    /** 
     * Sets the rareType.
     * 
     * @param rareType the rareType
     */
    public void setRareType(Integer rareType) {
        this.rareType = rareType;
    }
}
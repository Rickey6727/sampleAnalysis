package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TGachaHistoryListener.class)
@Table(name = "t_gacha_history")
public class TGachaHistory {

    /** */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "serial_id")
    Long serialId;

    /** */
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Column(name = "gacha_id")
    Integer gachaId;

    /** */
    @Column(name = "give_type")
    Integer giveType;

    /** */
    @Column(name = "item_category")
    Integer itemCategory;

    /** */
    @Column(name = "item_id")
    Integer itemId;

    /** */
    @Column(name = "use_amount")
    Integer useAmount;

    /** */
    @Column(name = "create_time")
    LocalDateTime createTime;

    /** */
    @Column(name = "ip_address")
    String ipAddress;

    /** */
    @Column(name = "number_laps")
    Integer numberLaps;

    /** */
    @Column(name = "point")
    Integer point;

    /** */
    @Column(name = "item_val")
    Integer itemVal;
    
    /** */
    @Column(name = "count")
    Integer totalCount;

    /** 
     * Returns the serialId.
     * 
     * @return the serialId
     */
    public Long getSerialId() {
        return serialId;
    }

    /** 
     * Sets the serialId.
     * 
     * @param serialId the serialId
     */
    public void setSerialId(Long serialId) {
        this.serialId = serialId;
    }

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
     * Returns the gachaId.
     * 
     * @return the gachaId
     */
    public Integer getGachaId() {
        return gachaId;
    }

    /** 
     * Sets the gachaId.
     * 
     * @param gachaId the gachaId
     */
    public void setGachaId(Integer gachaId) {
        this.gachaId = gachaId;
    }

    /** 
     * Returns the giveType.
     * 
     * @return the giveType
     */
    public Integer getGiveType() {
        return giveType;
    }

    /** 
     * Sets the giveType.
     * 
     * @param giveType the giveType
     */
    public void setGiveType(Integer giveType) {
        this.giveType = giveType;
    }

    /** 
     * Returns the itemCategory.
     * 
     * @return the itemCategory
     */
    public Integer getItemCategory() {
        return itemCategory;
    }

    /** 
     * Sets the itemCategory.
     * 
     * @param itemCategory the itemCategory
     */
    public void setItemCategory(Integer itemCategory) {
        this.itemCategory = itemCategory;
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
     * Returns the useAmount.
     * 
     * @return the useAmount
     */
    public Integer getUseAmount() {
        return useAmount;
    }

    /** 
     * Sets the useAmount.
     * 
     * @param useAmount the useAmount
     */
    public void setUseAmount(Integer useAmount) {
        this.useAmount = useAmount;
    }

    /** 
     * Returns the createTime.
     * 
     * @return the createTime
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /** 
     * Sets the createTime.
     * 
     * @param createTime the createTime
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /** 
     * Returns the ipAddress.
     * 
     * @return the ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /** 
     * Sets the ipAddress.
     * 
     * @param ipAddress the ipAddress
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /** 
     * Returns the numberLaps.
     * 
     * @return the numberLaps
     */
    public Integer getNumberLaps() {
        return numberLaps;
    }

    /** 
     * Sets the numberLaps.
     * 
     * @param numberLaps the numberLaps
     */
    public void setNumberLaps(Integer numberLaps) {
        this.numberLaps = numberLaps;
    }

    /** 
     * Returns the point.
     * 
     * @return the point
     */
    public Integer getPoint() {
        return point;
    }

    /** 
     * Sets the point.
     * 
     * @param point the point
     */
    public void setPoint(Integer point) {
        this.point = point;
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
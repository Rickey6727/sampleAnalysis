package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MGachaCountSaleListener.class)
@Table(name = "m_gacha_count_sale")
public class MGachaCountSale {

    /** */
    @Id
    @Column(name = "gacha_id")
    Integer gachaId;

    /** */
    @Id
    @Column(name = "gacha_count")
    Integer gachaCount;

    /** */
    @Column(name = "amount")
    Integer amount;

    /** */
    @Column(name = "create_time")
    LocalDateTime createTime;

    /** */
    @Column(name = "update_time")
    LocalDateTime updateTime;

    /** */
    @Id
    @Column(name = "gacha_kind")
    Integer gachaKind;

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
     * Returns the gachaCount.
     * 
     * @return the gachaCount
     */
    public Integer getGachaCount() {
        return gachaCount;
    }

    /** 
     * Sets the gachaCount.
     * 
     * @param gachaCount the gachaCount
     */
    public void setGachaCount(Integer gachaCount) {
        this.gachaCount = gachaCount;
    }

    /** 
     * Returns the amount.
     * 
     * @return the amount
     */
    public Integer getAmount() {
        return amount;
    }

    /** 
     * Sets the amount.
     * 
     * @param amount the amount
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
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
     * Returns the updateTime.
     * 
     * @return the updateTime
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /** 
     * Sets the updateTime.
     * 
     * @param updateTime the updateTime
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    /** 
     * Returns the gachaKind.
     * 
     * @return the gachaKind
     */
    public Integer getGachaKind() {
        return gachaKind;
    }

    /** 
     * Sets the gachaKind.
     * 
     * @param gachaKind the gachaKind
     */
    public void setGachaKind(Integer gachaKind) {
        this.gachaKind = gachaKind;
    }
}
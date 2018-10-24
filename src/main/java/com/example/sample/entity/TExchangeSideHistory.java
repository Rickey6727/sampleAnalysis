package com.example.sample.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TExchangeSideHistoryListener.class)
@Table(name = "t_exchange_side_history")
public class TExchangeSideHistory {

    /** */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "serial_id")
    Long serialId;

    /** */
    @Column(name = "exchange_id")
    Integer exchangeId;

    /** */
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Column(name = "condition_goods_type")
    Integer conditionGoodsType;

    /** */
    @Column(name = "condition_goods_id")
    Integer conditionGoodsId;

    /** */
    @Column(name = "exchange_goods_type")
    Integer exchangeGoodsType;

    /** */
    @Column(name = "exchange_goods_id")
    Integer exchangeGoodsId;

    /** */
    @Column(name = "exchange_count")
    Integer exchangeCount;

    /** */
    @Column(name = "cost_unit_count")
    Integer costUnitCount;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

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
     * Returns the exchangeId.
     * 
     * @return the exchangeId
     */
    public Integer getExchangeId() {
        return exchangeId;
    }

    /** 
     * Sets the exchangeId.
     * 
     * @param exchangeId the exchangeId
     */
    public void setExchangeId(Integer exchangeId) {
        this.exchangeId = exchangeId;
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
     * Returns the conditionGoodsType.
     * 
     * @return the conditionGoodsType
     */
    public Integer getConditionGoodsType() {
        return conditionGoodsType;
    }

    /** 
     * Sets the conditionGoodsType.
     * 
     * @param conditionGoodsType the conditionGoodsType
     */
    public void setConditionGoodsType(Integer conditionGoodsType) {
        this.conditionGoodsType = conditionGoodsType;
    }

    /** 
     * Returns the conditionGoodsId.
     * 
     * @return the conditionGoodsId
     */
    public Integer getConditionGoodsId() {
        return conditionGoodsId;
    }

    /** 
     * Sets the conditionGoodsId.
     * 
     * @param conditionGoodsId the conditionGoodsId
     */
    public void setConditionGoodsId(Integer conditionGoodsId) {
        this.conditionGoodsId = conditionGoodsId;
    }

    /** 
     * Returns the exchangeGoodsType.
     * 
     * @return the exchangeGoodsType
     */
    public Integer getExchangeGoodsType() {
        return exchangeGoodsType;
    }

    /** 
     * Sets the exchangeGoodsType.
     * 
     * @param exchangeGoodsType the exchangeGoodsType
     */
    public void setExchangeGoodsType(Integer exchangeGoodsType) {
        this.exchangeGoodsType = exchangeGoodsType;
    }

    /** 
     * Returns the exchangeGoodsId.
     * 
     * @return the exchangeGoodsId
     */
    public Integer getExchangeGoodsId() {
        return exchangeGoodsId;
    }

    /** 
     * Sets the exchangeGoodsId.
     * 
     * @param exchangeGoodsId the exchangeGoodsId
     */
    public void setExchangeGoodsId(Integer exchangeGoodsId) {
        this.exchangeGoodsId = exchangeGoodsId;
    }

    /** 
     * Returns the exchangeCount.
     * 
     * @return the exchangeCount
     */
    public Integer getExchangeCount() {
        return exchangeCount;
    }

    /** 
     * Sets the exchangeCount.
     * 
     * @param exchangeCount the exchangeCount
     */
    public void setExchangeCount(Integer exchangeCount) {
        this.exchangeCount = exchangeCount;
    }

    /** 
     * Returns the costUnitCount.
     * 
     * @return the costUnitCount
     */
    public Integer getCostUnitCount() {
        return costUnitCount;
    }

    /** 
     * Sets the costUnitCount.
     * 
     * @param costUnitCount the costUnitCount
     */
    public void setCostUnitCount(Integer costUnitCount) {
        this.costUnitCount = costUnitCount;
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
}
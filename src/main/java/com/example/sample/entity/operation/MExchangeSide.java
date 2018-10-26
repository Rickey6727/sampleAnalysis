package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MExchangeSideListener.class)
@Table(name = "m_exchange_side")
public class MExchangeSide {

    /** */
    @Id
    @Column(name = "exchange_id")
    Integer exchangeId;

    /** */
    @Column(name = "condition_goods_type")
    Integer conditionGoodsType;

    /** */
    @Column(name = "condition_goods_id")
    Integer conditionGoodsId;

    /** */
    @Column(name = "condition_count")
    Integer conditionCount;

    /** */
    @Column(name = "exchange_goods_type")
    Integer exchangeGoodsType;

    /** */
    @Column(name = "exchange_goods_id")
    Integer exchangeGoodsId;

    /** */
    @Column(name = "exchange_goods_count")
    Integer exchangeGoodsCount;

    /** */
    @Column(name = "limit_count")
    Integer limitCount;

    /** */
    @Column(name = "exchange_target_pattern")
    Integer exchangeTargetPattern;

    /** */
    @Column(name = "limit_term_kind")
    Integer limitTermKind;

    /** */
    @Column(name = "start_date")
    LocalDateTime startDate;

    /** */
    @Column(name = "end_date")
    LocalDateTime endDate;

    /** */
    @Column(name = "description")
    String description;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** */
    @Column(name = "sale_primary")
    Integer salePrimary;

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
     * Returns the conditionCount.
     * 
     * @return the conditionCount
     */
    public Integer getConditionCount() {
        return conditionCount;
    }

    /** 
     * Sets the conditionCount.
     * 
     * @param conditionCount the conditionCount
     */
    public void setConditionCount(Integer conditionCount) {
        this.conditionCount = conditionCount;
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
     * Returns the exchangeGoodsCount.
     * 
     * @return the exchangeGoodsCount
     */
    public Integer getExchangeGoodsCount() {
        return exchangeGoodsCount;
    }

    /** 
     * Sets the exchangeGoodsCount.
     * 
     * @param exchangeGoodsCount the exchangeGoodsCount
     */
    public void setExchangeGoodsCount(Integer exchangeGoodsCount) {
        this.exchangeGoodsCount = exchangeGoodsCount;
    }

    /** 
     * Returns the limitCount.
     * 
     * @return the limitCount
     */
    public Integer getLimitCount() {
        return limitCount;
    }

    /** 
     * Sets the limitCount.
     * 
     * @param limitCount the limitCount
     */
    public void setLimitCount(Integer limitCount) {
        this.limitCount = limitCount;
    }

    /** 
     * Returns the exchangeTargetPattern.
     * 
     * @return the exchangeTargetPattern
     */
    public Integer getExchangeTargetPattern() {
        return exchangeTargetPattern;
    }

    /** 
     * Sets the exchangeTargetPattern.
     * 
     * @param exchangeTargetPattern the exchangeTargetPattern
     */
    public void setExchangeTargetPattern(Integer exchangeTargetPattern) {
        this.exchangeTargetPattern = exchangeTargetPattern;
    }

    /** 
     * Returns the limitTermKind.
     * 
     * @return the limitTermKind
     */
    public Integer getLimitTermKind() {
        return limitTermKind;
    }

    /** 
     * Sets the limitTermKind.
     * 
     * @param limitTermKind the limitTermKind
     */
    public void setLimitTermKind(Integer limitTermKind) {
        this.limitTermKind = limitTermKind;
    }

    /** 
     * Returns the startDate.
     * 
     * @return the startDate
     */
    public LocalDateTime getStartDate() {
        return startDate;
    }

    /** 
     * Sets the startDate.
     * 
     * @param startDate the startDate
     */
    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    /** 
     * Returns the endDate.
     * 
     * @return the endDate
     */
    public LocalDateTime getEndDate() {
        return endDate;
    }

    /** 
     * Sets the endDate.
     * 
     * @param endDate the endDate
     */
    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    /** 
     * Returns the description.
     * 
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Sets the description.
     * 
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
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
     * Returns the salePrimary.
     * 
     * @return the salePrimary
     */
    public Integer getSalePrimary() {
        return salePrimary;
    }

    /** 
     * Sets the salePrimary.
     * 
     * @param salePrimary the salePrimary
     */
    public void setSalePrimary(Integer salePrimary) {
        this.salePrimary = salePrimary;
    }
}
package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MRubyPointExchangeItemListener.class)
@Table(name = "m_ruby_point_exchange_item")
public class MRubyPointExchangeItem {

    /** */
    @Id
    @Column(name = "gacha_id")
    Integer gachaId;

    /** */
    @Id
    @Column(name = "exchange_id")
    Integer exchangeId;

    /** */
    @Column(name = "point")
    Integer point;

    /** */
    @Column(name = "goods_type")
    Integer goodsType;

    /** */
    @Column(name = "goods_id")
    Integer goodsId;

    /** */
    @Column(name = "goods_count")
    Integer goodsCount;

    /** */
    @Column(name = "limit_count")
    Integer limitCount;

    /** */
    @Column(name = "ruby_point_exchange_limit_type")
    Integer rubyPointExchangeLimitType;

    /** */
    @Column(name = "ruby_point_exchange_target_type")
    Integer rubyPointExchangeTargetType;

    /** */
    @Column(name = "description")
    String description;

    /** */
    @Column(name = "start_date")
    LocalDateTime startDate;

    /** */
    @Column(name = "end_date")
    LocalDateTime endDate;

    /** */
    @Column(name = "event_id")
    Integer eventId;

    /** */
    @Column(name = "event_type")
    Integer eventType;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** */
    @Column(name = "rare_type")
    Integer rareType;

    /** */
    @Column(name = "unique_type")
    Integer uniqueType;

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
     * Returns the goodsType.
     * 
     * @return the goodsType
     */
    public Integer getGoodsType() {
        return goodsType;
    }

    /** 
     * Sets the goodsType.
     * 
     * @param goodsType the goodsType
     */
    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
    }

    /** 
     * Returns the goodsId.
     * 
     * @return the goodsId
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /** 
     * Sets the goodsId.
     * 
     * @param goodsId the goodsId
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /** 
     * Returns the goodsCount.
     * 
     * @return the goodsCount
     */
    public Integer getGoodsCount() {
        return goodsCount;
    }

    /** 
     * Sets the goodsCount.
     * 
     * @param goodsCount the goodsCount
     */
    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
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
     * Returns the rubyPointExchangeLimitType.
     * 
     * @return the rubyPointExchangeLimitType
     */
    public Integer getRubyPointExchangeLimitType() {
        return rubyPointExchangeLimitType;
    }

    /** 
     * Sets the rubyPointExchangeLimitType.
     * 
     * @param rubyPointExchangeLimitType the rubyPointExchangeLimitType
     */
    public void setRubyPointExchangeLimitType(Integer rubyPointExchangeLimitType) {
        this.rubyPointExchangeLimitType = rubyPointExchangeLimitType;
    }

    /** 
     * Returns the rubyPointExchangeTargetType.
     * 
     * @return the rubyPointExchangeTargetType
     */
    public Integer getRubyPointExchangeTargetType() {
        return rubyPointExchangeTargetType;
    }

    /** 
     * Sets the rubyPointExchangeTargetType.
     * 
     * @param rubyPointExchangeTargetType the rubyPointExchangeTargetType
     */
    public void setRubyPointExchangeTargetType(Integer rubyPointExchangeTargetType) {
        this.rubyPointExchangeTargetType = rubyPointExchangeTargetType;
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
     * Returns the eventType.
     * 
     * @return the eventType
     */
    public Integer getEventType() {
        return eventType;
    }

    /** 
     * Sets the eventType.
     * 
     * @param eventType the eventType
     */
    public void setEventType(Integer eventType) {
        this.eventType = eventType;
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
}
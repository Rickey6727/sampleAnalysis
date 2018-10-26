package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MEventRewardGoodsListener.class)
@Table(name = "m_event_reward_goods")
public class MEventRewardGoods {

    /** */
    @Id
    @Column(name = "event_id")
    Integer eventId;

    /** */
    @Id
    @Column(name = "goods_group_id")
    Integer goodsGroupId;

    /** */
    @Id
    @Column(name = "goods_lot_no")
    Integer goodsLotNo;

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
    @Column(name = "probability")
    Integer probability;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

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
     * Returns the goodsGroupId.
     * 
     * @return the goodsGroupId
     */
    public Integer getGoodsGroupId() {
        return goodsGroupId;
    }

    /** 
     * Sets the goodsGroupId.
     * 
     * @param goodsGroupId the goodsGroupId
     */
    public void setGoodsGroupId(Integer goodsGroupId) {
        this.goodsGroupId = goodsGroupId;
    }

    /** 
     * Returns the goodsLotNo.
     * 
     * @return the goodsLotNo
     */
    public Integer getGoodsLotNo() {
        return goodsLotNo;
    }

    /** 
     * Sets the goodsLotNo.
     * 
     * @param goodsLotNo the goodsLotNo
     */
    public void setGoodsLotNo(Integer goodsLotNo) {
        this.goodsLotNo = goodsLotNo;
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
     * Returns the probability.
     * 
     * @return the probability
     */
    public Integer getProbability() {
        return probability;
    }

    /** 
     * Sets the probability.
     * 
     * @param probability the probability
     */
    public void setProbability(Integer probability) {
        this.probability = probability;
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
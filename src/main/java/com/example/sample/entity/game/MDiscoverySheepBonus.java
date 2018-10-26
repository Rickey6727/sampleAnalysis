package com.example.sample.entity.game;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MDiscoverySheepBonusListener.class)
@Table(name = "m_discovery_sheep_bonus")
public class MDiscoverySheepBonus {

    /** */
    @Id
    @Column(name = "sheep_id")
    Integer sheepId;

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
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the sheepId.
     * 
     * @return the sheepId
     */
    public Integer getSheepId() {
        return sheepId;
    }

    /** 
     * Sets the sheepId.
     * 
     * @param sheepId the sheepId
     */
    public void setSheepId(Integer sheepId) {
        this.sheepId = sheepId;
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
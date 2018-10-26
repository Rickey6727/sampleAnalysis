package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * 報酬テーブル
 */
@Entity(listener = MBonusGoodsListener.class)
@Table(name = "m_bonus_goods")
public class MBonusGoods {

    /** ボーナスID */
    @Id
    @Column(name = "bonus_id")
    Integer bonusId;

    /** ボーナス連番 */
    @Id
    @Column(name = "bonus_no")
    Integer bonusNo;

    /** 報酬アイテムID */
    @Column(name = "goods_id")
    Integer goodsId;

    /** 報酬アイテム種別 */
    @Column(name = "goods_type")
    Short goodsType;

    /** 報酬アイテム付与数 */
    @Column(name = "goods_count")
    Integer goodsCount;

    /** 登録日時 */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** 
     * Returns the bonusId.
     * 
     * @return the bonusId
     */
    public Integer getBonusId() {
        return bonusId;
    }

    /** 
     * Sets the bonusId.
     * 
     * @param bonusId the bonusId
     */
    public void setBonusId(Integer bonusId) {
        this.bonusId = bonusId;
    }

    /** 
     * Returns the bonusNo.
     * 
     * @return the bonusNo
     */
    public Integer getBonusNo() {
        return bonusNo;
    }

    /** 
     * Sets the bonusNo.
     * 
     * @param bonusNo the bonusNo
     */
    public void setBonusNo(Integer bonusNo) {
        this.bonusNo = bonusNo;
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
     * Returns the goodsType.
     * 
     * @return the goodsType
     */
    public Short getGoodsType() {
        return goodsType;
    }

    /** 
     * Sets the goodsType.
     * 
     * @param goodsType the goodsType
     */
    public void setGoodsType(Short goodsType) {
        this.goodsType = goodsType;
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
}
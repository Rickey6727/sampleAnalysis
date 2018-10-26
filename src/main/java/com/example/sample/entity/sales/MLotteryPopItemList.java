package com.example.sample.entity.sales;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MLotteryPopItemListListener.class)
@Table(name = "m_lottery_pop_item_list")
public class MLotteryPopItemList {

    /** */
    @Id
    @Column(name = "lottery_term_id")
    Integer lotteryTermId;

    /** */
    @Id
    @Column(name = "pop_type")
    Integer popType;

    /** */
    @Id
    @Column(name = "clothes_id")
    Integer clothesId;

    /** 
     * Returns the lotteryTermId.
     * 
     * @return the lotteryTermId
     */
    public Integer getLotteryTermId() {
        return lotteryTermId;
    }

    /** 
     * Sets the lotteryTermId.
     * 
     * @param lotteryTermId the lotteryTermId
     */
    public void setLotteryTermId(Integer lotteryTermId) {
        this.lotteryTermId = lotteryTermId;
    }

    /** 
     * Returns the popType.
     * 
     * @return the popType
     */
    public Integer getPopType() {
        return popType;
    }

    /** 
     * Sets the popType.
     * 
     * @param popType the popType
     */
    public void setPopType(Integer popType) {
        this.popType = popType;
    }

    /** 
     * Returns the clothesId.
     * 
     * @return the clothesId
     */
    public Integer getClothesId() {
        return clothesId;
    }

    /** 
     * Sets the clothesId.
     * 
     * @param clothesId the clothesId
     */
    public void setClothesId(Integer clothesId) {
        this.clothesId = clothesId;
    }
}
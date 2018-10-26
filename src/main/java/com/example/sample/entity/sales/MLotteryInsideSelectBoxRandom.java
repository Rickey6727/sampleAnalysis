package com.example.sample.entity.sales;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MLotteryInsideSelectBoxRandomListener.class)
@Table(name = "m_lottery_inside_select_box_random")
public class MLotteryInsideSelectBoxRandom {

    /** */
    @Id
    @Column(name = "lottery_id")
    Integer lotteryId;

    /** */
    @Id
    @Column(name = "clothes_id")
    Integer clothesId;

    /** 
     * Returns the lotteryId.
     * 
     * @return the lotteryId
     */
    public Integer getLotteryId() {
        return lotteryId;
    }

    /** 
     * Sets the lotteryId.
     * 
     * @param lotteryId the lotteryId
     */
    public void setLotteryId(Integer lotteryId) {
        this.lotteryId = lotteryId;
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
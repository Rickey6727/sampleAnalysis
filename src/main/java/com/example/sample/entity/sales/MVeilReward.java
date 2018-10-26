package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MVeilRewardListener.class)
@Table(name = "m_veil_reward")
public class MVeilReward {

    /** */
    @Id
    @Column(name = "gacha_id")
    Integer gachaId;

    /** */
    @Column(name = "veil_id")
    Integer veilId;

    /** */
    @Column(name = "goods_type")
    Integer goodsType;

    /** */
    @Column(name = "item_val")
    Integer itemVal;

    /** */
    @Column(name = "reward_start_date")
    LocalDateTime rewardStartDate;

    /** */
    @Column(name = "npc_id")
    Integer npcId;

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
     * Returns the veilId.
     * 
     * @return the veilId
     */
    public Integer getVeilId() {
        return veilId;
    }

    /** 
     * Sets the veilId.
     * 
     * @param veilId the veilId
     */
    public void setVeilId(Integer veilId) {
        this.veilId = veilId;
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
     * Returns the rewardStartDate.
     * 
     * @return the rewardStartDate
     */
    public LocalDateTime getRewardStartDate() {
        return rewardStartDate;
    }

    /** 
     * Sets the rewardStartDate.
     * 
     * @param rewardStartDate the rewardStartDate
     */
    public void setRewardStartDate(LocalDateTime rewardStartDate) {
        this.rewardStartDate = rewardStartDate;
    }

    /** 
     * Returns the npcId.
     * 
     * @return the npcId
     */
    public Integer getNpcId() {
        return npcId;
    }

    /** 
     * Sets the npcId.
     * 
     * @param npcId the npcId
     */
    public void setNpcId(Integer npcId) {
        this.npcId = npcId;
    }
}
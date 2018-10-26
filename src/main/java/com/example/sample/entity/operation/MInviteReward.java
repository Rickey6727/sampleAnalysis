package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MInviteRewardListener.class)
@Table(name = "m_invite_reward")
public class MInviteReward {

    /** */
    @Id
    @Column(name = "invite_id")
    Integer inviteId;

    /** */
    @Id
    @Column(name = "invite_num")
    Integer inviteNum;

    /** */
    @Id
    @Column(name = "goods_no")
    Integer goodsNo;

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
     * Returns the inviteId.
     * 
     * @return the inviteId
     */
    public Integer getInviteId() {
        return inviteId;
    }

    /** 
     * Sets the inviteId.
     * 
     * @param inviteId the inviteId
     */
    public void setInviteId(Integer inviteId) {
        this.inviteId = inviteId;
    }

    /** 
     * Returns the inviteNum.
     * 
     * @return the inviteNum
     */
    public Integer getInviteNum() {
        return inviteNum;
    }

    /** 
     * Sets the inviteNum.
     * 
     * @param inviteNum the inviteNum
     */
    public void setInviteNum(Integer inviteNum) {
        this.inviteNum = inviteNum;
    }

    /** 
     * Returns the goodsNo.
     * 
     * @return the goodsNo
     */
    public Integer getGoodsNo() {
        return goodsNo;
    }

    /** 
     * Sets the goodsNo.
     * 
     * @param goodsNo the goodsNo
     */
    public void setGoodsNo(Integer goodsNo) {
        this.goodsNo = goodsNo;
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
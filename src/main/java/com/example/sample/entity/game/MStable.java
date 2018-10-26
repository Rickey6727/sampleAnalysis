package com.example.sample.entity.game;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MStableListener.class)
@Table(name = "m_stable")
public class MStable {

    /** */
    @Id
    @Column(name = "stable_id")
    Integer stableId;

    /** */
    @Column(name = "purchase_point")
    Integer purchasePoint;

    /** */
    @Column(name = "del_flg")
    Integer delFlg;

    /** */
    @Column(name = "sheep_max_birth")
    Integer sheepMaxBirth;

    /** */
    @Column(name = "care_use_num")
    Integer careUseNum;

    /** */
    @Column(name = "start_date")
    LocalDateTime startDate;

    /** */
    @Column(name = "end_date")
    LocalDateTime endDate;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the stableId.
     * 
     * @return the stableId
     */
    public Integer getStableId() {
        return stableId;
    }

    /** 
     * Sets the stableId.
     * 
     * @param stableId the stableId
     */
    public void setStableId(Integer stableId) {
        this.stableId = stableId;
    }

    /** 
     * Returns the purchasePoint.
     * 
     * @return the purchasePoint
     */
    public Integer getPurchasePoint() {
        return purchasePoint;
    }

    /** 
     * Sets the purchasePoint.
     * 
     * @param purchasePoint the purchasePoint
     */
    public void setPurchasePoint(Integer purchasePoint) {
        this.purchasePoint = purchasePoint;
    }

    /** 
     * Returns the delFlg.
     * 
     * @return the delFlg
     */
    public Integer getDelFlg() {
        return delFlg;
    }

    /** 
     * Sets the delFlg.
     * 
     * @param delFlg the delFlg
     */
    public void setDelFlg(Integer delFlg) {
        this.delFlg = delFlg;
    }

    /** 
     * Returns the sheepMaxBirth.
     * 
     * @return the sheepMaxBirth
     */
    public Integer getSheepMaxBirth() {
        return sheepMaxBirth;
    }

    /** 
     * Sets the sheepMaxBirth.
     * 
     * @param sheepMaxBirth the sheepMaxBirth
     */
    public void setSheepMaxBirth(Integer sheepMaxBirth) {
        this.sheepMaxBirth = sheepMaxBirth;
    }

    /** 
     * Returns the careUseNum.
     * 
     * @return the careUseNum
     */
    public Integer getCareUseNum() {
        return careUseNum;
    }

    /** 
     * Sets the careUseNum.
     * 
     * @param careUseNum the careUseNum
     */
    public void setCareUseNum(Integer careUseNum) {
        this.careUseNum = careUseNum;
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
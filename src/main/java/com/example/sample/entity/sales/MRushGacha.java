package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MRushGachaListener.class)
@Table(name = "m_rush_gacha")
public class MRushGacha {

    /** */
    @Id
    @Column(name = "gacha_id")
    Integer gachaId;

    /** */
    @Id
    @Column(name = "rush_cnt")
    Integer rushCnt;

    /** */
    @Column(name = "bonus_give_count")
    Integer bonusGiveCount;

    /** */
    @Column(name = "create_time")
    LocalDateTime createTime;

    /** */
    @Column(name = "update_time")
    LocalDateTime updateTime;

    /** */
    @Column(name = "gacha_kind")
    Integer gachaKind;

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
     * Returns the rushCnt.
     * 
     * @return the rushCnt
     */
    public Integer getRushCnt() {
        return rushCnt;
    }

    /** 
     * Sets the rushCnt.
     * 
     * @param rushCnt the rushCnt
     */
    public void setRushCnt(Integer rushCnt) {
        this.rushCnt = rushCnt;
    }

    /** 
     * Returns the bonusGiveCount.
     * 
     * @return the bonusGiveCount
     */
    public Integer getBonusGiveCount() {
        return bonusGiveCount;
    }

    /** 
     * Sets the bonusGiveCount.
     * 
     * @param bonusGiveCount the bonusGiveCount
     */
    public void setBonusGiveCount(Integer bonusGiveCount) {
        this.bonusGiveCount = bonusGiveCount;
    }

    /** 
     * Returns the createTime.
     * 
     * @return the createTime
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /** 
     * Sets the createTime.
     * 
     * @param createTime the createTime
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /** 
     * Returns the updateTime.
     * 
     * @return the updateTime
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /** 
     * Sets the updateTime.
     * 
     * @param updateTime the updateTime
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    /** 
     * Returns the gachaKind.
     * 
     * @return the gachaKind
     */
    public Integer getGachaKind() {
        return gachaKind;
    }

    /** 
     * Sets the gachaKind.
     * 
     * @param gachaKind the gachaKind
     */
    public void setGachaKind(Integer gachaKind) {
        this.gachaKind = gachaKind;
    }
}
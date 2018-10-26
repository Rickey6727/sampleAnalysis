package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * ボーナスマスタ
 */
@Entity(listener = MBonusListener.class)
@Table(name = "m_bonus")
public class MBonus {

    /** ボーナスID */
    @Id
    @Column(name = "bonus_id")
    Integer bonusId;

    /** 一回り間隔 */
    @Column(name = "bonus_cycle")
    Integer bonusCycle;

    /** 付与総回数 */
    @Column(name = "bonus_total")
    Integer bonusTotal;

    /** 開始日時 */
    @Column(name = "start_date")
    LocalDateTime startDate;

    /** 終了日時 */
    @Column(name = "end_date")
    LocalDateTime endDate;

    /** 削除フラグ */
    @Column(name = "del_flg")
    Short delFlg;

    /** 登録日時 */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "bonus_type")
    Integer bonusType;

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
     * Returns the bonusCycle.
     * 
     * @return the bonusCycle
     */
    public Integer getBonusCycle() {
        return bonusCycle;
    }

    /** 
     * Sets the bonusCycle.
     * 
     * @param bonusCycle the bonusCycle
     */
    public void setBonusCycle(Integer bonusCycle) {
        this.bonusCycle = bonusCycle;
    }

    /** 
     * Returns the bonusTotal.
     * 
     * @return the bonusTotal
     */
    public Integer getBonusTotal() {
        return bonusTotal;
    }

    /** 
     * Sets the bonusTotal.
     * 
     * @param bonusTotal the bonusTotal
     */
    public void setBonusTotal(Integer bonusTotal) {
        this.bonusTotal = bonusTotal;
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
     * Returns the delFlg.
     * 
     * @return the delFlg
     */
    public Short getDelFlg() {
        return delFlg;
    }

    /** 
     * Sets the delFlg.
     * 
     * @param delFlg the delFlg
     */
    public void setDelFlg(Short delFlg) {
        this.delFlg = delFlg;
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
     * Returns the bonusType.
     * 
     * @return the bonusType
     */
    public Integer getBonusType() {
        return bonusType;
    }

    /** 
     * Sets the bonusType.
     * 
     * @param bonusType the bonusType
     */
    public void setBonusType(Integer bonusType) {
        this.bonusType = bonusType;
    }
}
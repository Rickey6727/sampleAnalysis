package com.example.sample.entity.game;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TSheepBonusHistoryListener.class)
@Table(name = "t_sheep_bonus_history")
public class TSheepBonusHistory {

    /** */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "serial_id")
    Long serialId;

    /** */
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Column(name = "sheep_bonus_type")
    Integer sheepBonusType;

    /** */
    @Column(name = "bonus_value")
    Integer bonusValue;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** 
     * Returns the serialId.
     * 
     * @return the serialId
     */
    public Long getSerialId() {
        return serialId;
    }

    /** 
     * Sets the serialId.
     * 
     * @param serialId the serialId
     */
    public void setSerialId(Long serialId) {
        this.serialId = serialId;
    }

    /** 
     * Returns the accountId.
     * 
     * @return the accountId
     */
    public Integer getAccountId() {
        return accountId;
    }

    /** 
     * Sets the accountId.
     * 
     * @param accountId the accountId
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    /** 
     * Returns the sheepBonusType.
     * 
     * @return the sheepBonusType
     */
    public Integer getSheepBonusType() {
        return sheepBonusType;
    }

    /** 
     * Sets the sheepBonusType.
     * 
     * @param sheepBonusType the sheepBonusType
     */
    public void setSheepBonusType(Integer sheepBonusType) {
        this.sheepBonusType = sheepBonusType;
    }

    /** 
     * Returns the bonusValue.
     * 
     * @return the bonusValue
     */
    public Integer getBonusValue() {
        return bonusValue;
    }

    /** 
     * Sets the bonusValue.
     * 
     * @param bonusValue the bonusValue
     */
    public void setBonusValue(Integer bonusValue) {
        this.bonusValue = bonusValue;
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
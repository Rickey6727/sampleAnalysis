package com.example.sample.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TBonusState38Listener.class)
@Table(name = "t_bonus_state_38")
public class TBonusState38 {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Id
    @Column(name = "bonus_id")
    Integer bonusId;

    /** */
    @Column(name = "bonus_no")
    Integer bonusNo;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

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
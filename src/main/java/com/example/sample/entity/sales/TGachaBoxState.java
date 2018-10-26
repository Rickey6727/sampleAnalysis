package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TGachaBoxStateListener.class)
@Table(name = "t_gacha_box_state")
public class TGachaBoxState {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Id
    @Column(name = "gacha_id")
    Integer gachaId;

    /** */
    @Column(name = "number_laps")
    Integer numberLaps;

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
     * Returns the numberLaps.
     * 
     * @return the numberLaps
     */
    public Integer getNumberLaps() {
        return numberLaps;
    }

    /** 
     * Sets the numberLaps.
     * 
     * @param numberLaps the numberLaps
     */
    public void setNumberLaps(Integer numberLaps) {
        this.numberLaps = numberLaps;
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
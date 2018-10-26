package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MGachaBoxSaleListener.class)
@Table(name = "m_gacha_box_sale")
public class MGachaBoxSale {

    /** */
    @Id
    @Column(name = "gacha_id")
    Integer gachaId;

    /** */
    @Id
    @Column(name = "number_laps")
    Integer numberLaps;

    /** */
    @Column(name = "amount")
    Integer amount;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

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
     * Returns the amount.
     * 
     * @return the amount
     */
    public Integer getAmount() {
        return amount;
    }

    /** 
     * Sets the amount.
     * 
     * @param amount the amount
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
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
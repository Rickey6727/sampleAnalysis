package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MTermBillingDaysListener.class)
@Table(name = "m_term_billing_days")
public class MTermBillingDays {

    /** */
    @Id
    @Column(name = "term_type")
    Integer termType;

    /** */
    @Id
    @Column(name = "day")
    Integer day;

    /** */
    @Column(name = "coin")
    Integer coin;

    /** */
    @Column(name = "free_coin")
    Integer freeCoin;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the termType.
     * 
     * @return the termType
     */
    public Integer getTermType() {
        return termType;
    }

    /** 
     * Sets the termType.
     * 
     * @param termType the termType
     */
    public void setTermType(Integer termType) {
        this.termType = termType;
    }

    /** 
     * Returns the day.
     * 
     * @return the day
     */
    public Integer getDay() {
        return day;
    }

    /** 
     * Sets the day.
     * 
     * @param day the day
     */
    public void setDay(Integer day) {
        this.day = day;
    }

    /** 
     * Returns the coin.
     * 
     * @return the coin
     */
    public Integer getCoin() {
        return coin;
    }

    /** 
     * Sets the coin.
     * 
     * @param coin the coin
     */
    public void setCoin(Integer coin) {
        this.coin = coin;
    }

    /** 
     * Returns the freeCoin.
     * 
     * @return the freeCoin
     */
    public Integer getFreeCoin() {
        return freeCoin;
    }

    /** 
     * Sets the freeCoin.
     * 
     * @param freeCoin the freeCoin
     */
    public void setFreeCoin(Integer freeCoin) {
        this.freeCoin = freeCoin;
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
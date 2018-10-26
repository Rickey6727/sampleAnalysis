package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MGachaExchangeListener.class)
@Table(name = "m_gacha_exchange")
public class MGachaExchange {

    /** */
    @Id
    @Column(name = "exchange_id")
    Integer exchangeId;

    /** */
    @Column(name = "gacha_id")
    Integer gachaId;

    /** */
    @Column(name = "exchange_type")
    Integer exchangeType;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** 
     * Returns the exchangeId.
     * 
     * @return the exchangeId
     */
    public Integer getExchangeId() {
        return exchangeId;
    }

    /** 
     * Sets the exchangeId.
     * 
     * @param exchangeId the exchangeId
     */
    public void setExchangeId(Integer exchangeId) {
        this.exchangeId = exchangeId;
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
     * Returns the exchangeType.
     * 
     * @return the exchangeType
     */
    public Integer getExchangeType() {
        return exchangeType;
    }

    /** 
     * Sets the exchangeType.
     * 
     * @param exchangeType the exchangeType
     */
    public void setExchangeType(Integer exchangeType) {
        this.exchangeType = exchangeType;
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
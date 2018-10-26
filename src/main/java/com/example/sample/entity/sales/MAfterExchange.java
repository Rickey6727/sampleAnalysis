package com.example.sample.entity.sales;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MAfterExchangeListener.class)
@Table(name = "m_after_exchange")
public class MAfterExchange {

    /** */
    @Id
    @Column(name = "after_exchange_id")
    Integer afterExchangeId;

    /** */
    @Id
    @Column(name = "no")
    Integer no;

    /** */
    @Column(name = "item_kind")
    Integer itemKind;

    /** */
    @Column(name = "item_id")
    Integer itemId;

    /** */
    @Column(name = "item_count")
    Integer itemCount;

    /** */
    @Id
    @Column(name = "probability_no")
    Integer probabilityNo;

    /** */
    @Column(name = "probability")
    Integer probability;

    /** */
    @Column(name = "message_type")
    Integer messageType;

    /** 
     * Returns the afterExchangeId.
     * 
     * @return the afterExchangeId
     */
    public Integer getAfterExchangeId() {
        return afterExchangeId;
    }

    /** 
     * Sets the afterExchangeId.
     * 
     * @param afterExchangeId the afterExchangeId
     */
    public void setAfterExchangeId(Integer afterExchangeId) {
        this.afterExchangeId = afterExchangeId;
    }

    /** 
     * Returns the no.
     * 
     * @return the no
     */
    public Integer getNo() {
        return no;
    }

    /** 
     * Sets the no.
     * 
     * @param no the no
     */
    public void setNo(Integer no) {
        this.no = no;
    }

    /** 
     * Returns the itemKind.
     * 
     * @return the itemKind
     */
    public Integer getItemKind() {
        return itemKind;
    }

    /** 
     * Sets the itemKind.
     * 
     * @param itemKind the itemKind
     */
    public void setItemKind(Integer itemKind) {
        this.itemKind = itemKind;
    }

    /** 
     * Returns the itemId.
     * 
     * @return the itemId
     */
    public Integer getItemId() {
        return itemId;
    }

    /** 
     * Sets the itemId.
     * 
     * @param itemId the itemId
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /** 
     * Returns the itemCount.
     * 
     * @return the itemCount
     */
    public Integer getItemCount() {
        return itemCount;
    }

    /** 
     * Sets the itemCount.
     * 
     * @param itemCount the itemCount
     */
    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    /** 
     * Returns the probabilityNo.
     * 
     * @return the probabilityNo
     */
    public Integer getProbabilityNo() {
        return probabilityNo;
    }

    /** 
     * Sets the probabilityNo.
     * 
     * @param probabilityNo the probabilityNo
     */
    public void setProbabilityNo(Integer probabilityNo) {
        this.probabilityNo = probabilityNo;
    }

    /** 
     * Returns the probability.
     * 
     * @return the probability
     */
    public Integer getProbability() {
        return probability;
    }

    /** 
     * Sets the probability.
     * 
     * @param probability the probability
     */
    public void setProbability(Integer probability) {
        this.probability = probability;
    }

    /** 
     * Returns the messageType.
     * 
     * @return the messageType
     */
    public Integer getMessageType() {
        return messageType;
    }

    /** 
     * Sets the messageType.
     * 
     * @param messageType the messageType
     */
    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }
}
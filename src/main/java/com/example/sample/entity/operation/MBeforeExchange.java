package com.example.sample.entity.operation;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MBeforeExchangeListener.class)
@Table(name = "m_before_exchange")
public class MBeforeExchange {

    /** */
    @Id
    @Column(name = "before_exchange_id")
    Integer beforeExchangeId;

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

    /** 
     * Returns the beforeExchangeId.
     * 
     * @return the beforeExchangeId
     */
    public Integer getBeforeExchangeId() {
        return beforeExchangeId;
    }

    /** 
     * Sets the beforeExchangeId.
     * 
     * @param beforeExchangeId the beforeExchangeId
     */
    public void setBeforeExchangeId(Integer beforeExchangeId) {
        this.beforeExchangeId = beforeExchangeId;
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
}
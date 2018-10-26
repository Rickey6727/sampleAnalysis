package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TCodeExchangeListener.class)
@Table(name = "t_code_exchange")
public class TCodeExchange {

    /** */
    @Id
    @Column(name = "exchange_cd")
    String exchangeCd;

    /** */
    @Id
    @Column(name = "target_flg")
    Integer targetFlg;

    /** */
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Column(name = "trade_date")
    LocalDateTime tradeDate;

    /** */
    @Column(name = "clothes_id_list")
    String clothesIdList;

    /** 
     * Returns the exchangeCd.
     * 
     * @return the exchangeCd
     */
    public String getExchangeCd() {
        return exchangeCd;
    }

    /** 
     * Sets the exchangeCd.
     * 
     * @param exchangeCd the exchangeCd
     */
    public void setExchangeCd(String exchangeCd) {
        this.exchangeCd = exchangeCd;
    }

    /** 
     * Returns the targetFlg.
     * 
     * @return the targetFlg
     */
    public Integer getTargetFlg() {
        return targetFlg;
    }

    /** 
     * Sets the targetFlg.
     * 
     * @param targetFlg the targetFlg
     */
    public void setTargetFlg(Integer targetFlg) {
        this.targetFlg = targetFlg;
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
     * Returns the tradeDate.
     * 
     * @return the tradeDate
     */
    public LocalDateTime getTradeDate() {
        return tradeDate;
    }

    /** 
     * Sets the tradeDate.
     * 
     * @param tradeDate the tradeDate
     */
    public void setTradeDate(LocalDateTime tradeDate) {
        this.tradeDate = tradeDate;
    }

    /** 
     * Returns the clothesIdList.
     * 
     * @return the clothesIdList
     */
    public String getClothesIdList() {
        return clothesIdList;
    }

    /** 
     * Sets the clothesIdList.
     * 
     * @param clothesIdList the clothesIdList
     */
    public void setClothesIdList(String clothesIdList) {
        this.clothesIdList = clothesIdList;
    }
}
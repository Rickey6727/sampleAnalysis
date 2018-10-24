package com.example.sample.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TGainUser22Listener.class)
@Table(name = "t_gain_user_22")
public class TGainUser22 {

    /** */
    @Column(name = "gain_id")
    Integer gainId;

    /** */
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Column(name = "item_id")
    Integer itemId;

    /** */
    @Column(name = "gain_date")
    LocalDate gainDate;

    /** */
    @Column(name = "add_date")
    LocalDateTime addDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the gainId.
     * 
     * @return the gainId
     */
    public Integer getGainId() {
        return gainId;
    }

    /** 
     * Sets the gainId.
     * 
     * @param gainId the gainId
     */
    public void setGainId(Integer gainId) {
        this.gainId = gainId;
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
     * Returns the gainDate.
     * 
     * @return the gainDate
     */
    public LocalDate getGainDate() {
        return gainDate;
    }

    /** 
     * Sets the gainDate.
     * 
     * @param gainDate the gainDate
     */
    public void setGainDate(LocalDate gainDate) {
        this.gainDate = gainDate;
    }

    /** 
     * Returns the addDate.
     * 
     * @return the addDate
     */
    public LocalDateTime getAddDate() {
        return addDate;
    }

    /** 
     * Sets the addDate.
     * 
     * @param addDate the addDate
     */
    public void setAddDate(LocalDateTime addDate) {
        this.addDate = addDate;
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
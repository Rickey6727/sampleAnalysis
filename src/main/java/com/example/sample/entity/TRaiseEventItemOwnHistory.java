package com.example.sample.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TRaiseEventItemOwnHistoryListener.class)
@Table(name = "t_raise_event_item_own_history")
public class TRaiseEventItemOwnHistory {

    /** */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "serial_id")
    Long serialId;

    /** */
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Column(name = "item_id")
    Integer itemId;

    /** */
    @Column(name = "move_flg")
    Integer moveFlg;

    /** */
    @Column(name = "move_count")
    Integer moveCount;

    /** */
    @Column(name = "rel_account_id")
    Integer relAccountId;

    /** */
    @Column(name = "reason")
    Integer reason;

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
     * Returns the moveFlg.
     * 
     * @return the moveFlg
     */
    public Integer getMoveFlg() {
        return moveFlg;
    }

    /** 
     * Sets the moveFlg.
     * 
     * @param moveFlg the moveFlg
     */
    public void setMoveFlg(Integer moveFlg) {
        this.moveFlg = moveFlg;
    }

    /** 
     * Returns the moveCount.
     * 
     * @return the moveCount
     */
    public Integer getMoveCount() {
        return moveCount;
    }

    /** 
     * Sets the moveCount.
     * 
     * @param moveCount the moveCount
     */
    public void setMoveCount(Integer moveCount) {
        this.moveCount = moveCount;
    }

    /** 
     * Returns the relAccountId.
     * 
     * @return the relAccountId
     */
    public Integer getRelAccountId() {
        return relAccountId;
    }

    /** 
     * Sets the relAccountId.
     * 
     * @param relAccountId the relAccountId
     */
    public void setRelAccountId(Integer relAccountId) {
        this.relAccountId = relAccountId;
    }

    /** 
     * Returns the reason.
     * 
     * @return the reason
     */
    public Integer getReason() {
        return reason;
    }

    /** 
     * Sets the reason.
     * 
     * @param reason the reason
     */
    public void setReason(Integer reason) {
        this.reason = reason;
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
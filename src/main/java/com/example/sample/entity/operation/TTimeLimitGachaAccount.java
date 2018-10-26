package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TTimeLimitGachaAccountListener.class)
@Table(name = "t_time_limit_gacha_account")
public class TTimeLimitGachaAccount {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Column(name = "next_time")
    LocalDateTime nextTime;

    /** */
    @Column(name = "get_num")
    Integer getNum;

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
     * Returns the nextTime.
     * 
     * @return the nextTime
     */
    public LocalDateTime getNextTime() {
        return nextTime;
    }

    /** 
     * Sets the nextTime.
     * 
     * @param nextTime the nextTime
     */
    public void setNextTime(LocalDateTime nextTime) {
        this.nextTime = nextTime;
    }

    /** 
     * Returns the getNum.
     * 
     * @return the getNum
     */
    public Integer getGetNum() {
        return getNum;
    }

    /** 
     * Sets the getNum.
     * 
     * @param getNum the getNum
     */
    public void setGetNum(Integer getNum) {
        this.getNum = getNum;
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
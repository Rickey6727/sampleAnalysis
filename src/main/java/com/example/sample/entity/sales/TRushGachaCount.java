package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TRushGachaCountListener.class)
@Table(name = "t_rush_gacha_count")
public class TRushGachaCount {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Id
    @Column(name = "gacha_id")
    Integer gachaId;

    /** */
    @Column(name = "count_val")
    Integer countVal;

    /** */
    @Column(name = "create_time")
    LocalDateTime createTime;

    /** */
    @Column(name = "update_time")
    LocalDateTime updateTime;

    /** */
    @Id
    @Column(name = "gacha_kind")
    Integer gachaKind;

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
     * Returns the countVal.
     * 
     * @return the countVal
     */
    public Integer getCountVal() {
        return countVal;
    }

    /** 
     * Sets the countVal.
     * 
     * @param countVal the countVal
     */
    public void setCountVal(Integer countVal) {
        this.countVal = countVal;
    }

    /** 
     * Returns the createTime.
     * 
     * @return the createTime
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /** 
     * Sets the createTime.
     * 
     * @param createTime the createTime
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /** 
     * Returns the updateTime.
     * 
     * @return the updateTime
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /** 
     * Sets the updateTime.
     * 
     * @param updateTime the updateTime
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    /** 
     * Returns the gachaKind.
     * 
     * @return the gachaKind
     */
    public Integer getGachaKind() {
        return gachaKind;
    }

    /** 
     * Sets the gachaKind.
     * 
     * @param gachaKind the gachaKind
     */
    public void setGachaKind(Integer gachaKind) {
        this.gachaKind = gachaKind;
    }
}
package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TVeilRewardStateListener.class)
@Table(name = "t_veil_reward_state")
public class TVeilRewardState {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Id
    @Column(name = "gacha_id")
    Integer gachaId;

    /** */
    @Column(name = "gacha_count")
    Integer gachaCount;

    /** */
    @Column(name = "complete_flg")
    Boolean completeFlg;

    /** */
    @Column(name = "reward_flg")
    Boolean rewardFlg;

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
     * Returns the gachaCount.
     * 
     * @return the gachaCount
     */
    public Integer getGachaCount() {
        return gachaCount;
    }

    /** 
     * Sets the gachaCount.
     * 
     * @param gachaCount the gachaCount
     */
    public void setGachaCount(Integer gachaCount) {
        this.gachaCount = gachaCount;
    }

    /** 
     * Returns the completeFlg.
     * 
     * @return the completeFlg
     */
    public Boolean getCompleteFlg() {
        return completeFlg;
    }

    /** 
     * Sets the completeFlg.
     * 
     * @param completeFlg the completeFlg
     */
    public void setCompleteFlg(Boolean completeFlg) {
        this.completeFlg = completeFlg;
    }

    /** 
     * Returns the rewardFlg.
     * 
     * @return the rewardFlg
     */
    public Boolean getRewardFlg() {
        return rewardFlg;
    }

    /** 
     * Sets the rewardFlg.
     * 
     * @param rewardFlg the rewardFlg
     */
    public void setRewardFlg(Boolean rewardFlg) {
        this.rewardFlg = rewardFlg;
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
package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TAdListener.class)
@Table(name = "t_ad")
public class TAd {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Column(name = "ad_type")
    String adType;

    /** */
    @Id
    @Column(name = "reward_type")
    String rewardType;

    /** */
    @Column(name = "count")
    Integer count;

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
     * Returns the adType.
     * 
     * @return the adType
     */
    public String getAdType() {
        return adType;
    }

    /** 
     * Sets the adType.
     * 
     * @param adType the adType
     */
    public void setAdType(String adType) {
        this.adType = adType;
    }

    /** 
     * Returns the rewardType.
     * 
     * @return the rewardType
     */
    public String getRewardType() {
        return rewardType;
    }

    /** 
     * Sets the rewardType.
     * 
     * @param rewardType the rewardType
     */
    public void setRewardType(String rewardType) {
        this.rewardType = rewardType;
    }

    /** 
     * Returns the count.
     * 
     * @return the count
     */
    public Integer getCount() {
        return count;
    }

    /** 
     * Sets the count.
     * 
     * @param count the count
     */
    public void setCount(Integer count) {
        this.count = count;
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
package com.example.sample.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TBannerPopupHistoryListener.class)
@Table(name = "t_banner_popup_history")
public class TBannerPopupHistory {

    /** */
    @Id
    @Column(name = "banner_id")
    Integer bannerId;

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** 
     * Returns the bannerId.
     * 
     * @return the bannerId
     */
    public Integer getBannerId() {
        return bannerId;
    }

    /** 
     * Sets the bannerId.
     * 
     * @param bannerId the bannerId
     */
    public void setBannerId(Integer bannerId) {
        this.bannerId = bannerId;
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
package com.example.sample.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TPushSettingListener.class)
@Table(name = "t_push_setting")
public class TPushSetting {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Id
    @Column(name = "push_type")
    Integer pushType;

    /** */
    @Column(name = "is_allowed")
    Boolean isAllowed;

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
     * Returns the pushType.
     * 
     * @return the pushType
     */
    public Integer getPushType() {
        return pushType;
    }

    /** 
     * Sets the pushType.
     * 
     * @param pushType the pushType
     */
    public void setPushType(Integer pushType) {
        this.pushType = pushType;
    }

    /** 
     * Returns the isAllowed.
     * 
     * @return the isAllowed
     */
    public Boolean getIsAllowed() {
        return isAllowed;
    }

    /** 
     * Sets the isAllowed.
     * 
     * @param isAllowed the isAllowed
     */
    public void setIsAllowed(Boolean isAllowed) {
        this.isAllowed = isAllowed;
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
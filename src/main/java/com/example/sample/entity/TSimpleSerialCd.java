package com.example.sample.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TSimpleSerialCdListener.class)
@Table(name = "t_simple_serial_cd")
public class TSimpleSerialCd {

    /** */
    @Id
    @Column(name = "target_id")
    Integer targetId;

    /** */
    @Id
    @Column(name = "serial_cd")
    String serialCd;

    /** */
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the targetId.
     * 
     * @return the targetId
     */
    public Integer getTargetId() {
        return targetId;
    }

    /** 
     * Sets the targetId.
     * 
     * @param targetId the targetId
     */
    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    /** 
     * Returns the serialCd.
     * 
     * @return the serialCd
     */
    public String getSerialCd() {
        return serialCd;
    }

    /** 
     * Sets the serialCd.
     * 
     * @param serialCd the serialCd
     */
    public void setSerialCd(String serialCd) {
        this.serialCd = serialCd;
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
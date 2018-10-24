package com.example.sample.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TNativeUserListener.class)
@Table(name = "t_native_user")
public class TNativeUser {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Column(name = "alliance_type")
    Integer allianceType;

    /** */
    @Column(name = "uuid")
    String uuid;

    /** */
    @Column(name = "cert")
    String cert;

    /** */
    @Column(name = "device_token")
    String deviceToken;

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
     * Returns the allianceType.
     * 
     * @return the allianceType
     */
    public Integer getAllianceType() {
        return allianceType;
    }

    /** 
     * Sets the allianceType.
     * 
     * @param allianceType the allianceType
     */
    public void setAllianceType(Integer allianceType) {
        this.allianceType = allianceType;
    }

    /** 
     * Returns the uuid.
     * 
     * @return the uuid
     */
    public String getUuid() {
        return uuid;
    }

    /** 
     * Sets the uuid.
     * 
     * @param uuid the uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /** 
     * Returns the cert.
     * 
     * @return the cert
     */
    public String getCert() {
        return cert;
    }

    /** 
     * Sets the cert.
     * 
     * @param cert the cert
     */
    public void setCert(String cert) {
        this.cert = cert;
    }

    /** 
     * Returns the deviceToken.
     * 
     * @return the deviceToken
     */
    public String getDeviceToken() {
        return deviceToken;
    }

    /** 
     * Sets the deviceToken.
     * 
     * @param deviceToken the deviceToken
     */
    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
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
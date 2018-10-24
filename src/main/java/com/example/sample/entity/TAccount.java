package com.example.sample.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TAccountListener.class)
@Table(name = "t_account")
public class TAccount {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

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
    @Column(name = "cookie_info")
    String cookieInfo;

    /** */
    @Column(name = "device_type")
    Integer deviceType;

    /** */
    @Column(name = "ip_address")
    String ipAddress;

    /** */
    @Column(name = "del_flg")
    Integer delFlg;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** */
    @Column(name = "device_id")
    String deviceId;

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
     * Returns the cookieInfo.
     * 
     * @return the cookieInfo
     */
    public String getCookieInfo() {
        return cookieInfo;
    }

    /** 
     * Sets the cookieInfo.
     * 
     * @param cookieInfo the cookieInfo
     */
    public void setCookieInfo(String cookieInfo) {
        this.cookieInfo = cookieInfo;
    }

    /** 
     * Returns the deviceType.
     * 
     * @return the deviceType
     */
    public Integer getDeviceType() {
        return deviceType;
    }

    /** 
     * Sets the deviceType.
     * 
     * @param deviceType the deviceType
     */
    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    }

    /** 
     * Returns the ipAddress.
     * 
     * @return the ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /** 
     * Sets the ipAddress.
     * 
     * @param ipAddress the ipAddress
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /** 
     * Returns the delFlg.
     * 
     * @return the delFlg
     */
    public Integer getDelFlg() {
        return delFlg;
    }

    /** 
     * Sets the delFlg.
     * 
     * @param delFlg the delFlg
     */
    public void setDelFlg(Integer delFlg) {
        this.delFlg = delFlg;
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

    /** 
     * Returns the deviceId.
     * 
     * @return the deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    /** 
     * Sets the deviceId.
     * 
     * @param deviceId the deviceId
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
}
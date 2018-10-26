package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MAndroidAppVersionListener.class)
@Table(name = "m_android_app_version")
public class MAndroidAppVersion {

    /** */
    @Id
    @Column(name = "app_version")
    Float appVersion;

    /** */
    @Column(name = "force_update_flg")
    Short forceUpdateFlg;

    /** */
    @Column(name = "public_flg")
    Integer publicFlg;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** */
    @Column(name = "public_status")
    Short publicStatus;

    /** 
     * Returns the appVersion.
     * 
     * @return the appVersion
     */
    public Float getAppVersion() {
        return appVersion;
    }

    /** 
     * Sets the appVersion.
     * 
     * @param appVersion the appVersion
     */
    public void setAppVersion(Float appVersion) {
        this.appVersion = appVersion;
    }

    /** 
     * Returns the forceUpdateFlg.
     * 
     * @return the forceUpdateFlg
     */
    public Short getForceUpdateFlg() {
        return forceUpdateFlg;
    }

    /** 
     * Sets the forceUpdateFlg.
     * 
     * @param forceUpdateFlg the forceUpdateFlg
     */
    public void setForceUpdateFlg(Short forceUpdateFlg) {
        this.forceUpdateFlg = forceUpdateFlg;
    }

    /** 
     * Returns the publicFlg.
     * 
     * @return the publicFlg
     */
    public Integer getPublicFlg() {
        return publicFlg;
    }

    /** 
     * Sets the publicFlg.
     * 
     * @param publicFlg the publicFlg
     */
    public void setPublicFlg(Integer publicFlg) {
        this.publicFlg = publicFlg;
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
     * Returns the publicStatus.
     * 
     * @return the publicStatus
     */
    public Short getPublicStatus() {
        return publicStatus;
    }

    /** 
     * Sets the publicStatus.
     * 
     * @param publicStatus the publicStatus
     */
    public void setPublicStatus(Short publicStatus) {
        this.publicStatus = publicStatus;
    }
}
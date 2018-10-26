package com.example.sample.entity.manage;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MGachaPushListener.class)
@Table(name = "m_gacha_push")
public class MGachaPush {

    /** */
    @Id
    @Column(name = "gacha_push_typa")
    Integer gachaPushTypa;

    /** */
    @Id
    @Column(name = "country_cd")
    Integer countryCd;

    /** */
    @Column(name = "message")
    String message;

    /** */
    @Column(name = "last_login_date")
    Integer lastLoginDate;

    /** */
    @Column(name = "intervel_date")
    Integer intervelDate;

    /** */
    @Column(name = "before_push_date")
    LocalDateTime beforePushDate;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the gachaPushTypa.
     * 
     * @return the gachaPushTypa
     */
    public Integer getGachaPushTypa() {
        return gachaPushTypa;
    }

    /** 
     * Sets the gachaPushTypa.
     * 
     * @param gachaPushTypa the gachaPushTypa
     */
    public void setGachaPushTypa(Integer gachaPushTypa) {
        this.gachaPushTypa = gachaPushTypa;
    }

    /** 
     * Returns the countryCd.
     * 
     * @return the countryCd
     */
    public Integer getCountryCd() {
        return countryCd;
    }

    /** 
     * Sets the countryCd.
     * 
     * @param countryCd the countryCd
     */
    public void setCountryCd(Integer countryCd) {
        this.countryCd = countryCd;
    }

    /** 
     * Returns the message.
     * 
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /** 
     * Sets the message.
     * 
     * @param message the message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /** 
     * Returns the lastLoginDate.
     * 
     * @return the lastLoginDate
     */
    public Integer getLastLoginDate() {
        return lastLoginDate;
    }

    /** 
     * Sets the lastLoginDate.
     * 
     * @param lastLoginDate the lastLoginDate
     */
    public void setLastLoginDate(Integer lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    /** 
     * Returns the intervelDate.
     * 
     * @return the intervelDate
     */
    public Integer getIntervelDate() {
        return intervelDate;
    }

    /** 
     * Sets the intervelDate.
     * 
     * @param intervelDate the intervelDate
     */
    public void setIntervelDate(Integer intervelDate) {
        this.intervelDate = intervelDate;
    }

    /** 
     * Returns the beforePushDate.
     * 
     * @return the beforePushDate
     */
    public LocalDateTime getBeforePushDate() {
        return beforePushDate;
    }

    /** 
     * Sets the beforePushDate.
     * 
     * @param beforePushDate the beforePushDate
     */
    public void setBeforePushDate(LocalDateTime beforePushDate) {
        this.beforePushDate = beforePushDate;
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
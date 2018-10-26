package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MIpLocatorListener.class)
@Table(name = "m_ip_locator")
public class MIpLocator {

    /** */
    @Column(name = "start_ip_address")
    String startIpAddress;

    /** */
    @Column(name = "end_ip_address")
    String endIpAddress;

    /** */
    @Column(name = "start_number")
    Long startNumber;

    /** */
    @Column(name = "end_number")
    Long endNumber;

    /** */
    @Column(name = "iso_country_cd")
    String isoCountryCd;

    /** */
    @Column(name = "country_name")
    String countryName;

    /** */
    @Column(name = "del_flg")
    Integer delFlg;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the startIpAddress.
     * 
     * @return the startIpAddress
     */
    public String getStartIpAddress() {
        return startIpAddress;
    }

    /** 
     * Sets the startIpAddress.
     * 
     * @param startIpAddress the startIpAddress
     */
    public void setStartIpAddress(String startIpAddress) {
        this.startIpAddress = startIpAddress;
    }

    /** 
     * Returns the endIpAddress.
     * 
     * @return the endIpAddress
     */
    public String getEndIpAddress() {
        return endIpAddress;
    }

    /** 
     * Sets the endIpAddress.
     * 
     * @param endIpAddress the endIpAddress
     */
    public void setEndIpAddress(String endIpAddress) {
        this.endIpAddress = endIpAddress;
    }

    /** 
     * Returns the startNumber.
     * 
     * @return the startNumber
     */
    public Long getStartNumber() {
        return startNumber;
    }

    /** 
     * Sets the startNumber.
     * 
     * @param startNumber the startNumber
     */
    public void setStartNumber(Long startNumber) {
        this.startNumber = startNumber;
    }

    /** 
     * Returns the endNumber.
     * 
     * @return the endNumber
     */
    public Long getEndNumber() {
        return endNumber;
    }

    /** 
     * Sets the endNumber.
     * 
     * @param endNumber the endNumber
     */
    public void setEndNumber(Long endNumber) {
        this.endNumber = endNumber;
    }

    /** 
     * Returns the isoCountryCd.
     * 
     * @return the isoCountryCd
     */
    public String getIsoCountryCd() {
        return isoCountryCd;
    }

    /** 
     * Sets the isoCountryCd.
     * 
     * @param isoCountryCd the isoCountryCd
     */
    public void setIsoCountryCd(String isoCountryCd) {
        this.isoCountryCd = isoCountryCd;
    }

    /** 
     * Returns the countryName.
     * 
     * @return the countryName
     */
    public String getCountryName() {
        return countryName;
    }

    /** 
     * Sets the countryName.
     * 
     * @param countryName the countryName
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
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
}
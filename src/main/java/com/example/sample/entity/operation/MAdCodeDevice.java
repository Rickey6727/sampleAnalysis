package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MAdCodeDeviceListener.class)
@Table(name = "m_ad_code_device")
public class MAdCodeDevice {

    /** */
    @Id
    @Column(name = "device_type")
    Integer deviceType;

    /** */
    @Id
    @Column(name = "ad_code")
    String adCode;

    /** */
    @Column(name = "up_date")
    LocalDateTime upDate;

    /** */
    @Column(name = "del_flg")
    Integer delFlg;

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
     * Returns the adCode.
     * 
     * @return the adCode
     */
    public String getAdCode() {
        return adCode;
    }

    /** 
     * Sets the adCode.
     * 
     * @param adCode the adCode
     */
    public void setAdCode(String adCode) {
        this.adCode = adCode;
    }

    /** 
     * Returns the upDate.
     * 
     * @return the upDate
     */
    public LocalDateTime getUpDate() {
        return upDate;
    }

    /** 
     * Sets the upDate.
     * 
     * @param upDate the upDate
     */
    public void setUpDate(LocalDateTime upDate) {
        this.upDate = upDate;
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
}
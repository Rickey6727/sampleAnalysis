package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MInformationListener.class)
@Table(name = "m_information")
public class MInformation {

    /** */
    @Id
    @Column(name = "info_id")
    Integer infoId;

    /** */
    @Id
    @Column(name = "country_cd")
    Integer countryCd;

    /** */
    @Column(name = "info_title")
    String infoTitle;

    /** */
    @Column(name = "info_message")
    String infoMessage;

    /** */
    @Column(name = "info_type")
    Integer infoType;

    /** */
    @Column(name = "info_date")
    LocalDateTime infoDate;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** */
    @Column(name = "del_flag")
    Integer delFlag;

    /** */
    @Column(name = "ip_event_id")
    Integer ipEventId;

    /** */
    @Column(name = "limit_information_id")
    Integer limitInformationId;

    /** 
     * Returns the infoId.
     * 
     * @return the infoId
     */
    public Integer getInfoId() {
        return infoId;
    }

    /** 
     * Sets the infoId.
     * 
     * @param infoId the infoId
     */
    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
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
     * Returns the infoTitle.
     * 
     * @return the infoTitle
     */
    public String getInfoTitle() {
        return infoTitle;
    }

    /** 
     * Sets the infoTitle.
     * 
     * @param infoTitle the infoTitle
     */
    public void setInfoTitle(String infoTitle) {
        this.infoTitle = infoTitle;
    }

    /** 
     * Returns the infoMessage.
     * 
     * @return the infoMessage
     */
    public String getInfoMessage() {
        return infoMessage;
    }

    /** 
     * Sets the infoMessage.
     * 
     * @param infoMessage the infoMessage
     */
    public void setInfoMessage(String infoMessage) {
        this.infoMessage = infoMessage;
    }

    /** 
     * Returns the infoType.
     * 
     * @return the infoType
     */
    public Integer getInfoType() {
        return infoType;
    }

    /** 
     * Sets the infoType.
     * 
     * @param infoType the infoType
     */
    public void setInfoType(Integer infoType) {
        this.infoType = infoType;
    }

    /** 
     * Returns the infoDate.
     * 
     * @return the infoDate
     */
    public LocalDateTime getInfoDate() {
        return infoDate;
    }

    /** 
     * Sets the infoDate.
     * 
     * @param infoDate the infoDate
     */
    public void setInfoDate(LocalDateTime infoDate) {
        this.infoDate = infoDate;
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
     * Returns the delFlag.
     * 
     * @return the delFlag
     */
    public Integer getDelFlag() {
        return delFlag;
    }

    /** 
     * Sets the delFlag.
     * 
     * @param delFlag the delFlag
     */
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    /** 
     * Returns the ipEventId.
     * 
     * @return the ipEventId
     */
    public Integer getIpEventId() {
        return ipEventId;
    }

    /** 
     * Sets the ipEventId.
     * 
     * @param ipEventId the ipEventId
     */
    public void setIpEventId(Integer ipEventId) {
        this.ipEventId = ipEventId;
    }

    /** 
     * Returns the limitInformationId.
     * 
     * @return the limitInformationId
     */
    public Integer getLimitInformationId() {
        return limitInformationId;
    }

    /** 
     * Sets the limitInformationId.
     * 
     * @param limitInformationId the limitInformationId
     */
    public void setLimitInformationId(Integer limitInformationId) {
        this.limitInformationId = limitInformationId;
    }
}
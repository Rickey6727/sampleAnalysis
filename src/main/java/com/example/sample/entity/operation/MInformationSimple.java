package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MInformationSimpleListener.class)
@Table(name = "m_information_simple")
public class MInformationSimple {

    /** */
    @Id
    @Column(name = "info_id")
    Integer infoId;

    /** */
    @Column(name = "icon_type")
    Integer iconType;

    /** */
    @Column(name = "link_url")
    String linkUrl;

    /** */
    @Column(name = "start_date")
    LocalDateTime startDate;

    /** */
    @Column(name = "end_date")
    LocalDateTime endDate;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** */
    @Column(name = "ip_event_id")
    Integer ipEventId;

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
     * Returns the iconType.
     * 
     * @return the iconType
     */
    public Integer getIconType() {
        return iconType;
    }

    /** 
     * Sets the iconType.
     * 
     * @param iconType the iconType
     */
    public void setIconType(Integer iconType) {
        this.iconType = iconType;
    }

    /** 
     * Returns the linkUrl.
     * 
     * @return the linkUrl
     */
    public String getLinkUrl() {
        return linkUrl;
    }

    /** 
     * Sets the linkUrl.
     * 
     * @param linkUrl the linkUrl
     */
    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    /** 
     * Returns the startDate.
     * 
     * @return the startDate
     */
    public LocalDateTime getStartDate() {
        return startDate;
    }

    /** 
     * Sets the startDate.
     * 
     * @param startDate the startDate
     */
    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    /** 
     * Returns the endDate.
     * 
     * @return the endDate
     */
    public LocalDateTime getEndDate() {
        return endDate;
    }

    /** 
     * Sets the endDate.
     * 
     * @param endDate the endDate
     */
    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
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
}
package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MBannerListener.class)
@Table(name = "m_banner")
public class MBanner {

    /** */
    @Id
    @Column(name = "banner_id")
    Integer bannerId;

    /** */
    @Column(name = "display_order")
    Integer displayOrder;

    /** */
    @Column(name = "page_id")
    Integer pageId;

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
     * Returns the bannerId.
     * 
     * @return the bannerId
     */
    public Integer getBannerId() {
        return bannerId;
    }

    /** 
     * Sets the bannerId.
     * 
     * @param bannerId the bannerId
     */
    public void setBannerId(Integer bannerId) {
        this.bannerId = bannerId;
    }

    /** 
     * Returns the displayOrder.
     * 
     * @return the displayOrder
     */
    public Integer getDisplayOrder() {
        return displayOrder;
    }

    /** 
     * Sets the displayOrder.
     * 
     * @param displayOrder the displayOrder
     */
    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    /** 
     * Returns the pageId.
     * 
     * @return the pageId
     */
    public Integer getPageId() {
        return pageId;
    }

    /** 
     * Sets the pageId.
     * 
     * @param pageId the pageId
     */
    public void setPageId(Integer pageId) {
        this.pageId = pageId;
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
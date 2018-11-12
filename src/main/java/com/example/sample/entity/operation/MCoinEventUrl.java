package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MCoinEventUrlListener.class)
@Table(name = "m_coin_event_url")
public class MCoinEventUrl {

    /** */
    @Id
    @Column(name = "event_id")
    Integer eventId;

    /** */
    @Id
    @Column(name = "country_cd")
    Integer countryCd;

    /** */
    @Column(name = "link_url")
    String linkUrl;

    /** */
    @Column(name = "img_url")
    String imgUrl;

    /** */
    @Column(name = "header_img_url")
    String headerImgUrl;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the eventId.
     * 
     * @return the eventId
     */
    public Integer getEventId() {
        return eventId;
    }

    /** 
     * Sets the eventId.
     * 
     * @param eventId the eventId
     */
    public void setEventId(Integer eventId) {
        this.eventId = eventId;
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
     * Returns the imgUrl.
     * 
     * @return the imgUrl
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /** 
     * Sets the imgUrl.
     * 
     * @param imgUrl the imgUrl
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    /** 
     * Returns the headerImgUrl.
     * 
     * @return the headerImgUrl
     */
    public String getHeaderImgUrl() {
        return headerImgUrl;
    }

    /** 
     * Sets the headerImgUrl.
     * 
     * @param headerImgUrl the headerImgUrl
     */
    public void setHeaderImgUrl(String headerImgUrl) {
        this.headerImgUrl = headerImgUrl;
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
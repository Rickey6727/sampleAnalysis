package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * m_event_country
 */
@Entity(listener = MEventCountryListener.class)
@Table(name = "m_event_country")
public class MEventCountry {

    /** イベントID */
    @Id
    @Column(name = "event_id")
    Integer eventId;

    /** 言語コード */
    @Id
    @Column(name = "country_cd")
    Integer countryCd;

    /** イベント名称 */
    @Column(name = "event_name")
    String eventName;

    /** 説明 */
    @Column(name = "event_description")
    String eventDescription;

    /** 画像URL */
    @Column(name = "image_url")
    String imageUrl;

    /** 詳細情報リンク先 */
    @Column(name = "link_url")
    String linkUrl;

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
     * Returns the eventName.
     * 
     * @return the eventName
     */
    public String getEventName() {
        return eventName;
    }

    /** 
     * Sets the eventName.
     * 
     * @param eventName the eventName
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    /** 
     * Returns the eventDescription.
     * 
     * @return the eventDescription
     */
    public String getEventDescription() {
        return eventDescription;
    }

    /** 
     * Sets the eventDescription.
     * 
     * @param eventDescription the eventDescription
     */
    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    /** 
     * Returns the imageUrl.
     * 
     * @return the imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /** 
     * Sets the imageUrl.
     * 
     * @param imageUrl the imageUrl
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
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
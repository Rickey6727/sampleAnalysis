package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MBannerNameCountryListener.class)
@Table(name = "m_banner_name_country")
public class MBannerNameCountry {

    /** */
    @Id
    @Column(name = "banner_type")
    Integer bannerType;

    /** */
    @Id
    @Column(name = "type_id")
    Integer typeId;

    /** */
    @Id
    @Column(name = "country_cd")
    Integer countryCd;

    /** */
    @Column(name = "text")
    String text;

    /** */
    @Column(name = "image_url")
    String imageUrl;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** */
    @Id
    @Column(name = "display_order")
    Integer displayOrder;

    /** 
     * Returns the bannerType.
     * 
     * @return the bannerType
     */
    public Integer getBannerType() {
        return bannerType;
    }

    /** 
     * Sets the bannerType.
     * 
     * @param bannerType the bannerType
     */
    public void setBannerType(Integer bannerType) {
        this.bannerType = bannerType;
    }

    /** 
     * Returns the typeId.
     * 
     * @return the typeId
     */
    public Integer getTypeId() {
        return typeId;
    }

    /** 
     * Sets the typeId.
     * 
     * @param typeId the typeId
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
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
     * Returns the text.
     * 
     * @return the text
     */
    public String getText() {
        return text;
    }

    /** 
     * Sets the text.
     * 
     * @param text the text
     */
    public void setText(String text) {
        this.text = text;
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
}
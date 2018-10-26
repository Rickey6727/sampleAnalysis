package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MGachaCountryListener.class)
@Table(name = "m_gacha_country")
public class MGachaCountry {

    /** */
    @Id
    @Column(name = "gacha_id")
    Integer gachaId;

    /** */
    @Id
    @Column(name = "country_cd")
    Integer countryCd;

    /** */
    @Column(name = "gacha_title")
    String gachaTitle;

    /** */
    @Column(name = "banner_image_url")
    String bannerImageUrl;

    /** */
    @Column(name = "detail_image_url")
    String detailImageUrl;

    /** */
    @Column(name = "information")
    String information;

    /** */
    @Column(name = "create_time")
    LocalDateTime createTime;

    /** */
    @Column(name = "update_time")
    LocalDateTime updateTime;

    /** */
    @Column(name = "banner_header_image_url")
    String bannerHeaderImageUrl;

    /** */
    @Column(name = "term_banner")
    Integer termBanner;

    /** 
     * Returns the gachaId.
     * 
     * @return the gachaId
     */
    public Integer getGachaId() {
        return gachaId;
    }

    /** 
     * Sets the gachaId.
     * 
     * @param gachaId the gachaId
     */
    public void setGachaId(Integer gachaId) {
        this.gachaId = gachaId;
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
     * Returns the gachaTitle.
     * 
     * @return the gachaTitle
     */
    public String getGachaTitle() {
        return gachaTitle;
    }

    /** 
     * Sets the gachaTitle.
     * 
     * @param gachaTitle the gachaTitle
     */
    public void setGachaTitle(String gachaTitle) {
        this.gachaTitle = gachaTitle;
    }

    /** 
     * Returns the bannerImageUrl.
     * 
     * @return the bannerImageUrl
     */
    public String getBannerImageUrl() {
        return bannerImageUrl;
    }

    /** 
     * Sets the bannerImageUrl.
     * 
     * @param bannerImageUrl the bannerImageUrl
     */
    public void setBannerImageUrl(String bannerImageUrl) {
        this.bannerImageUrl = bannerImageUrl;
    }

    /** 
     * Returns the detailImageUrl.
     * 
     * @return the detailImageUrl
     */
    public String getDetailImageUrl() {
        return detailImageUrl;
    }

    /** 
     * Sets the detailImageUrl.
     * 
     * @param detailImageUrl the detailImageUrl
     */
    public void setDetailImageUrl(String detailImageUrl) {
        this.detailImageUrl = detailImageUrl;
    }

    /** 
     * Returns the information.
     * 
     * @return the information
     */
    public String getInformation() {
        return information;
    }

    /** 
     * Sets the information.
     * 
     * @param information the information
     */
    public void setInformation(String information) {
        this.information = information;
    }

    /** 
     * Returns the createTime.
     * 
     * @return the createTime
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /** 
     * Sets the createTime.
     * 
     * @param createTime the createTime
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /** 
     * Returns the updateTime.
     * 
     * @return the updateTime
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /** 
     * Sets the updateTime.
     * 
     * @param updateTime the updateTime
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    /** 
     * Returns the bannerHeaderImageUrl.
     * 
     * @return the bannerHeaderImageUrl
     */
    public String getBannerHeaderImageUrl() {
        return bannerHeaderImageUrl;
    }

    /** 
     * Sets the bannerHeaderImageUrl.
     * 
     * @param bannerHeaderImageUrl the bannerHeaderImageUrl
     */
    public void setBannerHeaderImageUrl(String bannerHeaderImageUrl) {
        this.bannerHeaderImageUrl = bannerHeaderImageUrl;
    }

    /** 
     * Returns the termBanner.
     * 
     * @return the termBanner
     */
    public Integer getTermBanner() {
        return termBanner;
    }

    /** 
     * Sets the termBanner.
     * 
     * @param termBanner the termBanner
     */
    public void setTermBanner(Integer termBanner) {
        this.termBanner = termBanner;
    }
}
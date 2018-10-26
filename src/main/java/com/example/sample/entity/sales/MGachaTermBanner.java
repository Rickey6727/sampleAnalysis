package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MGachaTermBannerListener.class)
@Table(name = "m_gacha_term_banner")
public class MGachaTermBanner {

    /** */
    @Id
    @Column(name = "gacha_id")
    Integer gachaId;

    /** */
    @Id
    @Column(name = "country_cd")
    Integer countryCd;

    /** */
    @Id
    @Column(name = "term_no")
    Integer termNo;

    /** */
    @Column(name = "start_date")
    LocalDateTime startDate;

    /** */
    @Column(name = "end_date")
    LocalDateTime endDate;

    /** */
    @Column(name = "banner_image_url")
    String bannerImageUrl;

    /** */
    @Column(name = "detail_image_url")
    String detailImageUrl;

    /** */
    @Column(name = "banner_header_image_url")
    String bannerHeaderImageUrl;

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
     * Returns the termNo.
     * 
     * @return the termNo
     */
    public Integer getTermNo() {
        return termNo;
    }

    /** 
     * Sets the termNo.
     * 
     * @param termNo the termNo
     */
    public void setTermNo(Integer termNo) {
        this.termNo = termNo;
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
}
package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MSplashCountryListener.class)
@Table(name = "m_splash_country")
public class MSplashCountry {

    /** */
    @Id
    @Column(name = "splash_id")
    Integer splashId;

    /** */
    @Id
    @Column(name = "country_cd")
    Integer countryCd;

    /** */
    @Column(name = "image_url")
    String imageUrl;

    /** */
    @Column(name = "date_description")
    String dateDescription;

    /** */
    @Column(name = "simple_description")
    String simpleDescription;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the splashId.
     * 
     * @return the splashId
     */
    public Integer getSplashId() {
        return splashId;
    }

    /** 
     * Sets the splashId.
     * 
     * @param splashId the splashId
     */
    public void setSplashId(Integer splashId) {
        this.splashId = splashId;
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
     * Returns the dateDescription.
     * 
     * @return the dateDescription
     */
    public String getDateDescription() {
        return dateDescription;
    }

    /** 
     * Sets the dateDescription.
     * 
     * @param dateDescription the dateDescription
     */
    public void setDateDescription(String dateDescription) {
        this.dateDescription = dateDescription;
    }

    /** 
     * Returns the simpleDescription.
     * 
     * @return the simpleDescription
     */
    public String getSimpleDescription() {
        return simpleDescription;
    }

    /** 
     * Sets the simpleDescription.
     * 
     * @param simpleDescription the simpleDescription
     */
    public void setSimpleDescription(String simpleDescription) {
        this.simpleDescription = simpleDescription;
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
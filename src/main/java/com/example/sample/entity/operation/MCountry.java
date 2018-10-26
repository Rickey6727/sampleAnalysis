package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * m_country
 */
@Entity(listener = MCountryListener.class)
@Table(name = "m_country")
public class MCountry {

    /** 国ID */
    @Id
    @Column(name = "country_id")
    Integer countryId;

    /** 国識別コード */
    @Id
    @Column(name = "country_cd")
    Integer countryCd;

    /** 国名 */
    @Column(name = "country_name")
    String countryName;

    /** 国画像URL */
    @Column(name = "country_image_url")
    String countryImageUrl;

    /** create_date */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** update_date */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the countryId.
     * 
     * @return the countryId
     */
    public Integer getCountryId() {
        return countryId;
    }

    /** 
     * Sets the countryId.
     * 
     * @param countryId the countryId
     */
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
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
     * Returns the countryName.
     * 
     * @return the countryName
     */
    public String getCountryName() {
        return countryName;
    }

    /** 
     * Sets the countryName.
     * 
     * @param countryName the countryName
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /** 
     * Returns the countryImageUrl.
     * 
     * @return the countryImageUrl
     */
    public String getCountryImageUrl() {
        return countryImageUrl;
    }

    /** 
     * Sets the countryImageUrl.
     * 
     * @param countryImageUrl the countryImageUrl
     */
    public void setCountryImageUrl(String countryImageUrl) {
        this.countryImageUrl = countryImageUrl;
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
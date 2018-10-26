package com.example.sample.entity.operation;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MSupportItemCountryListener.class)
@Table(name = "m_support_item_country")
public class MSupportItemCountry {

    /** */
    @Id
    @Column(name = "support_item_id")
    Integer supportItemId;

    /** */
    @Id
    @Column(name = "country_cd")
    Integer countryCd;

    /** */
    @Column(name = "use_popup_img_url")
    String usePopupImgUrl;

    /** 
     * Returns the supportItemId.
     * 
     * @return the supportItemId
     */
    public Integer getSupportItemId() {
        return supportItemId;
    }

    /** 
     * Sets the supportItemId.
     * 
     * @param supportItemId the supportItemId
     */
    public void setSupportItemId(Integer supportItemId) {
        this.supportItemId = supportItemId;
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
     * Returns the usePopupImgUrl.
     * 
     * @return the usePopupImgUrl
     */
    public String getUsePopupImgUrl() {
        return usePopupImgUrl;
    }

    /** 
     * Sets the usePopupImgUrl.
     * 
     * @param usePopupImgUrl the usePopupImgUrl
     */
    public void setUsePopupImgUrl(String usePopupImgUrl) {
        this.usePopupImgUrl = usePopupImgUrl;
    }
}
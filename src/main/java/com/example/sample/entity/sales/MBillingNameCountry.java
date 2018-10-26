package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MBillingNameCountryListener.class)
@Table(name = "m_billing_name_country")
public class MBillingNameCountry {

    /** */
    @Id
    @Column(name = "billing_id")
    Integer billingId;

    /** */
    @Id
    @Column(name = "country_cd")
    Integer countryCd;

    /** */
    @Column(name = "display_name")
    String displayName;

    /** */
    @Column(name = "description")
    String description;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** */
    @Column(name = "sub_display_name")
    String subDisplayName;

    /** */
    @Column(name = "cp_display_name")
    String cpDisplayName;

    /** 
     * Returns the billingId.
     * 
     * @return the billingId
     */
    public Integer getBillingId() {
        return billingId;
    }

    /** 
     * Sets the billingId.
     * 
     * @param billingId the billingId
     */
    public void setBillingId(Integer billingId) {
        this.billingId = billingId;
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
     * Returns the displayName.
     * 
     * @return the displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    /** 
     * Sets the displayName.
     * 
     * @param displayName the displayName
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /** 
     * Returns the description.
     * 
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Sets the description.
     * 
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
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
     * Returns the subDisplayName.
     * 
     * @return the subDisplayName
     */
    public String getSubDisplayName() {
        return subDisplayName;
    }

    /** 
     * Sets the subDisplayName.
     * 
     * @param subDisplayName the subDisplayName
     */
    public void setSubDisplayName(String subDisplayName) {
        this.subDisplayName = subDisplayName;
    }

    /** 
     * Returns the cpDisplayName.
     * 
     * @return the cpDisplayName
     */
    public String getCpDisplayName() {
        return cpDisplayName;
    }

    /** 
     * Sets the cpDisplayName.
     * 
     * @param cpDisplayName the cpDisplayName
     */
    public void setCpDisplayName(String cpDisplayName) {
        this.cpDisplayName = cpDisplayName;
    }
}
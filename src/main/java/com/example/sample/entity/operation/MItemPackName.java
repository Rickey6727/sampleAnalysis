package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MItemPackNameListener.class)
@Table(name = "m_item_pack_name")
public class MItemPackName {

    /** */
    @Id
    @Column(name = "pack_id")
    Integer packId;

    /** */
    @Id
    @Column(name = "country_cd")
    Integer countryCd;

    /** */
    @Column(name = "pack_name")
    String packName;

    /** */
    @Column(name = "pack_description")
    String packDescription;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the packId.
     * 
     * @return the packId
     */
    public Integer getPackId() {
        return packId;
    }

    /** 
     * Sets the packId.
     * 
     * @param packId the packId
     */
    public void setPackId(Integer packId) {
        this.packId = packId;
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
     * Returns the packName.
     * 
     * @return the packName
     */
    public String getPackName() {
        return packName;
    }

    /** 
     * Sets the packName.
     * 
     * @param packName the packName
     */
    public void setPackName(String packName) {
        this.packName = packName;
    }

    /** 
     * Returns the packDescription.
     * 
     * @return the packDescription
     */
    public String getPackDescription() {
        return packDescription;
    }

    /** 
     * Sets the packDescription.
     * 
     * @param packDescription the packDescription
     */
    public void setPackDescription(String packDescription) {
        this.packDescription = packDescription;
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
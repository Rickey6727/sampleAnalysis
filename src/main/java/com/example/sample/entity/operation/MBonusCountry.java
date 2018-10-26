package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * ボーナス名称マスタ
 */
@Entity(listener = MBonusCountryListener.class)
@Table(name = "m_bonus_country")
public class MBonusCountry {

    /** ボーナスID */
    @Id
    @Column(name = "bonus_id")
    Integer bonusId;

    /** 国コード */
    @Id
    @Column(name = "country_cd")
    Integer countryCd;

    /** 名称 */
    @Column(name = "bonus_name")
    String bonusName;

    /** 登録日時 */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** 
     * Returns the bonusId.
     * 
     * @return the bonusId
     */
    public Integer getBonusId() {
        return bonusId;
    }

    /** 
     * Sets the bonusId.
     * 
     * @param bonusId the bonusId
     */
    public void setBonusId(Integer bonusId) {
        this.bonusId = bonusId;
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
     * Returns the bonusName.
     * 
     * @return the bonusName
     */
    public String getBonusName() {
        return bonusName;
    }

    /** 
     * Sets the bonusName.
     * 
     * @param bonusName the bonusName
     */
    public void setBonusName(String bonusName) {
        this.bonusName = bonusName;
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
}
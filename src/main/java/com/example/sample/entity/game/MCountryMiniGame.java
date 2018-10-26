package com.example.sample.entity.game;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MCountryMiniGameListener.class)
@Table(name = "m_country_mini_game")
public class MCountryMiniGame {

    /** */
    @Id
    @Column(name = "country_cd")
    Integer countryCd;

    /** */
    @Id
    @Column(name = "type")
    Integer type;

    /** */
    @Id
    @Column(name = "id")
    Integer id;

    /** */
    @Column(name = "name")
    String name;

    /** */
    @Column(name = "explanation")
    String explanation;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

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
     * Returns the type.
     * 
     * @return the type
     */
    public Integer getType() {
        return type;
    }

    /** 
     * Sets the type.
     * 
     * @param type the type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /** 
     * Returns the id.
     * 
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /** 
     * Sets the id.
     * 
     * @param id the id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /** 
     * Returns the name.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /** 
     * Sets the name.
     * 
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Returns the explanation.
     * 
     * @return the explanation
     */
    public String getExplanation() {
        return explanation;
    }

    /** 
     * Sets the explanation.
     * 
     * @param explanation the explanation
     */
    public void setExplanation(String explanation) {
        this.explanation = explanation;
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
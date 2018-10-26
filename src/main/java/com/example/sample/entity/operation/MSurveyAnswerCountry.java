package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MSurveyAnswerCountryListener.class)
@Table(name = "m_survey_answer_country")
public class MSurveyAnswerCountry {

    /** */
    @Id
    @Column(name = "survey_answer_id")
    Integer surveyAnswerId;

    /** */
    @Id
    @Column(name = "index")
    Integer index;

    /** */
    @Id
    @Column(name = "country_cd")
    Integer countryCd;

    /** */
    @Column(name = "text")
    String text;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the surveyAnswerId.
     * 
     * @return the surveyAnswerId
     */
    public Integer getSurveyAnswerId() {
        return surveyAnswerId;
    }

    /** 
     * Sets the surveyAnswerId.
     * 
     * @param surveyAnswerId the surveyAnswerId
     */
    public void setSurveyAnswerId(Integer surveyAnswerId) {
        this.surveyAnswerId = surveyAnswerId;
    }

    /** 
     * Returns the index.
     * 
     * @return the index
     */
    public Integer getIndex() {
        return index;
    }

    /** 
     * Sets the index.
     * 
     * @param index the index
     */
    public void setIndex(Integer index) {
        this.index = index;
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
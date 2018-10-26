package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MSurveyQuestionCountryListener.class)
@Table(name = "m_survey_question_country")
public class MSurveyQuestionCountry {

    /** */
    @Id
    @Column(name = "survey_question_id")
    Integer surveyQuestionId;

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
     * Returns the surveyQuestionId.
     * 
     * @return the surveyQuestionId
     */
    public Integer getSurveyQuestionId() {
        return surveyQuestionId;
    }

    /** 
     * Sets the surveyQuestionId.
     * 
     * @param surveyQuestionId the surveyQuestionId
     */
    public void setSurveyQuestionId(Integer surveyQuestionId) {
        this.surveyQuestionId = surveyQuestionId;
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
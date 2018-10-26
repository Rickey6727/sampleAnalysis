package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MSurveyQuestionListener.class)
@Table(name = "m_survey_question")
public class MSurveyQuestion {

    /** */
    @Id
    @Column(name = "survey_question_id")
    Integer surveyQuestionId;

    /** */
    @Column(name = "survey_id")
    Integer surveyId;

    /** */
    @Column(name = "country_cd")
    Integer countryCd;

    /** */
    @Column(name = "type")
    Integer type;

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
     * Returns the surveyId.
     * 
     * @return the surveyId
     */
    public Integer getSurveyId() {
        return surveyId;
    }

    /** 
     * Sets the surveyId.
     * 
     * @param surveyId the surveyId
     */
    public void setSurveyId(Integer surveyId) {
        this.surveyId = surveyId;
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
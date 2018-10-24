package com.example.sample.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TSurveyAnswerListener.class)
@Table(name = "t_survey_answer")
public class TSurveyAnswer {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Id
    @Column(name = "survey_id")
    Integer surveyId;

    /** */
    @Id
    @Column(name = "answer_id")
    Integer answerId;

    /** */
    @Column(name = "country_cd")
    Integer countryCd;

    /** */
    @Id
    @Column(name = "index")
    Integer index;

    /** */
    @Column(name = "answer_value")
    String answerValue;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the accountId.
     * 
     * @return the accountId
     */
    public Integer getAccountId() {
        return accountId;
    }

    /** 
     * Sets the accountId.
     * 
     * @param accountId the accountId
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
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
     * Returns the answerId.
     * 
     * @return the answerId
     */
    public Integer getAnswerId() {
        return answerId;
    }

    /** 
     * Sets the answerId.
     * 
     * @param answerId the answerId
     */
    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
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
     * Returns the answerValue.
     * 
     * @return the answerValue
     */
    public String getAnswerValue() {
        return answerValue;
    }

    /** 
     * Sets the answerValue.
     * 
     * @param answerValue the answerValue
     */
    public void setAnswerValue(String answerValue) {
        this.answerValue = answerValue;
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
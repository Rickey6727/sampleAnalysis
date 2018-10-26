package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MQuestConditionNameListener.class)
@Table(name = "m_quest_condition_name")
public class MQuestConditionName {

    /** */
    @Id
    @Column(name = "condition_id")
    Integer conditionId;

    /** */
    @Id
    @Column(name = "condition_no")
    Integer conditionNo;

    /** */
    @Id
    @Column(name = "country_cd")
    Integer countryCd;

    /** */
    @Column(name = "message")
    String message;

    /** */
    @Column(name = "btn_message")
    String btnMessage;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the conditionId.
     * 
     * @return the conditionId
     */
    public Integer getConditionId() {
        return conditionId;
    }

    /** 
     * Sets the conditionId.
     * 
     * @param conditionId the conditionId
     */
    public void setConditionId(Integer conditionId) {
        this.conditionId = conditionId;
    }

    /** 
     * Returns the conditionNo.
     * 
     * @return the conditionNo
     */
    public Integer getConditionNo() {
        return conditionNo;
    }

    /** 
     * Sets the conditionNo.
     * 
     * @param conditionNo the conditionNo
     */
    public void setConditionNo(Integer conditionNo) {
        this.conditionNo = conditionNo;
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
     * Returns the message.
     * 
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /** 
     * Sets the message.
     * 
     * @param message the message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /** 
     * Returns the btnMessage.
     * 
     * @return the btnMessage
     */
    public String getBtnMessage() {
        return btnMessage;
    }

    /** 
     * Sets the btnMessage.
     * 
     * @param btnMessage the btnMessage
     */
    public void setBtnMessage(String btnMessage) {
        this.btnMessage = btnMessage;
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
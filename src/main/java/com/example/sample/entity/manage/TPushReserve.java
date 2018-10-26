package com.example.sample.entity.manage;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TPushReserveListener.class)
@Table(name = "t_push_reserve")
public class TPushReserve {

    /** */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "serial_id")
    Long serialId;

    /** */
    @Column(name = "country_cd")
    Integer countryCd;

    /** */
    @Column(name = "inform_date")
    LocalDateTime informDate;

    /** */
    @Column(name = "message")
    String message;

    /** */
    @Column(name = "inform_condition")
    Integer informCondition;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the serialId.
     * 
     * @return the serialId
     */
    public Long getSerialId() {
        return serialId;
    }

    /** 
     * Sets the serialId.
     * 
     * @param serialId the serialId
     */
    public void setSerialId(Long serialId) {
        this.serialId = serialId;
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
     * Returns the informDate.
     * 
     * @return the informDate
     */
    public LocalDateTime getInformDate() {
        return informDate;
    }

    /** 
     * Sets the informDate.
     * 
     * @param informDate the informDate
     */
    public void setInformDate(LocalDateTime informDate) {
        this.informDate = informDate;
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
     * Returns the informCondition.
     * 
     * @return the informCondition
     */
    public Integer getInformCondition() {
        return informCondition;
    }

    /** 
     * Sets the informCondition.
     * 
     * @param informCondition the informCondition
     */
    public void setInformCondition(Integer informCondition) {
        this.informCondition = informCondition;
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
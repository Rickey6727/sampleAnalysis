package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MGainListener.class)
@Table(name = "m_gain")
public class MGain {

    /** */
    @Id
    @Column(name = "gain_id")
    Integer gainId;

    /** */
    @Column(name = "gain_type")
    Integer gainType;

    /** */
    @Column(name = "start_date")
    LocalDateTime startDate;

    /** */
    @Column(name = "end_date")
    LocalDateTime endDate;

    /** */
    @Column(name = "repeat_type")
    Integer repeatType;

    /** */
    @Column(name = "del_flg")
    Integer delFlg;

    /** */
    @Column(name = "add_date")
    LocalDateTime addDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the gainId.
     * 
     * @return the gainId
     */
    public Integer getGainId() {
        return gainId;
    }

    /** 
     * Sets the gainId.
     * 
     * @param gainId the gainId
     */
    public void setGainId(Integer gainId) {
        this.gainId = gainId;
    }

    /** 
     * Returns the gainType.
     * 
     * @return the gainType
     */
    public Integer getGainType() {
        return gainType;
    }

    /** 
     * Sets the gainType.
     * 
     * @param gainType the gainType
     */
    public void setGainType(Integer gainType) {
        this.gainType = gainType;
    }

    /** 
     * Returns the startDate.
     * 
     * @return the startDate
     */
    public LocalDateTime getStartDate() {
        return startDate;
    }

    /** 
     * Sets the startDate.
     * 
     * @param startDate the startDate
     */
    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    /** 
     * Returns the endDate.
     * 
     * @return the endDate
     */
    public LocalDateTime getEndDate() {
        return endDate;
    }

    /** 
     * Sets the endDate.
     * 
     * @param endDate the endDate
     */
    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    /** 
     * Returns the repeatType.
     * 
     * @return the repeatType
     */
    public Integer getRepeatType() {
        return repeatType;
    }

    /** 
     * Sets the repeatType.
     * 
     * @param repeatType the repeatType
     */
    public void setRepeatType(Integer repeatType) {
        this.repeatType = repeatType;
    }

    /** 
     * Returns the delFlg.
     * 
     * @return the delFlg
     */
    public Integer getDelFlg() {
        return delFlg;
    }

    /** 
     * Sets the delFlg.
     * 
     * @param delFlg the delFlg
     */
    public void setDelFlg(Integer delFlg) {
        this.delFlg = delFlg;
    }

    /** 
     * Returns the addDate.
     * 
     * @return the addDate
     */
    public LocalDateTime getAddDate() {
        return addDate;
    }

    /** 
     * Sets the addDate.
     * 
     * @param addDate the addDate
     */
    public void setAddDate(LocalDateTime addDate) {
        this.addDate = addDate;
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
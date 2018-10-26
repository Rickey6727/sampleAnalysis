package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MCodeExchangeListener.class)
@Table(name = "m_code_exchange")
public class MCodeExchange {

    /** */
    @Id
    @Column(name = "target_flg")
    Integer targetFlg;

    /** */
    @Column(name = "start_date")
    LocalDateTime startDate;

    /** */
    @Column(name = "end_date")
    LocalDateTime endDate;

    /** */
    @Column(name = "del_flg")
    Integer delFlg;

    /** */
    @Column(name = "collaborate_flg")
    Short collaborateFlg;

    /** 
     * Returns the targetFlg.
     * 
     * @return the targetFlg
     */
    public Integer getTargetFlg() {
        return targetFlg;
    }

    /** 
     * Sets the targetFlg.
     * 
     * @param targetFlg the targetFlg
     */
    public void setTargetFlg(Integer targetFlg) {
        this.targetFlg = targetFlg;
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
     * Returns the collaborateFlg.
     * 
     * @return the collaborateFlg
     */
    public Short getCollaborateFlg() {
        return collaborateFlg;
    }

    /** 
     * Sets the collaborateFlg.
     * 
     * @param collaborateFlg the collaborateFlg
     */
    public void setCollaborateFlg(Short collaborateFlg) {
        this.collaborateFlg = collaborateFlg;
    }
}
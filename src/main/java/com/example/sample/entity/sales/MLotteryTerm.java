package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MLotteryTermListener.class)
@Table(name = "m_lottery_term")
public class MLotteryTerm {

    /** */
    @Id
    @Column(name = "lottery_term_id")
    Integer lotteryTermId;

    /** */
    @Column(name = "start_date")
    LocalDateTime startDate;

    /** */
    @Column(name = "end_date")
    LocalDateTime endDate;

    /** */
    @Column(name = "img_path")
    String imgPath;

    /** 
     * Returns the lotteryTermId.
     * 
     * @return the lotteryTermId
     */
    public Integer getLotteryTermId() {
        return lotteryTermId;
    }

    /** 
     * Sets the lotteryTermId.
     * 
     * @param lotteryTermId the lotteryTermId
     */
    public void setLotteryTermId(Integer lotteryTermId) {
        this.lotteryTermId = lotteryTermId;
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
     * Returns the imgPath.
     * 
     * @return the imgPath
     */
    public String getImgPath() {
        return imgPath;
    }

    /** 
     * Sets the imgPath.
     * 
     * @param imgPath the imgPath
     */
    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
}
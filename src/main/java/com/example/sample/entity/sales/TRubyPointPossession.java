package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TRubyPointPossessionListener.class)
@Table(name = "t_ruby_point_possession")
public class TRubyPointPossession {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Id
    @Column(name = "gacha_id")
    Integer gachaId;

    /** */
    @Column(name = "point")
    Integer point;

    /** */
    @Column(name = "total_point")
    Integer totalPoint;

    /** */
    @Column(name = "fever_point")
    Integer feverPoint;

    /** */
    @Column(name = "fever")
    Boolean fever;

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
     * Returns the gachaId.
     * 
     * @return the gachaId
     */
    public Integer getGachaId() {
        return gachaId;
    }

    /** 
     * Sets the gachaId.
     * 
     * @param gachaId the gachaId
     */
    public void setGachaId(Integer gachaId) {
        this.gachaId = gachaId;
    }

    /** 
     * Returns the point.
     * 
     * @return the point
     */
    public Integer getPoint() {
        return point;
    }

    /** 
     * Sets the point.
     * 
     * @param point the point
     */
    public void setPoint(Integer point) {
        this.point = point;
    }

    /** 
     * Returns the totalPoint.
     * 
     * @return the totalPoint
     */
    public Integer getTotalPoint() {
        return totalPoint;
    }

    /** 
     * Sets the totalPoint.
     * 
     * @param totalPoint the totalPoint
     */
    public void setTotalPoint(Integer totalPoint) {
        this.totalPoint = totalPoint;
    }

    /** 
     * Returns the feverPoint.
     * 
     * @return the feverPoint
     */
    public Integer getFeverPoint() {
        return feverPoint;
    }

    /** 
     * Sets the feverPoint.
     * 
     * @param feverPoint the feverPoint
     */
    public void setFeverPoint(Integer feverPoint) {
        this.feverPoint = feverPoint;
    }

    /** 
     * Returns the fever.
     * 
     * @return the fever
     */
    public Boolean getFever() {
        return fever;
    }

    /** 
     * Sets the fever.
     * 
     * @param fever the fever
     */
    public void setFever(Boolean fever) {
        this.fever = fever;
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
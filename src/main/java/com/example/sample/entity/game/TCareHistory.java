package com.example.sample.entity.game;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TCareHistoryListener.class)
@Table(name = "t_care_history")
public class TCareHistory {

    /** */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "serial_id")
    Long serialId;

    /** */
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Column(name = "care_id")
    Integer careId;

    /** */
    @Column(name = "use_point")
    Integer usePoint;

    /** */
    @Column(name = "frame_id")
    Integer frameId;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

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
     * Returns the careId.
     * 
     * @return the careId
     */
    public Integer getCareId() {
        return careId;
    }

    /** 
     * Sets the careId.
     * 
     * @param careId the careId
     */
    public void setCareId(Integer careId) {
        this.careId = careId;
    }

    /** 
     * Returns the usePoint.
     * 
     * @return the usePoint
     */
    public Integer getUsePoint() {
        return usePoint;
    }

    /** 
     * Sets the usePoint.
     * 
     * @param usePoint the usePoint
     */
    public void setUsePoint(Integer usePoint) {
        this.usePoint = usePoint;
    }

    /** 
     * Returns the frameId.
     * 
     * @return the frameId
     */
    public Integer getFrameId() {
        return frameId;
    }

    /** 
     * Sets the frameId.
     * 
     * @param frameId the frameId
     */
    public void setFrameId(Integer frameId) {
        this.frameId = frameId;
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
}
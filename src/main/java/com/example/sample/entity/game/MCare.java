package com.example.sample.entity.game;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MCareListener.class)
@Table(name = "m_care")
public class MCare {

    /** */
    @Id
    @Column(name = "care_id")
    Integer careId;

    /** */
    @Column(name = "appearance_stable_id")
    Integer appearanceStableId;

    /** */
    @Column(name = "use_point")
    Integer usePoint;

    /** */
    @Column(name = "del_flg")
    Integer delFlg;

    /** */
    @Column(name = "start_date")
    LocalDateTime startDate;

    /** */
    @Column(name = "end_date")
    LocalDateTime endDate;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

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
     * Returns the appearanceStableId.
     * 
     * @return the appearanceStableId
     */
    public Integer getAppearanceStableId() {
        return appearanceStableId;
    }

    /** 
     * Sets the appearanceStableId.
     * 
     * @param appearanceStableId the appearanceStableId
     */
    public void setAppearanceStableId(Integer appearanceStableId) {
        this.appearanceStableId = appearanceStableId;
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
package com.example.sample.entity.game;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MAppearanceListener.class)
@Table(name = "m_appearance")
public class MAppearance {

    /** */
    @Column(name = "sheep_id")
    Integer sheepId;

    /** */
    @Column(name = "appearance_type")
    Integer appearanceType;

    /** */
    @Column(name = "appearance_id")
    Integer appearanceId;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the sheepId.
     * 
     * @return the sheepId
     */
    public Integer getSheepId() {
        return sheepId;
    }

    /** 
     * Sets the sheepId.
     * 
     * @param sheepId the sheepId
     */
    public void setSheepId(Integer sheepId) {
        this.sheepId = sheepId;
    }

    /** 
     * Returns the appearanceType.
     * 
     * @return the appearanceType
     */
    public Integer getAppearanceType() {
        return appearanceType;
    }

    /** 
     * Sets the appearanceType.
     * 
     * @param appearanceType the appearanceType
     */
    public void setAppearanceType(Integer appearanceType) {
        this.appearanceType = appearanceType;
    }

    /** 
     * Returns the appearanceId.
     * 
     * @return the appearanceId
     */
    public Integer getAppearanceId() {
        return appearanceId;
    }

    /** 
     * Sets the appearanceId.
     * 
     * @param appearanceId the appearanceId
     */
    public void setAppearanceId(Integer appearanceId) {
        this.appearanceId = appearanceId;
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
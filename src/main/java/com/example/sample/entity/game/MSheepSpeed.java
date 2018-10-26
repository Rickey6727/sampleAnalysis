package com.example.sample.entity.game;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MSheepSpeedListener.class)
@Table(name = "m_sheep_speed")
public class MSheepSpeed {

    /** */
    @Id
    @Column(name = "sheep_id")
    Integer sheepId;

    /** */
    @Id
    @Column(name = "speed")
    Integer speed;

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
     * Returns the speed.
     * 
     * @return the speed
     */
    public Integer getSpeed() {
        return speed;
    }

    /** 
     * Sets the speed.
     * 
     * @param speed the speed
     */
    public void setSpeed(Integer speed) {
        this.speed = speed;
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
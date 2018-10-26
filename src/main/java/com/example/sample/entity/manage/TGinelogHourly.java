package com.example.sample.entity.manage;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TGinelogHourlyListener.class)
@Table(name = "t_ginelog_hourly")
public class TGinelogHourly {

    /** */
    @Id
    @Column(name = "type")
    String type;

    /** */
    @Id
    @Column(name = "target_time")
    LocalDateTime targetTime;

    /** */
    @Column(name = "consumption")
    Integer consumption;

    /** 
     * Returns the type.
     * 
     * @return the type
     */
    public String getType() {
        return type;
    }

    /** 
     * Sets the type.
     * 
     * @param type the type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Returns the targetTime.
     * 
     * @return the targetTime
     */
    public LocalDateTime getTargetTime() {
        return targetTime;
    }

    /** 
     * Sets the targetTime.
     * 
     * @param targetTime the targetTime
     */
    public void setTargetTime(LocalDateTime targetTime) {
        this.targetTime = targetTime;
    }

    /** 
     * Returns the consumption.
     * 
     * @return the consumption
     */
    public Integer getConsumption() {
        return consumption;
    }

    /** 
     * Sets the consumption.
     * 
     * @param consumption the consumption
     */
    public void setConsumption(Integer consumption) {
        this.consumption = consumption;
    }
}
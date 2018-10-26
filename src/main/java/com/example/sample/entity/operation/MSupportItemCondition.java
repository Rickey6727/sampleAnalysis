package com.example.sample.entity.operation;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MSupportItemConditionListener.class)
@Table(name = "m_support_item_condition")
public class MSupportItemCondition {

    /** */
    @Id
    @Column(name = "support_item_id")
    Integer supportItemId;

    /** */
    @Column(name = "support_item_type")
    Integer supportItemType;

    /** */
    @Column(name = "condition_value")
    Integer conditionValue;

    /** */
    @Column(name = "active_time_of_minutes")
    Integer activeTimeOfMinutes;

    /** 
     * Returns the supportItemId.
     * 
     * @return the supportItemId
     */
    public Integer getSupportItemId() {
        return supportItemId;
    }

    /** 
     * Sets the supportItemId.
     * 
     * @param supportItemId the supportItemId
     */
    public void setSupportItemId(Integer supportItemId) {
        this.supportItemId = supportItemId;
    }

    /** 
     * Returns the supportItemType.
     * 
     * @return the supportItemType
     */
    public Integer getSupportItemType() {
        return supportItemType;
    }

    /** 
     * Sets the supportItemType.
     * 
     * @param supportItemType the supportItemType
     */
    public void setSupportItemType(Integer supportItemType) {
        this.supportItemType = supportItemType;
    }

    /** 
     * Returns the conditionValue.
     * 
     * @return the conditionValue
     */
    public Integer getConditionValue() {
        return conditionValue;
    }

    /** 
     * Sets the conditionValue.
     * 
     * @param conditionValue the conditionValue
     */
    public void setConditionValue(Integer conditionValue) {
        this.conditionValue = conditionValue;
    }

    /** 
     * Returns the activeTimeOfMinutes.
     * 
     * @return the activeTimeOfMinutes
     */
    public Integer getActiveTimeOfMinutes() {
        return activeTimeOfMinutes;
    }

    /** 
     * Sets the activeTimeOfMinutes.
     * 
     * @param activeTimeOfMinutes the activeTimeOfMinutes
     */
    public void setActiveTimeOfMinutes(Integer activeTimeOfMinutes) {
        this.activeTimeOfMinutes = activeTimeOfMinutes;
    }
}
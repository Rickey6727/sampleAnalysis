package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MGachaProductionListener.class)
@Table(name = "m_gacha_production")
public class MGachaProduction {

    /** */
    @Id
    @Column(name = "gacha_id")
    Integer gachaId;

    /** */
    @Id
    @Column(name = "step_id")
    Integer stepId;

    /** */
    @Id
    @Column(name = "production_rarity")
    Integer productionRarity;

    /** */
    @Id
    @Column(name = "production_type")
    Integer productionType;

    /** */
    @Id
    @Column(name = "production_id")
    Integer productionId;

    /** */
    @Column(name = "probability")
    Integer probability;

    /** */
    @Column(name = "next_step_id")
    Integer nextStepId;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

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
     * Returns the stepId.
     * 
     * @return the stepId
     */
    public Integer getStepId() {
        return stepId;
    }

    /** 
     * Sets the stepId.
     * 
     * @param stepId the stepId
     */
    public void setStepId(Integer stepId) {
        this.stepId = stepId;
    }

    /** 
     * Returns the productionRarity.
     * 
     * @return the productionRarity
     */
    public Integer getProductionRarity() {
        return productionRarity;
    }

    /** 
     * Sets the productionRarity.
     * 
     * @param productionRarity the productionRarity
     */
    public void setProductionRarity(Integer productionRarity) {
        this.productionRarity = productionRarity;
    }

    /** 
     * Returns the productionType.
     * 
     * @return the productionType
     */
    public Integer getProductionType() {
        return productionType;
    }

    /** 
     * Sets the productionType.
     * 
     * @param productionType the productionType
     */
    public void setProductionType(Integer productionType) {
        this.productionType = productionType;
    }

    /** 
     * Returns the productionId.
     * 
     * @return the productionId
     */
    public Integer getProductionId() {
        return productionId;
    }

    /** 
     * Sets the productionId.
     * 
     * @param productionId the productionId
     */
    public void setProductionId(Integer productionId) {
        this.productionId = productionId;
    }

    /** 
     * Returns the probability.
     * 
     * @return the probability
     */
    public Integer getProbability() {
        return probability;
    }

    /** 
     * Sets the probability.
     * 
     * @param probability the probability
     */
    public void setProbability(Integer probability) {
        this.probability = probability;
    }

    /** 
     * Returns the nextStepId.
     * 
     * @return the nextStepId
     */
    public Integer getNextStepId() {
        return nextStepId;
    }

    /** 
     * Sets the nextStepId.
     * 
     * @param nextStepId the nextStepId
     */
    public void setNextStepId(Integer nextStepId) {
        this.nextStepId = nextStepId;
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
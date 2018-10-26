package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MRubyPointGrantListener.class)
@Table(name = "m_ruby_point_grant")
public class MRubyPointGrant {

    /** */
    @Id
    @Column(name = "gacha_id")
    Integer gachaId;

    /** */
    @Id
    @Column(name = "ruby_lot_grant_type")
    Integer rubyLotGrantType;

    /** */
    @Id
    @Column(name = "sub_id")
    Integer subId;

    /** */
    @Column(name = "point")
    Integer point;

    /** */
    @Column(name = "probability")
    Integer probability;

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
     * Returns the rubyLotGrantType.
     * 
     * @return the rubyLotGrantType
     */
    public Integer getRubyLotGrantType() {
        return rubyLotGrantType;
    }

    /** 
     * Sets the rubyLotGrantType.
     * 
     * @param rubyLotGrantType the rubyLotGrantType
     */
    public void setRubyLotGrantType(Integer rubyLotGrantType) {
        this.rubyLotGrantType = rubyLotGrantType;
    }

    /** 
     * Returns the subId.
     * 
     * @return the subId
     */
    public Integer getSubId() {
        return subId;
    }

    /** 
     * Sets the subId.
     * 
     * @param subId the subId
     */
    public void setSubId(Integer subId) {
        this.subId = subId;
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
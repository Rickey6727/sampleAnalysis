package com.example.sample.entity.sales;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TRubyPointTmpHistoryListener.class)
@Table(name = "t_ruby_point_tmp_history")
public class TRubyPointTmpHistory {

    /** */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "serial_id")
    Long serialId;

    /** */
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Column(name = "gacha_id")
    Integer gachaId;

    /** */
    @Column(name = "ruby_point")
    Integer rubyPoint;

    /** */
    @Column(name = "before_ruby_point_possession")
    Integer beforeRubyPointPossession;

    /** */
    @Column(name = "ruby_point_possession")
    Integer rubyPointPossession;

    /** */
    @Column(name = "before_next_fever_point")
    Integer beforeNextFeverPoint;

    /** */
    @Column(name = "before_next_fever_percent")
    Integer beforeNextFeverPercent;

    /** */
    @Column(name = "next_fever_point")
    Integer nextFeverPoint;

    /** */
    @Column(name = "next_fever_percent")
    Integer nextFeverPercent;

    /** */
    @Column(name = "fever")
    Integer fever;

    /** */
    @Column(name = "create_time")
    LocalDateTime createTime;

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
     * Returns the rubyPoint.
     * 
     * @return the rubyPoint
     */
    public Integer getRubyPoint() {
        return rubyPoint;
    }

    /** 
     * Sets the rubyPoint.
     * 
     * @param rubyPoint the rubyPoint
     */
    public void setRubyPoint(Integer rubyPoint) {
        this.rubyPoint = rubyPoint;
    }

    /** 
     * Returns the beforeRubyPointPossession.
     * 
     * @return the beforeRubyPointPossession
     */
    public Integer getBeforeRubyPointPossession() {
        return beforeRubyPointPossession;
    }

    /** 
     * Sets the beforeRubyPointPossession.
     * 
     * @param beforeRubyPointPossession the beforeRubyPointPossession
     */
    public void setBeforeRubyPointPossession(Integer beforeRubyPointPossession) {
        this.beforeRubyPointPossession = beforeRubyPointPossession;
    }

    /** 
     * Returns the rubyPointPossession.
     * 
     * @return the rubyPointPossession
     */
    public Integer getRubyPointPossession() {
        return rubyPointPossession;
    }

    /** 
     * Sets the rubyPointPossession.
     * 
     * @param rubyPointPossession the rubyPointPossession
     */
    public void setRubyPointPossession(Integer rubyPointPossession) {
        this.rubyPointPossession = rubyPointPossession;
    }

    /** 
     * Returns the beforeNextFeverPoint.
     * 
     * @return the beforeNextFeverPoint
     */
    public Integer getBeforeNextFeverPoint() {
        return beforeNextFeverPoint;
    }

    /** 
     * Sets the beforeNextFeverPoint.
     * 
     * @param beforeNextFeverPoint the beforeNextFeverPoint
     */
    public void setBeforeNextFeverPoint(Integer beforeNextFeverPoint) {
        this.beforeNextFeverPoint = beforeNextFeverPoint;
    }

    /** 
     * Returns the beforeNextFeverPercent.
     * 
     * @return the beforeNextFeverPercent
     */
    public Integer getBeforeNextFeverPercent() {
        return beforeNextFeverPercent;
    }

    /** 
     * Sets the beforeNextFeverPercent.
     * 
     * @param beforeNextFeverPercent the beforeNextFeverPercent
     */
    public void setBeforeNextFeverPercent(Integer beforeNextFeverPercent) {
        this.beforeNextFeverPercent = beforeNextFeverPercent;
    }

    /** 
     * Returns the nextFeverPoint.
     * 
     * @return the nextFeverPoint
     */
    public Integer getNextFeverPoint() {
        return nextFeverPoint;
    }

    /** 
     * Sets the nextFeverPoint.
     * 
     * @param nextFeverPoint the nextFeverPoint
     */
    public void setNextFeverPoint(Integer nextFeverPoint) {
        this.nextFeverPoint = nextFeverPoint;
    }

    /** 
     * Returns the nextFeverPercent.
     * 
     * @return the nextFeverPercent
     */
    public Integer getNextFeverPercent() {
        return nextFeverPercent;
    }

    /** 
     * Sets the nextFeverPercent.
     * 
     * @param nextFeverPercent the nextFeverPercent
     */
    public void setNextFeverPercent(Integer nextFeverPercent) {
        this.nextFeverPercent = nextFeverPercent;
    }

    /** 
     * Returns the fever.
     * 
     * @return the fever
     */
    public Integer getFever() {
        return fever;
    }

    /** 
     * Sets the fever.
     * 
     * @param fever the fever
     */
    public void setFever(Integer fever) {
        this.fever = fever;
    }

    /** 
     * Returns the createTime.
     * 
     * @return the createTime
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /** 
     * Sets the createTime.
     * 
     * @param createTime the createTime
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
}
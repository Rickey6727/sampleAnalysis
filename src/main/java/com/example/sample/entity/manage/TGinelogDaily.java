package com.example.sample.entity.manage;

import java.time.LocalDate;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TGinelogDailyListener.class)
@Table(name = "t_ginelog_daily")
public class TGinelogDaily {

    /** */
    @Id
    @Column(name = "type")
    String type;

    /** */
    @Id
    @Column(name = "target_date")
    LocalDate targetDate;

    /** */
    @Column(name = "dau")
    Integer dau;

    /** */
    @Column(name = "consumption")
    Integer consumption;

    /** */
    @Column(name = "install_count")
    Integer installCount;

    /** */
    @Column(name = "consumption_dau")
    Integer consumptionDau;

    /** */
    @Column(name = "continuation01")
    Float continuation01;

    /** */
    @Column(name = "continuation03")
    Float continuation03;

    /** */
    @Column(name = "continuation07")
    Float continuation07;

    /** */
    @Column(name = "continuation14")
    Float continuation14;

    /** */
    @Column(name = "continuation30")
    Float continuation30;

    /** */
    @Column(name = "consumption_per")
    Float consumptionPer;

    /** */
    @Column(name = "arpu")
    Float arpu;

    /** */
    @Column(name = "arppu")
    Float arppu;

    /** */
    @Column(name = "invited_dau")
    Integer invitedDau;

    /** */
    @Column(name = "uninvited_dau")
    Integer uninvitedDau;

    /** */
    @Column(name = "pv")
    Integer pv;

    /** */
    @Column(name = "ltv01")
    Float ltv01;

    /** */
    @Column(name = "ltv03")
    Float ltv03;

    /** */
    @Column(name = "ltv07")
    Float ltv07;

    /** */
    @Column(name = "ltv14")
    Float ltv14;

    /** */
    @Column(name = "ltv30")
    Float ltv30;

    /** */
    @Column(name = "ltv60")
    Float ltv60;

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
     * Returns the targetDate.
     * 
     * @return the targetDate
     */
    public LocalDate getTargetDate() {
        return targetDate;
    }

    /** 
     * Sets the targetDate.
     * 
     * @param targetDate the targetDate
     */
    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    /** 
     * Returns the dau.
     * 
     * @return the dau
     */
    public Integer getDau() {
        return dau;
    }

    /** 
     * Sets the dau.
     * 
     * @param dau the dau
     */
    public void setDau(Integer dau) {
        this.dau = dau;
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

    /** 
     * Returns the installCount.
     * 
     * @return the installCount
     */
    public Integer getInstallCount() {
        return installCount;
    }

    /** 
     * Sets the installCount.
     * 
     * @param installCount the installCount
     */
    public void setInstallCount(Integer installCount) {
        this.installCount = installCount;
    }

    /** 
     * Returns the consumptionDau.
     * 
     * @return the consumptionDau
     */
    public Integer getConsumptionDau() {
        return consumptionDau;
    }

    /** 
     * Sets the consumptionDau.
     * 
     * @param consumptionDau the consumptionDau
     */
    public void setConsumptionDau(Integer consumptionDau) {
        this.consumptionDau = consumptionDau;
    }

    /** 
     * Returns the continuation01.
     * 
     * @return the continuation01
     */
    public Float getContinuation01() {
        return continuation01;
    }

    /** 
     * Sets the continuation01.
     * 
     * @param continuation01 the continuation01
     */
    public void setContinuation01(Float continuation01) {
        this.continuation01 = continuation01;
    }

    /** 
     * Returns the continuation03.
     * 
     * @return the continuation03
     */
    public Float getContinuation03() {
        return continuation03;
    }

    /** 
     * Sets the continuation03.
     * 
     * @param continuation03 the continuation03
     */
    public void setContinuation03(Float continuation03) {
        this.continuation03 = continuation03;
    }

    /** 
     * Returns the continuation07.
     * 
     * @return the continuation07
     */
    public Float getContinuation07() {
        return continuation07;
    }

    /** 
     * Sets the continuation07.
     * 
     * @param continuation07 the continuation07
     */
    public void setContinuation07(Float continuation07) {
        this.continuation07 = continuation07;
    }

    /** 
     * Returns the continuation14.
     * 
     * @return the continuation14
     */
    public Float getContinuation14() {
        return continuation14;
    }

    /** 
     * Sets the continuation14.
     * 
     * @param continuation14 the continuation14
     */
    public void setContinuation14(Float continuation14) {
        this.continuation14 = continuation14;
    }

    /** 
     * Returns the continuation30.
     * 
     * @return the continuation30
     */
    public Float getContinuation30() {
        return continuation30;
    }

    /** 
     * Sets the continuation30.
     * 
     * @param continuation30 the continuation30
     */
    public void setContinuation30(Float continuation30) {
        this.continuation30 = continuation30;
    }

    /** 
     * Returns the consumptionPer.
     * 
     * @return the consumptionPer
     */
    public Float getConsumptionPer() {
        return consumptionPer;
    }

    /** 
     * Sets the consumptionPer.
     * 
     * @param consumptionPer the consumptionPer
     */
    public void setConsumptionPer(Float consumptionPer) {
        this.consumptionPer = consumptionPer;
    }

    /** 
     * Returns the arpu.
     * 
     * @return the arpu
     */
    public Float getArpu() {
        return arpu;
    }

    /** 
     * Sets the arpu.
     * 
     * @param arpu the arpu
     */
    public void setArpu(Float arpu) {
        this.arpu = arpu;
    }

    /** 
     * Returns the arppu.
     * 
     * @return the arppu
     */
    public Float getArppu() {
        return arppu;
    }

    /** 
     * Sets the arppu.
     * 
     * @param arppu the arppu
     */
    public void setArppu(Float arppu) {
        this.arppu = arppu;
    }

    /** 
     * Returns the invitedDau.
     * 
     * @return the invitedDau
     */
    public Integer getInvitedDau() {
        return invitedDau;
    }

    /** 
     * Sets the invitedDau.
     * 
     * @param invitedDau the invitedDau
     */
    public void setInvitedDau(Integer invitedDau) {
        this.invitedDau = invitedDau;
    }

    /** 
     * Returns the uninvitedDau.
     * 
     * @return the uninvitedDau
     */
    public Integer getUninvitedDau() {
        return uninvitedDau;
    }

    /** 
     * Sets the uninvitedDau.
     * 
     * @param uninvitedDau the uninvitedDau
     */
    public void setUninvitedDau(Integer uninvitedDau) {
        this.uninvitedDau = uninvitedDau;
    }

    /** 
     * Returns the pv.
     * 
     * @return the pv
     */
    public Integer getPv() {
        return pv;
    }

    /** 
     * Sets the pv.
     * 
     * @param pv the pv
     */
    public void setPv(Integer pv) {
        this.pv = pv;
    }

    /** 
     * Returns the ltv01.
     * 
     * @return the ltv01
     */
    public Float getLtv01() {
        return ltv01;
    }

    /** 
     * Sets the ltv01.
     * 
     * @param ltv01 the ltv01
     */
    public void setLtv01(Float ltv01) {
        this.ltv01 = ltv01;
    }

    /** 
     * Returns the ltv03.
     * 
     * @return the ltv03
     */
    public Float getLtv03() {
        return ltv03;
    }

    /** 
     * Sets the ltv03.
     * 
     * @param ltv03 the ltv03
     */
    public void setLtv03(Float ltv03) {
        this.ltv03 = ltv03;
    }

    /** 
     * Returns the ltv07.
     * 
     * @return the ltv07
     */
    public Float getLtv07() {
        return ltv07;
    }

    /** 
     * Sets the ltv07.
     * 
     * @param ltv07 the ltv07
     */
    public void setLtv07(Float ltv07) {
        this.ltv07 = ltv07;
    }

    /** 
     * Returns the ltv14.
     * 
     * @return the ltv14
     */
    public Float getLtv14() {
        return ltv14;
    }

    /** 
     * Sets the ltv14.
     * 
     * @param ltv14 the ltv14
     */
    public void setLtv14(Float ltv14) {
        this.ltv14 = ltv14;
    }

    /** 
     * Returns the ltv30.
     * 
     * @return the ltv30
     */
    public Float getLtv30() {
        return ltv30;
    }

    /** 
     * Sets the ltv30.
     * 
     * @param ltv30 the ltv30
     */
    public void setLtv30(Float ltv30) {
        this.ltv30 = ltv30;
    }

    /** 
     * Returns the ltv60.
     * 
     * @return the ltv60
     */
    public Float getLtv60() {
        return ltv60;
    }

    /** 
     * Sets the ltv60.
     * 
     * @param ltv60 the ltv60
     */
    public void setLtv60(Float ltv60) {
        this.ltv60 = ltv60;
    }
}
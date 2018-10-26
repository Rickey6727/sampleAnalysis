package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MGainConditionListener.class)
@Table(name = "m_gain_condition")
public class MGainCondition {

    /** */
    @Id
    @Column(name = "gain_id")
    Integer gainId;

    /** */
    @Column(name = "condition1")
    String condition1;

    /** */
    @Column(name = "condition2")
    String condition2;

    /** */
    @Column(name = "condition3")
    String condition3;

    /** */
    @Column(name = "condition4")
    String condition4;

    /** */
    @Column(name = "condition5")
    String condition5;

    /** */
    @Column(name = "condition6")
    String condition6;

    /** */
    @Column(name = "condition7")
    String condition7;

    /** */
    @Column(name = "condition8")
    String condition8;

    /** */
    @Column(name = "condition9")
    String condition9;

    /** */
    @Column(name = "condition10")
    String condition10;

    /** */
    @Column(name = "del_flg")
    Integer delFlg;

    /** */
    @Column(name = "add_date")
    LocalDateTime addDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the gainId.
     * 
     * @return the gainId
     */
    public Integer getGainId() {
        return gainId;
    }

    /** 
     * Sets the gainId.
     * 
     * @param gainId the gainId
     */
    public void setGainId(Integer gainId) {
        this.gainId = gainId;
    }

    /** 
     * Returns the condition1.
     * 
     * @return the condition1
     */
    public String getCondition1() {
        return condition1;
    }

    /** 
     * Sets the condition1.
     * 
     * @param condition1 the condition1
     */
    public void setCondition1(String condition1) {
        this.condition1 = condition1;
    }

    /** 
     * Returns the condition2.
     * 
     * @return the condition2
     */
    public String getCondition2() {
        return condition2;
    }

    /** 
     * Sets the condition2.
     * 
     * @param condition2 the condition2
     */
    public void setCondition2(String condition2) {
        this.condition2 = condition2;
    }

    /** 
     * Returns the condition3.
     * 
     * @return the condition3
     */
    public String getCondition3() {
        return condition3;
    }

    /** 
     * Sets the condition3.
     * 
     * @param condition3 the condition3
     */
    public void setCondition3(String condition3) {
        this.condition3 = condition3;
    }

    /** 
     * Returns the condition4.
     * 
     * @return the condition4
     */
    public String getCondition4() {
        return condition4;
    }

    /** 
     * Sets the condition4.
     * 
     * @param condition4 the condition4
     */
    public void setCondition4(String condition4) {
        this.condition4 = condition4;
    }

    /** 
     * Returns the condition5.
     * 
     * @return the condition5
     */
    public String getCondition5() {
        return condition5;
    }

    /** 
     * Sets the condition5.
     * 
     * @param condition5 the condition5
     */
    public void setCondition5(String condition5) {
        this.condition5 = condition5;
    }

    /** 
     * Returns the condition6.
     * 
     * @return the condition6
     */
    public String getCondition6() {
        return condition6;
    }

    /** 
     * Sets the condition6.
     * 
     * @param condition6 the condition6
     */
    public void setCondition6(String condition6) {
        this.condition6 = condition6;
    }

    /** 
     * Returns the condition7.
     * 
     * @return the condition7
     */
    public String getCondition7() {
        return condition7;
    }

    /** 
     * Sets the condition7.
     * 
     * @param condition7 the condition7
     */
    public void setCondition7(String condition7) {
        this.condition7 = condition7;
    }

    /** 
     * Returns the condition8.
     * 
     * @return the condition8
     */
    public String getCondition8() {
        return condition8;
    }

    /** 
     * Sets the condition8.
     * 
     * @param condition8 the condition8
     */
    public void setCondition8(String condition8) {
        this.condition8 = condition8;
    }

    /** 
     * Returns the condition9.
     * 
     * @return the condition9
     */
    public String getCondition9() {
        return condition9;
    }

    /** 
     * Sets the condition9.
     * 
     * @param condition9 the condition9
     */
    public void setCondition9(String condition9) {
        this.condition9 = condition9;
    }

    /** 
     * Returns the condition10.
     * 
     * @return the condition10
     */
    public String getCondition10() {
        return condition10;
    }

    /** 
     * Sets the condition10.
     * 
     * @param condition10 the condition10
     */
    public void setCondition10(String condition10) {
        this.condition10 = condition10;
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
     * Returns the addDate.
     * 
     * @return the addDate
     */
    public LocalDateTime getAddDate() {
        return addDate;
    }

    /** 
     * Sets the addDate.
     * 
     * @param addDate the addDate
     */
    public void setAddDate(LocalDateTime addDate) {
        this.addDate = addDate;
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
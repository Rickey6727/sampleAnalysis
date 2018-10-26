package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MInitialThemeListener.class)
@Table(name = "m_initial_theme")
public class MInitialTheme {

    /** */
    @Id
    @Column(name = "theme_id")
    Integer themeId;

    /** */
    @Id
    @Column(name = "order_no")
    Integer orderNo;

    /** */
    @Column(name = "equip_flg")
    Integer equipFlg;

    /** */
    @Column(name = "count")
    Integer count;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the themeId.
     * 
     * @return the themeId
     */
    public Integer getThemeId() {
        return themeId;
    }

    /** 
     * Sets the themeId.
     * 
     * @param themeId the themeId
     */
    public void setThemeId(Integer themeId) {
        this.themeId = themeId;
    }

    /** 
     * Returns the orderNo.
     * 
     * @return the orderNo
     */
    public Integer getOrderNo() {
        return orderNo;
    }

    /** 
     * Sets the orderNo.
     * 
     * @param orderNo the orderNo
     */
    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    /** 
     * Returns the equipFlg.
     * 
     * @return the equipFlg
     */
    public Integer getEquipFlg() {
        return equipFlg;
    }

    /** 
     * Sets the equipFlg.
     * 
     * @param equipFlg the equipFlg
     */
    public void setEquipFlg(Integer equipFlg) {
        this.equipFlg = equipFlg;
    }

    /** 
     * Returns the count.
     * 
     * @return the count
     */
    public Integer getCount() {
        return count;
    }

    /** 
     * Sets the count.
     * 
     * @param count the count
     */
    public void setCount(Integer count) {
        this.count = count;
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
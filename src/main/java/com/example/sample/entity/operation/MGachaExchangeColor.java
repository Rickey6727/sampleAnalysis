package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MGachaExchangeColorListener.class)
@Table(name = "m_gacha_exchange_color")
public class MGachaExchangeColor {

    /** */
    @Id
    @Column(name = "gacha_id")
    Integer gachaId;

    /** */
    @Column(name = "title_color")
    String titleColor;

    /** */
    @Column(name = "bg_color")
    String bgColor;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

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
     * Returns the titleColor.
     * 
     * @return the titleColor
     */
    public String getTitleColor() {
        return titleColor;
    }

    /** 
     * Sets the titleColor.
     * 
     * @param titleColor the titleColor
     */
    public void setTitleColor(String titleColor) {
        this.titleColor = titleColor;
    }

    /** 
     * Returns the bgColor.
     * 
     * @return the bgColor
     */
    public String getBgColor() {
        return bgColor;
    }

    /** 
     * Sets the bgColor.
     * 
     * @param bgColor the bgColor
     */
    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
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
}
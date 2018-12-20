package com.example.sample.entity.sales;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MGachaListener.class)
@Table(name = "m_gacha")
public class MGacha {

    /** */
    @Id
    @Column(name = "gacha_id")
    Integer gachaId;

    /** */
    @Column(name = "gacha_type")
    Integer gachaType;

    /** */
    @Column(name = "amount")
    Integer amount;

    /** */
    @Column(name = "del_flg")
    Integer delFlg;

    /** */
    @Column(name = "page_url")
    String pageUrl;

    /** */
    @Column(name = "sale_start_date")
    Timestamp saleStartDate;

    /** */
    @Column(name = "sale_end_date")
    Timestamp saleEndDate;

    /** */
    @Column(name = "create_time")
    LocalDateTime createTime;

    /** */
    @Column(name = "update_time")
    LocalDateTime updateTime;

    /** */
    @Column(name = "ip_event_id")
    Integer ipEventId;

    /** */
    @Column(name = "box_flg")
    Boolean boxFlg;

    /** */
    @Column(name = "recommend_flg")
    Integer recommendFlg;

    /** */
    @Column(name = "cast_id")
    Integer castId;

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
     * Returns the gachaType.
     * 
     * @return the gachaType
     */
    public Integer getGachaType() {
        return gachaType;
    }

    /** 
     * Sets the gachaType.
     * 
     * @param gachaType the gachaType
     */
    public void setGachaType(Integer gachaType) {
        this.gachaType = gachaType;
    }

    /** 
     * Returns the amount.
     * 
     * @return the amount
     */
    public Integer getAmount() {
        return amount;
    }

    /** 
     * Sets the amount.
     * 
     * @param amount the amount
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
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
     * Returns the pageUrl.
     * 
     * @return the pageUrl
     */
    public String getPageUrl() {
        return pageUrl;
    }

    /** 
     * Sets the pageUrl.
     * 
     * @param pageUrl the pageUrl
     */
    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    /** 
     * Returns the saleStartDate.
     * 
     * @return the saleStartDate
     */
    public Timestamp getSaleStartDate() {
        return saleStartDate;
    }

    /** 
     * Sets the saleStartDate.
     * 
     * @param saleStartDate the saleStartDate
     */
    public void setSaleStartDate(Timestamp saleStartDate) {
        this.saleStartDate = saleStartDate;
    }

    /** 
     * Returns the saleEndDate.
     * 
     * @return the saleEndDate
     */
    public Timestamp getSaleEndDate() {
        return saleEndDate;
    }

    /** 
     * Sets the saleEndDate.
     * 
     * @param saleEndDate the saleEndDate
     */
    public void setSaleEndDate(Timestamp saleEndDate) {
        this.saleEndDate = saleEndDate;
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

    /** 
     * Returns the updateTime.
     * 
     * @return the updateTime
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /** 
     * Sets the updateTime.
     * 
     * @param updateTime the updateTime
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    /** 
     * Returns the ipEventId.
     * 
     * @return the ipEventId
     */
    public Integer getIpEventId() {
        return ipEventId;
    }

    /** 
     * Sets the ipEventId.
     * 
     * @param ipEventId the ipEventId
     */
    public void setIpEventId(Integer ipEventId) {
        this.ipEventId = ipEventId;
    }

    /** 
     * Returns the boxFlg.
     * 
     * @return the boxFlg
     */
    public Boolean getBoxFlg() {
        return boxFlg;
    }

    /** 
     * Sets the boxFlg.
     * 
     * @param boxFlg the boxFlg
     */
    public void setBoxFlg(Boolean boxFlg) {
        this.boxFlg = boxFlg;
    }

    /** 
     * Returns the recommendFlg.
     * 
     * @return the recommendFlg
     */
    public Integer getRecommendFlg() {
        return recommendFlg;
    }

    /** 
     * Sets the recommendFlg.
     * 
     * @param recommendFlg the recommendFlg
     */
    public void setRecommendFlg(Integer recommendFlg) {
        this.recommendFlg = recommendFlg;
    }

    /** 
     * Returns the castId.
     * 
     * @return the castId
     */
    public Integer getCastId() {
        return castId;
    }

    /** 
     * Sets the castId.
     * 
     * @param castId the castId
     */
    public void setCastId(Integer castId) {
        this.castId = castId;
    }
}
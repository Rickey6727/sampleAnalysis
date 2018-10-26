package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MUpdateListener.class)
@Table(name = "m_update")
public class MUpdate {

    /** */
    @Id
    @Column(name = "update_id")
    Integer updateId;

    /** */
    @Column(name = "gacha_update_date")
    LocalDateTime gachaUpdateDate;

    /** */
    @Column(name = "shop_update_date")
    LocalDateTime shopUpdateDate;

    /** */
    @Column(name = "quest_update_date")
    LocalDateTime questUpdateDate;

    /** */
    @Column(name = "map_update_date")
    LocalDateTime mapUpdateDate;

    /** */
    @Column(name = "stone_update_date")
    LocalDateTime stoneUpdateDate;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the updateId.
     * 
     * @return the updateId
     */
    public Integer getUpdateId() {
        return updateId;
    }

    /** 
     * Sets the updateId.
     * 
     * @param updateId the updateId
     */
    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    /** 
     * Returns the gachaUpdateDate.
     * 
     * @return the gachaUpdateDate
     */
    public LocalDateTime getGachaUpdateDate() {
        return gachaUpdateDate;
    }

    /** 
     * Sets the gachaUpdateDate.
     * 
     * @param gachaUpdateDate the gachaUpdateDate
     */
    public void setGachaUpdateDate(LocalDateTime gachaUpdateDate) {
        this.gachaUpdateDate = gachaUpdateDate;
    }

    /** 
     * Returns the shopUpdateDate.
     * 
     * @return the shopUpdateDate
     */
    public LocalDateTime getShopUpdateDate() {
        return shopUpdateDate;
    }

    /** 
     * Sets the shopUpdateDate.
     * 
     * @param shopUpdateDate the shopUpdateDate
     */
    public void setShopUpdateDate(LocalDateTime shopUpdateDate) {
        this.shopUpdateDate = shopUpdateDate;
    }

    /** 
     * Returns the questUpdateDate.
     * 
     * @return the questUpdateDate
     */
    public LocalDateTime getQuestUpdateDate() {
        return questUpdateDate;
    }

    /** 
     * Sets the questUpdateDate.
     * 
     * @param questUpdateDate the questUpdateDate
     */
    public void setQuestUpdateDate(LocalDateTime questUpdateDate) {
        this.questUpdateDate = questUpdateDate;
    }

    /** 
     * Returns the mapUpdateDate.
     * 
     * @return the mapUpdateDate
     */
    public LocalDateTime getMapUpdateDate() {
        return mapUpdateDate;
    }

    /** 
     * Sets the mapUpdateDate.
     * 
     * @param mapUpdateDate the mapUpdateDate
     */
    public void setMapUpdateDate(LocalDateTime mapUpdateDate) {
        this.mapUpdateDate = mapUpdateDate;
    }

    /** 
     * Returns the stoneUpdateDate.
     * 
     * @return the stoneUpdateDate
     */
    public LocalDateTime getStoneUpdateDate() {
        return stoneUpdateDate;
    }

    /** 
     * Sets the stoneUpdateDate.
     * 
     * @param stoneUpdateDate the stoneUpdateDate
     */
    public void setStoneUpdateDate(LocalDateTime stoneUpdateDate) {
        this.stoneUpdateDate = stoneUpdateDate;
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
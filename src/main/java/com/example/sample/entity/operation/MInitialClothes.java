package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MInitialClothesListener.class)
@Table(name = "m_initial_clothes")
public class MInitialClothes {

    /** */
    @Id
    @Column(name = "avatar_id")
    Integer avatarId;

    /** */
    @Id
    @Column(name = "clothes_id")
    Integer clothesId;

    /** */
    @Column(name = "equip_flg")
    Integer equipFlg;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** */
    @Column(name = "count")
    Integer count;

    /** 
     * Returns the avatarId.
     * 
     * @return the avatarId
     */
    public Integer getAvatarId() {
        return avatarId;
    }

    /** 
     * Sets the avatarId.
     * 
     * @param avatarId the avatarId
     */
    public void setAvatarId(Integer avatarId) {
        this.avatarId = avatarId;
    }

    /** 
     * Returns the clothesId.
     * 
     * @return the clothesId
     */
    public Integer getClothesId() {
        return clothesId;
    }

    /** 
     * Sets the clothesId.
     * 
     * @param clothesId the clothesId
     */
    public void setClothesId(Integer clothesId) {
        this.clothesId = clothesId;
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
}
package com.example.sample.entity.clothes;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TClothesOwnListener.class)
@Table(name = "t_clothes_own")
public class TClothesOwn {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Id
    @Column(name = "serial_id")
    Long serialId;

    /** */
    @Column(name = "clothes_id")
    Integer clothesId;

    /** */
    @Column(name = "equip_flg")
    Boolean equipFlg;

    /** */
    @Column(name = "model_flg")
    Integer modelFlg;

    /** */
    @Column(name = "model_slot_no")
    Integer modelSlotNo;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** */
    @Column(name = "equip_parts_id")
    Integer equipPartsId;

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
    public Boolean getEquipFlg() {
        return equipFlg;
    }

    /** 
     * Sets the equipFlg.
     * 
     * @param equipFlg the equipFlg
     */
    public void setEquipFlg(Boolean equipFlg) {
        this.equipFlg = equipFlg;
    }

    /** 
     * Returns the modelFlg.
     * 
     * @return the modelFlg
     */
    public Integer getModelFlg() {
        return modelFlg;
    }

    /** 
     * Sets the modelFlg.
     * 
     * @param modelFlg the modelFlg
     */
    public void setModelFlg(Integer modelFlg) {
        this.modelFlg = modelFlg;
    }

    /** 
     * Returns the modelSlotNo.
     * 
     * @return the modelSlotNo
     */
    public Integer getModelSlotNo() {
        return modelSlotNo;
    }

    /** 
     * Sets the modelSlotNo.
     * 
     * @param modelSlotNo the modelSlotNo
     */
    public void setModelSlotNo(Integer modelSlotNo) {
        this.modelSlotNo = modelSlotNo;
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
     * Returns the equipPartsId.
     * 
     * @return the equipPartsId
     */
    public Integer getEquipPartsId() {
        return equipPartsId;
    }

    /** 
     * Sets the equipPartsId.
     * 
     * @param equipPartsId the equipPartsId
     */
    public void setEquipPartsId(Integer equipPartsId) {
        this.equipPartsId = equipPartsId;
    }
}
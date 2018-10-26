package com.example.sample.entity.game;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TCareStatesListener.class)
@Table(name = "t_care_states")
public class TCareStates {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Id
    @Column(name = "frame_id")
    Integer frameId;

    /** */
    @Column(name = "care_id")
    Integer careId;

    /** */
    @Column(name = "use_flg")
    Integer useFlg;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

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
     * Returns the frameId.
     * 
     * @return the frameId
     */
    public Integer getFrameId() {
        return frameId;
    }

    /** 
     * Sets the frameId.
     * 
     * @param frameId the frameId
     */
    public void setFrameId(Integer frameId) {
        this.frameId = frameId;
    }

    /** 
     * Returns the careId.
     * 
     * @return the careId
     */
    public Integer getCareId() {
        return careId;
    }

    /** 
     * Sets the careId.
     * 
     * @param careId the careId
     */
    public void setCareId(Integer careId) {
        this.careId = careId;
    }

    /** 
     * Returns the useFlg.
     * 
     * @return the useFlg
     */
    public Integer getUseFlg() {
        return useFlg;
    }

    /** 
     * Sets the useFlg.
     * 
     * @param useFlg the useFlg
     */
    public void setUseFlg(Integer useFlg) {
        this.useFlg = useFlg;
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
package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MTipsMessageListener.class)
@Table(name = "m_tips_message")
public class MTipsMessage {

    /** */
    @Id
    @Column(name = "tips_id")
    Integer tipsId;

    /** */
    @Id
    @Column(name = "coutry_cd")
    Integer coutryCd;

    /** */
    @Column(name = "message")
    String message;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the tipsId.
     * 
     * @return the tipsId
     */
    public Integer getTipsId() {
        return tipsId;
    }

    /** 
     * Sets the tipsId.
     * 
     * @param tipsId the tipsId
     */
    public void setTipsId(Integer tipsId) {
        this.tipsId = tipsId;
    }

    /** 
     * Returns the coutryCd.
     * 
     * @return the coutryCd
     */
    public Integer getCoutryCd() {
        return coutryCd;
    }

    /** 
     * Sets the coutryCd.
     * 
     * @param coutryCd the coutryCd
     */
    public void setCoutryCd(Integer coutryCd) {
        this.coutryCd = coutryCd;
    }

    /** 
     * Returns the message.
     * 
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /** 
     * Sets the message.
     * 
     * @param message the message
     */
    public void setMessage(String message) {
        this.message = message;
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
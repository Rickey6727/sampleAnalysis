package com.example.sample.entity.manage;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MGuildPushMessageListener.class)
@Table(name = "m_guild_push_message")
public class MGuildPushMessage {

    /** */
    @Id
    @Column(name = "guild_push_type")
    Integer guildPushType;

    /** */
    @Id
    @Column(name = "country_cd")
    Integer countryCd;

    /** */
    @Column(name = "intervel")
    Integer intervel;

    /** */
    @Column(name = "message")
    String message;

    /** */
    @Column(name = "before_push_date")
    LocalDateTime beforePushDate;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the guildPushType.
     * 
     * @return the guildPushType
     */
    public Integer getGuildPushType() {
        return guildPushType;
    }

    /** 
     * Sets the guildPushType.
     * 
     * @param guildPushType the guildPushType
     */
    public void setGuildPushType(Integer guildPushType) {
        this.guildPushType = guildPushType;
    }

    /** 
     * Returns the countryCd.
     * 
     * @return the countryCd
     */
    public Integer getCountryCd() {
        return countryCd;
    }

    /** 
     * Sets the countryCd.
     * 
     * @param countryCd the countryCd
     */
    public void setCountryCd(Integer countryCd) {
        this.countryCd = countryCd;
    }

    /** 
     * Returns the intervel.
     * 
     * @return the intervel
     */
    public Integer getIntervel() {
        return intervel;
    }

    /** 
     * Sets the intervel.
     * 
     * @param intervel the intervel
     */
    public void setIntervel(Integer intervel) {
        this.intervel = intervel;
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
     * Returns the beforePushDate.
     * 
     * @return the beforePushDate
     */
    public LocalDateTime getBeforePushDate() {
        return beforePushDate;
    }

    /** 
     * Sets the beforePushDate.
     * 
     * @param beforePushDate the beforePushDate
     */
    public void setBeforePushDate(LocalDateTime beforePushDate) {
        this.beforePushDate = beforePushDate;
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
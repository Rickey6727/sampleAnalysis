package com.example.sample.entity.manage;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TGuildChatHistoryListener.class)
@Table(name = "t_guild_chat_history")
public class TGuildChatHistory {

    /** */
    @Column(name = "serial_id")
    Long serialId;

    /** */
    @Column(name = "guild_id")
    Integer guildId;

    /** */
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Column(name = "content_type")
    Integer contentType;

    /** */
    @Column(name = "content")
    String content;

    /** */
    @Column(name = "post_date")
    LocalDateTime postDate;

    /** */
    @Column(name = "del_flg")
    Integer delFlg;

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
     * Returns the guildId.
     * 
     * @return the guildId
     */
    public Integer getGuildId() {
        return guildId;
    }

    /** 
     * Sets the guildId.
     * 
     * @param guildId the guildId
     */
    public void setGuildId(Integer guildId) {
        this.guildId = guildId;
    }

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
     * Returns the contentType.
     * 
     * @return the contentType
     */
    public Integer getContentType() {
        return contentType;
    }

    /** 
     * Sets the contentType.
     * 
     * @param contentType the contentType
     */
    public void setContentType(Integer contentType) {
        this.contentType = contentType;
    }

    /** 
     * Returns the content.
     * 
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /** 
     * Sets the content.
     * 
     * @param content the content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /** 
     * Returns the postDate.
     * 
     * @return the postDate
     */
    public LocalDateTime getPostDate() {
        return postDate;
    }

    /** 
     * Sets the postDate.
     * 
     * @param postDate the postDate
     */
    public void setPostDate(LocalDateTime postDate) {
        this.postDate = postDate;
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
}
package com.example.sample.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TCocoppaAccountListener.class)
@Table(name = "t_cocoppa_account")
public class TCocoppaAccount {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Column(name = "cocoppa_user_id")
    Integer cocoppaUserId;

    /** */
    @Column(name = "cocoppa_token")
    String cocoppaToken;

    /** */
    @Column(name = "apollo_token")
    String apolloToken;

    /** */
    @Column(name = "avatar_display_flg")
    Integer avatarDisplayFlg;

    /** */
    @Column(name = "status_cd")
    Integer statusCd;

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
     * Returns the cocoppaUserId.
     * 
     * @return the cocoppaUserId
     */
    public Integer getCocoppaUserId() {
        return cocoppaUserId;
    }

    /** 
     * Sets the cocoppaUserId.
     * 
     * @param cocoppaUserId the cocoppaUserId
     */
    public void setCocoppaUserId(Integer cocoppaUserId) {
        this.cocoppaUserId = cocoppaUserId;
    }

    /** 
     * Returns the cocoppaToken.
     * 
     * @return the cocoppaToken
     */
    public String getCocoppaToken() {
        return cocoppaToken;
    }

    /** 
     * Sets the cocoppaToken.
     * 
     * @param cocoppaToken the cocoppaToken
     */
    public void setCocoppaToken(String cocoppaToken) {
        this.cocoppaToken = cocoppaToken;
    }

    /** 
     * Returns the apolloToken.
     * 
     * @return the apolloToken
     */
    public String getApolloToken() {
        return apolloToken;
    }

    /** 
     * Sets the apolloToken.
     * 
     * @param apolloToken the apolloToken
     */
    public void setApolloToken(String apolloToken) {
        this.apolloToken = apolloToken;
    }

    /** 
     * Returns the avatarDisplayFlg.
     * 
     * @return the avatarDisplayFlg
     */
    public Integer getAvatarDisplayFlg() {
        return avatarDisplayFlg;
    }

    /** 
     * Sets the avatarDisplayFlg.
     * 
     * @param avatarDisplayFlg the avatarDisplayFlg
     */
    public void setAvatarDisplayFlg(Integer avatarDisplayFlg) {
        this.avatarDisplayFlg = avatarDisplayFlg;
    }

    /** 
     * Returns the statusCd.
     * 
     * @return the statusCd
     */
    public Integer getStatusCd() {
        return statusCd;
    }

    /** 
     * Sets the statusCd.
     * 
     * @param statusCd the statusCd
     */
    public void setStatusCd(Integer statusCd) {
        this.statusCd = statusCd;
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
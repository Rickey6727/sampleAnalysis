package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MLandingPageListener.class)
@Table(name = "m_landing_page")
public class MLandingPage {

    /** */
    @Id
    @Column(name = "visit")
    String visit;

    /** */
    @Column(name = "contents_name")
    String contentsName;

    /** */
    @Column(name = "welcome_url")
    String welcomeUrl;

    /** */
    @Column(name = "newaccount_url")
    String newaccountUrl;

    /** */
    @Column(name = "temp_regist_url")
    String tempRegistUrl;

    /** */
    @Column(name = "regist_detail_url")
    String registDetailUrl;

    /** */
    @Column(name = "regist_detail_confirm_url")
    String registDetailConfirmUrl;

    /** */
    @Column(name = "select_item_url")
    String selectItemUrl;

    /** */
    @Column(name = "regist_complete_url")
    String registCompleteUrl;

    /** */
    @Column(name = "regist_edit_url")
    String registEditUrl;

    /** */
    @Column(name = "add_date")
    LocalDateTime addDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** */
    @Column(name = "del_flg")
    Boolean delFlg;

    /** */
    @Column(name = "change_login_top_flg")
    Boolean changeLoginTopFlg;

    /** */
    @Column(name = "login_top_url")
    String loginTopUrl;

    /** */
    @Column(name = "face_class")
    Integer faceClass;

    /** 
     * Returns the visit.
     * 
     * @return the visit
     */
    public String getVisit() {
        return visit;
    }

    /** 
     * Sets the visit.
     * 
     * @param visit the visit
     */
    public void setVisit(String visit) {
        this.visit = visit;
    }

    /** 
     * Returns the contentsName.
     * 
     * @return the contentsName
     */
    public String getContentsName() {
        return contentsName;
    }

    /** 
     * Sets the contentsName.
     * 
     * @param contentsName the contentsName
     */
    public void setContentsName(String contentsName) {
        this.contentsName = contentsName;
    }

    /** 
     * Returns the welcomeUrl.
     * 
     * @return the welcomeUrl
     */
    public String getWelcomeUrl() {
        return welcomeUrl;
    }

    /** 
     * Sets the welcomeUrl.
     * 
     * @param welcomeUrl the welcomeUrl
     */
    public void setWelcomeUrl(String welcomeUrl) {
        this.welcomeUrl = welcomeUrl;
    }

    /** 
     * Returns the newaccountUrl.
     * 
     * @return the newaccountUrl
     */
    public String getNewaccountUrl() {
        return newaccountUrl;
    }

    /** 
     * Sets the newaccountUrl.
     * 
     * @param newaccountUrl the newaccountUrl
     */
    public void setNewaccountUrl(String newaccountUrl) {
        this.newaccountUrl = newaccountUrl;
    }

    /** 
     * Returns the tempRegistUrl.
     * 
     * @return the tempRegistUrl
     */
    public String getTempRegistUrl() {
        return tempRegistUrl;
    }

    /** 
     * Sets the tempRegistUrl.
     * 
     * @param tempRegistUrl the tempRegistUrl
     */
    public void setTempRegistUrl(String tempRegistUrl) {
        this.tempRegistUrl = tempRegistUrl;
    }

    /** 
     * Returns the registDetailUrl.
     * 
     * @return the registDetailUrl
     */
    public String getRegistDetailUrl() {
        return registDetailUrl;
    }

    /** 
     * Sets the registDetailUrl.
     * 
     * @param registDetailUrl the registDetailUrl
     */
    public void setRegistDetailUrl(String registDetailUrl) {
        this.registDetailUrl = registDetailUrl;
    }

    /** 
     * Returns the registDetailConfirmUrl.
     * 
     * @return the registDetailConfirmUrl
     */
    public String getRegistDetailConfirmUrl() {
        return registDetailConfirmUrl;
    }

    /** 
     * Sets the registDetailConfirmUrl.
     * 
     * @param registDetailConfirmUrl the registDetailConfirmUrl
     */
    public void setRegistDetailConfirmUrl(String registDetailConfirmUrl) {
        this.registDetailConfirmUrl = registDetailConfirmUrl;
    }

    /** 
     * Returns the selectItemUrl.
     * 
     * @return the selectItemUrl
     */
    public String getSelectItemUrl() {
        return selectItemUrl;
    }

    /** 
     * Sets the selectItemUrl.
     * 
     * @param selectItemUrl the selectItemUrl
     */
    public void setSelectItemUrl(String selectItemUrl) {
        this.selectItemUrl = selectItemUrl;
    }

    /** 
     * Returns the registCompleteUrl.
     * 
     * @return the registCompleteUrl
     */
    public String getRegistCompleteUrl() {
        return registCompleteUrl;
    }

    /** 
     * Sets the registCompleteUrl.
     * 
     * @param registCompleteUrl the registCompleteUrl
     */
    public void setRegistCompleteUrl(String registCompleteUrl) {
        this.registCompleteUrl = registCompleteUrl;
    }

    /** 
     * Returns the registEditUrl.
     * 
     * @return the registEditUrl
     */
    public String getRegistEditUrl() {
        return registEditUrl;
    }

    /** 
     * Sets the registEditUrl.
     * 
     * @param registEditUrl the registEditUrl
     */
    public void setRegistEditUrl(String registEditUrl) {
        this.registEditUrl = registEditUrl;
    }

    /** 
     * Returns the addDate.
     * 
     * @return the addDate
     */
    public LocalDateTime getAddDate() {
        return addDate;
    }

    /** 
     * Sets the addDate.
     * 
     * @param addDate the addDate
     */
    public void setAddDate(LocalDateTime addDate) {
        this.addDate = addDate;
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
     * Returns the delFlg.
     * 
     * @return the delFlg
     */
    public Boolean getDelFlg() {
        return delFlg;
    }

    /** 
     * Sets the delFlg.
     * 
     * @param delFlg the delFlg
     */
    public void setDelFlg(Boolean delFlg) {
        this.delFlg = delFlg;
    }

    /** 
     * Returns the changeLoginTopFlg.
     * 
     * @return the changeLoginTopFlg
     */
    public Boolean getChangeLoginTopFlg() {
        return changeLoginTopFlg;
    }

    /** 
     * Sets the changeLoginTopFlg.
     * 
     * @param changeLoginTopFlg the changeLoginTopFlg
     */
    public void setChangeLoginTopFlg(Boolean changeLoginTopFlg) {
        this.changeLoginTopFlg = changeLoginTopFlg;
    }

    /** 
     * Returns the loginTopUrl.
     * 
     * @return the loginTopUrl
     */
    public String getLoginTopUrl() {
        return loginTopUrl;
    }

    /** 
     * Sets the loginTopUrl.
     * 
     * @param loginTopUrl the loginTopUrl
     */
    public void setLoginTopUrl(String loginTopUrl) {
        this.loginTopUrl = loginTopUrl;
    }

    /** 
     * Returns the faceClass.
     * 
     * @return the faceClass
     */
    public Integer getFaceClass() {
        return faceClass;
    }

    /** 
     * Sets the faceClass.
     * 
     * @param faceClass the faceClass
     */
    public void setFaceClass(Integer faceClass) {
        this.faceClass = faceClass;
    }
}
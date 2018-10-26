package com.example.sample.entity.sales;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MExchangeMessageListener.class)
@Table(name = "m_exchange_message")
public class MExchangeMessage {

    /** */
    @Id
    @Column(name = "message_type")
    Integer messageType;

    /** */
    @Column(name = "disp_title")
    String dispTitle;

    /** */
    @Column(name = "disp_head_img")
    String dispHeadImg;

    /** */
    @Column(name = "disp_head")
    String dispHead;

    /** */
    @Column(name = "disp_head_text")
    String dispHeadText;

    /** */
    @Column(name = "disp_main_img")
    String dispMainImg;

    /** */
    @Column(name = "disp_main_text")
    String dispMainText;

    /** */
    @Column(name = "alert_text")
    String alertText;

    /** */
    @Column(name = "res_title")
    String resTitle;

    /** */
    @Column(name = "res_head_img")
    String resHeadImg;

    /** */
    @Column(name = "res_head")
    String resHead;

    /** */
    @Column(name = "res_head_text")
    String resHeadText;

    /** */
    @Column(name = "res_main_img")
    String resMainImg;

    /** */
    @Column(name = "pos_err_title")
    String posErrTitle;

    /** */
    @Column(name = "pos_err_head_img")
    String posErrHeadImg;

    /** */
    @Column(name = "pos_err_head")
    String posErrHead;

    /** */
    @Column(name = "pos_err_head_text")
    String posErrHeadText;

    /** */
    @Column(name = "pos_err_main_img")
    String posErrMainImg;

    /** */
    @Column(name = "pos_err_main_text")
    String posErrMainText;

    /** */
    @Column(name = "err_title")
    String errTitle;

    /** */
    @Column(name = "err_head_img")
    String errHeadImg;

    /** */
    @Column(name = "err_head")
    String errHead;

    /** */
    @Column(name = "err_head_text")
    String errHeadText;

    /** */
    @Column(name = "err_main_img")
    String errMainImg;

    /** */
    @Column(name = "err_main_text")
    String errMainText;

    /** */
    @Column(name = "delim")
    String delim;

    /** 
     * Returns the messageType.
     * 
     * @return the messageType
     */
    public Integer getMessageType() {
        return messageType;
    }

    /** 
     * Sets the messageType.
     * 
     * @param messageType the messageType
     */
    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }

    /** 
     * Returns the dispTitle.
     * 
     * @return the dispTitle
     */
    public String getDispTitle() {
        return dispTitle;
    }

    /** 
     * Sets the dispTitle.
     * 
     * @param dispTitle the dispTitle
     */
    public void setDispTitle(String dispTitle) {
        this.dispTitle = dispTitle;
    }

    /** 
     * Returns the dispHeadImg.
     * 
     * @return the dispHeadImg
     */
    public String getDispHeadImg() {
        return dispHeadImg;
    }

    /** 
     * Sets the dispHeadImg.
     * 
     * @param dispHeadImg the dispHeadImg
     */
    public void setDispHeadImg(String dispHeadImg) {
        this.dispHeadImg = dispHeadImg;
    }

    /** 
     * Returns the dispHead.
     * 
     * @return the dispHead
     */
    public String getDispHead() {
        return dispHead;
    }

    /** 
     * Sets the dispHead.
     * 
     * @param dispHead the dispHead
     */
    public void setDispHead(String dispHead) {
        this.dispHead = dispHead;
    }

    /** 
     * Returns the dispHeadText.
     * 
     * @return the dispHeadText
     */
    public String getDispHeadText() {
        return dispHeadText;
    }

    /** 
     * Sets the dispHeadText.
     * 
     * @param dispHeadText the dispHeadText
     */
    public void setDispHeadText(String dispHeadText) {
        this.dispHeadText = dispHeadText;
    }

    /** 
     * Returns the dispMainImg.
     * 
     * @return the dispMainImg
     */
    public String getDispMainImg() {
        return dispMainImg;
    }

    /** 
     * Sets the dispMainImg.
     * 
     * @param dispMainImg the dispMainImg
     */
    public void setDispMainImg(String dispMainImg) {
        this.dispMainImg = dispMainImg;
    }

    /** 
     * Returns the dispMainText.
     * 
     * @return the dispMainText
     */
    public String getDispMainText() {
        return dispMainText;
    }

    /** 
     * Sets the dispMainText.
     * 
     * @param dispMainText the dispMainText
     */
    public void setDispMainText(String dispMainText) {
        this.dispMainText = dispMainText;
    }

    /** 
     * Returns the alertText.
     * 
     * @return the alertText
     */
    public String getAlertText() {
        return alertText;
    }

    /** 
     * Sets the alertText.
     * 
     * @param alertText the alertText
     */
    public void setAlertText(String alertText) {
        this.alertText = alertText;
    }

    /** 
     * Returns the resTitle.
     * 
     * @return the resTitle
     */
    public String getResTitle() {
        return resTitle;
    }

    /** 
     * Sets the resTitle.
     * 
     * @param resTitle the resTitle
     */
    public void setResTitle(String resTitle) {
        this.resTitle = resTitle;
    }

    /** 
     * Returns the resHeadImg.
     * 
     * @return the resHeadImg
     */
    public String getResHeadImg() {
        return resHeadImg;
    }

    /** 
     * Sets the resHeadImg.
     * 
     * @param resHeadImg the resHeadImg
     */
    public void setResHeadImg(String resHeadImg) {
        this.resHeadImg = resHeadImg;
    }

    /** 
     * Returns the resHead.
     * 
     * @return the resHead
     */
    public String getResHead() {
        return resHead;
    }

    /** 
     * Sets the resHead.
     * 
     * @param resHead the resHead
     */
    public void setResHead(String resHead) {
        this.resHead = resHead;
    }

    /** 
     * Returns the resHeadText.
     * 
     * @return the resHeadText
     */
    public String getResHeadText() {
        return resHeadText;
    }

    /** 
     * Sets the resHeadText.
     * 
     * @param resHeadText the resHeadText
     */
    public void setResHeadText(String resHeadText) {
        this.resHeadText = resHeadText;
    }

    /** 
     * Returns the resMainImg.
     * 
     * @return the resMainImg
     */
    public String getResMainImg() {
        return resMainImg;
    }

    /** 
     * Sets the resMainImg.
     * 
     * @param resMainImg the resMainImg
     */
    public void setResMainImg(String resMainImg) {
        this.resMainImg = resMainImg;
    }

    /** 
     * Returns the posErrTitle.
     * 
     * @return the posErrTitle
     */
    public String getPosErrTitle() {
        return posErrTitle;
    }

    /** 
     * Sets the posErrTitle.
     * 
     * @param posErrTitle the posErrTitle
     */
    public void setPosErrTitle(String posErrTitle) {
        this.posErrTitle = posErrTitle;
    }

    /** 
     * Returns the posErrHeadImg.
     * 
     * @return the posErrHeadImg
     */
    public String getPosErrHeadImg() {
        return posErrHeadImg;
    }

    /** 
     * Sets the posErrHeadImg.
     * 
     * @param posErrHeadImg the posErrHeadImg
     */
    public void setPosErrHeadImg(String posErrHeadImg) {
        this.posErrHeadImg = posErrHeadImg;
    }

    /** 
     * Returns the posErrHead.
     * 
     * @return the posErrHead
     */
    public String getPosErrHead() {
        return posErrHead;
    }

    /** 
     * Sets the posErrHead.
     * 
     * @param posErrHead the posErrHead
     */
    public void setPosErrHead(String posErrHead) {
        this.posErrHead = posErrHead;
    }

    /** 
     * Returns the posErrHeadText.
     * 
     * @return the posErrHeadText
     */
    public String getPosErrHeadText() {
        return posErrHeadText;
    }

    /** 
     * Sets the posErrHeadText.
     * 
     * @param posErrHeadText the posErrHeadText
     */
    public void setPosErrHeadText(String posErrHeadText) {
        this.posErrHeadText = posErrHeadText;
    }

    /** 
     * Returns the posErrMainImg.
     * 
     * @return the posErrMainImg
     */
    public String getPosErrMainImg() {
        return posErrMainImg;
    }

    /** 
     * Sets the posErrMainImg.
     * 
     * @param posErrMainImg the posErrMainImg
     */
    public void setPosErrMainImg(String posErrMainImg) {
        this.posErrMainImg = posErrMainImg;
    }

    /** 
     * Returns the posErrMainText.
     * 
     * @return the posErrMainText
     */
    public String getPosErrMainText() {
        return posErrMainText;
    }

    /** 
     * Sets the posErrMainText.
     * 
     * @param posErrMainText the posErrMainText
     */
    public void setPosErrMainText(String posErrMainText) {
        this.posErrMainText = posErrMainText;
    }

    /** 
     * Returns the errTitle.
     * 
     * @return the errTitle
     */
    public String getErrTitle() {
        return errTitle;
    }

    /** 
     * Sets the errTitle.
     * 
     * @param errTitle the errTitle
     */
    public void setErrTitle(String errTitle) {
        this.errTitle = errTitle;
    }

    /** 
     * Returns the errHeadImg.
     * 
     * @return the errHeadImg
     */
    public String getErrHeadImg() {
        return errHeadImg;
    }

    /** 
     * Sets the errHeadImg.
     * 
     * @param errHeadImg the errHeadImg
     */
    public void setErrHeadImg(String errHeadImg) {
        this.errHeadImg = errHeadImg;
    }

    /** 
     * Returns the errHead.
     * 
     * @return the errHead
     */
    public String getErrHead() {
        return errHead;
    }

    /** 
     * Sets the errHead.
     * 
     * @param errHead the errHead
     */
    public void setErrHead(String errHead) {
        this.errHead = errHead;
    }

    /** 
     * Returns the errHeadText.
     * 
     * @return the errHeadText
     */
    public String getErrHeadText() {
        return errHeadText;
    }

    /** 
     * Sets the errHeadText.
     * 
     * @param errHeadText the errHeadText
     */
    public void setErrHeadText(String errHeadText) {
        this.errHeadText = errHeadText;
    }

    /** 
     * Returns the errMainImg.
     * 
     * @return the errMainImg
     */
    public String getErrMainImg() {
        return errMainImg;
    }

    /** 
     * Sets the errMainImg.
     * 
     * @param errMainImg the errMainImg
     */
    public void setErrMainImg(String errMainImg) {
        this.errMainImg = errMainImg;
    }

    /** 
     * Returns the errMainText.
     * 
     * @return the errMainText
     */
    public String getErrMainText() {
        return errMainText;
    }

    /** 
     * Sets the errMainText.
     * 
     * @param errMainText the errMainText
     */
    public void setErrMainText(String errMainText) {
        this.errMainText = errMainText;
    }

    /** 
     * Returns the delim.
     * 
     * @return the delim
     */
    public String getDelim() {
        return delim;
    }

    /** 
     * Sets the delim.
     * 
     * @param delim the delim
     */
    public void setDelim(String delim) {
        this.delim = delim;
    }
}
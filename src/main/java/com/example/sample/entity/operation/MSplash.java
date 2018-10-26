package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MSplashListener.class)
@Table(name = "m_splash")
public class MSplash {

    /** */
    @Id
    @Column(name = "splash_id")
    Integer splashId;

    /** */
    @Column(name = "frame_flg")
    Integer frameFlg;

    /** */
    @Column(name = "transition_url")
    String transitionUrl;

    /** */
    @Column(name = "start_date")
    LocalDateTime startDate;

    /** */
    @Column(name = "end_date")
    LocalDateTime endDate;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the splashId.
     * 
     * @return the splashId
     */
    public Integer getSplashId() {
        return splashId;
    }

    /** 
     * Sets the splashId.
     * 
     * @param splashId the splashId
     */
    public void setSplashId(Integer splashId) {
        this.splashId = splashId;
    }

    /** 
     * Returns the frameFlg.
     * 
     * @return the frameFlg
     */
    public Integer getFrameFlg() {
        return frameFlg;
    }

    /** 
     * Sets the frameFlg.
     * 
     * @param frameFlg the frameFlg
     */
    public void setFrameFlg(Integer frameFlg) {
        this.frameFlg = frameFlg;
    }

    /** 
     * Returns the transitionUrl.
     * 
     * @return the transitionUrl
     */
    public String getTransitionUrl() {
        return transitionUrl;
    }

    /** 
     * Sets the transitionUrl.
     * 
     * @param transitionUrl the transitionUrl
     */
    public void setTransitionUrl(String transitionUrl) {
        this.transitionUrl = transitionUrl;
    }

    /** 
     * Returns the startDate.
     * 
     * @return the startDate
     */
    public LocalDateTime getStartDate() {
        return startDate;
    }

    /** 
     * Sets the startDate.
     * 
     * @param startDate the startDate
     */
    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    /** 
     * Returns the endDate.
     * 
     * @return the endDate
     */
    public LocalDateTime getEndDate() {
        return endDate;
    }

    /** 
     * Sets the endDate.
     * 
     * @param endDate the endDate
     */
    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
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
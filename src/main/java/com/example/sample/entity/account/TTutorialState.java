package com.example.sample.entity.account;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TTutorialStateListener.class)
@Table(name = "t_tutorial_state")
public class TTutorialState {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Id
    @Column(name = "tutorial_id")
    Integer tutorialId;

    /** */
    @Column(name = "complete_flg")
    Integer completeFlg;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;
    
    /** */
    @Column(name = "count")
    Integer totalCount;

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
     * Returns the tutorialId.
     * 
     * @return the tutorialId
     */
    public Integer getTutorialId() {
        return tutorialId;
    }

    /** 
     * Sets the tutorialId.
     * 
     * @param tutorialId the tutorialId
     */
    public void setTutorialId(Integer tutorialId) {
        this.tutorialId = tutorialId;
    }

    /** 
     * Returns the completeFlg.
     * 
     * @return the completeFlg
     */
    public Integer getCompleteFlg() {
        return completeFlg;
    }

    /** 
     * Sets the completeFlg.
     * 
     * @param completeFlg the completeFlg
     */
    public void setCompleteFlg(Integer completeFlg) {
        this.completeFlg = completeFlg;
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
     * Returns the totalCount.
     * 
     * @return the totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /** 
     * Sets the totalCount.
     * 
     * @param totalCount the totalCount
     */
    public void setTotalCount(Integer updateDate) {
        this.totalCount = totalCount;
    }
}
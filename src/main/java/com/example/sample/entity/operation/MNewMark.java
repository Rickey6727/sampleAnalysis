package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * Ｎマーク表示制御マスタ
 */
@Entity(listener = MNewMarkListener.class)
@Table(name = "m_new_mark")
public class MNewMark {

    /** 画面ID */
    @Id
    @Column(name = "screen_id")
    Integer screenId;

    /** タブID */
    @Id
    @Column(name = "tab_id")
    Integer tabId;

    /** Nマーク開始日時 */
    @Column(name = "start_date")
    LocalDateTime startDate;

    /** Nマーク終了日時 */
    @Column(name = "end_date")
    LocalDateTime endDate;

    /** 作成日時 */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** 更新日時 */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the screenId.
     * 
     * @return the screenId
     */
    public Integer getScreenId() {
        return screenId;
    }

    /** 
     * Sets the screenId.
     * 
     * @param screenId the screenId
     */
    public void setScreenId(Integer screenId) {
        this.screenId = screenId;
    }

    /** 
     * Returns the tabId.
     * 
     * @return the tabId
     */
    public Integer getTabId() {
        return tabId;
    }

    /** 
     * Sets the tabId.
     * 
     * @param tabId the tabId
     */
    public void setTabId(Integer tabId) {
        this.tabId = tabId;
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
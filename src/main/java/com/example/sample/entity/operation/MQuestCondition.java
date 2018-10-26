package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * クエストクリア条件マスタ
 */
@Entity(listener = MQuestConditionListener.class)
@Table(name = "m_quest_condition")
public class MQuestCondition {

    /** クリア条件ID */
    @Id
    @Column(name = "condition_id")
    Integer conditionId;

    /** 通番 */
    @Id
    @Column(name = "condition_no")
    Integer conditionNo;

    /** 指定ID */
    @Column(name = "specific_id")
    Integer specificId;

    /** 指定種別 */
    @Column(name = "specific_type")
    Integer specificType;

    /** 指定カウント */
    @Column(name = "specific_count")
    Integer specificCount;

    /** */
    @Column(name = "link_url")
    String linkUrl;

    /** 登録日時 */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** 更新日時 */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the conditionId.
     * 
     * @return the conditionId
     */
    public Integer getConditionId() {
        return conditionId;
    }

    /** 
     * Sets the conditionId.
     * 
     * @param conditionId the conditionId
     */
    public void setConditionId(Integer conditionId) {
        this.conditionId = conditionId;
    }

    /** 
     * Returns the conditionNo.
     * 
     * @return the conditionNo
     */
    public Integer getConditionNo() {
        return conditionNo;
    }

    /** 
     * Sets the conditionNo.
     * 
     * @param conditionNo the conditionNo
     */
    public void setConditionNo(Integer conditionNo) {
        this.conditionNo = conditionNo;
    }

    /** 
     * Returns the specificId.
     * 
     * @return the specificId
     */
    public Integer getSpecificId() {
        return specificId;
    }

    /** 
     * Sets the specificId.
     * 
     * @param specificId the specificId
     */
    public void setSpecificId(Integer specificId) {
        this.specificId = specificId;
    }

    /** 
     * Returns the specificType.
     * 
     * @return the specificType
     */
    public Integer getSpecificType() {
        return specificType;
    }

    /** 
     * Sets the specificType.
     * 
     * @param specificType the specificType
     */
    public void setSpecificType(Integer specificType) {
        this.specificType = specificType;
    }

    /** 
     * Returns the specificCount.
     * 
     * @return the specificCount
     */
    public Integer getSpecificCount() {
        return specificCount;
    }

    /** 
     * Sets the specificCount.
     * 
     * @param specificCount the specificCount
     */
    public void setSpecificCount(Integer specificCount) {
        this.specificCount = specificCount;
    }

    /** 
     * Returns the linkUrl.
     * 
     * @return the linkUrl
     */
    public String getLinkUrl() {
        return linkUrl;
    }

    /** 
     * Sets the linkUrl.
     * 
     * @param linkUrl the linkUrl
     */
    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
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
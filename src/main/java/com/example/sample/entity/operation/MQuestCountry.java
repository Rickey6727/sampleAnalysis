package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * クエスト文言マスタ
 */
@Entity(listener = MQuestCountryListener.class)
@Table(name = "m_quest_country")
public class MQuestCountry {

    /** クエストID */
    @Id
    @Column(name = "quest_id")
    Integer questId;

    /** 言語コード */
    @Id
    @Column(name = "country_cd")
    Integer countryCd;

    /** タイトル */
    @Column(name = "title")
    String title;

    /** 参加条件 */
    @Column(name = "join_condition")
    String joinCondition;

    /** クリア条件 */
    @Column(name = "clear_condition")
    String clearCondition;

    /** 登録日時 */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** 更新日時 */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the questId.
     * 
     * @return the questId
     */
    public Integer getQuestId() {
        return questId;
    }

    /** 
     * Sets the questId.
     * 
     * @param questId the questId
     */
    public void setQuestId(Integer questId) {
        this.questId = questId;
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
     * Returns the title.
     * 
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /** 
     * Sets the title.
     * 
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /** 
     * Returns the joinCondition.
     * 
     * @return the joinCondition
     */
    public String getJoinCondition() {
        return joinCondition;
    }

    /** 
     * Sets the joinCondition.
     * 
     * @param joinCondition the joinCondition
     */
    public void setJoinCondition(String joinCondition) {
        this.joinCondition = joinCondition;
    }

    /** 
     * Returns the clearCondition.
     * 
     * @return the clearCondition
     */
    public String getClearCondition() {
        return clearCondition;
    }

    /** 
     * Sets the clearCondition.
     * 
     * @param clearCondition the clearCondition
     */
    public void setClearCondition(String clearCondition) {
        this.clearCondition = clearCondition;
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
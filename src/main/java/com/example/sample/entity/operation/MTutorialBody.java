package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MTutorialBodyListener.class)
@Table(name = "m_tutorial_body")
public class MTutorialBody {

    /** */
    @Id
    @Column(name = "tutorial_id")
    Integer tutorialId;

    /** */
    @Id
    @Column(name = "tutorial_body_type")
    Integer tutorialBodyType;

    /** */
    @Column(name = "body")
    String body;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

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
     * Returns the tutorialBodyType.
     * 
     * @return the tutorialBodyType
     */
    public Integer getTutorialBodyType() {
        return tutorialBodyType;
    }

    /** 
     * Sets the tutorialBodyType.
     * 
     * @param tutorialBodyType the tutorialBodyType
     */
    public void setTutorialBodyType(Integer tutorialBodyType) {
        this.tutorialBodyType = tutorialBodyType;
    }

    /** 
     * Returns the body.
     * 
     * @return the body
     */
    public String getBody() {
        return body;
    }

    /** 
     * Sets the body.
     * 
     * @param body the body
     */
    public void setBody(String body) {
        this.body = body;
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
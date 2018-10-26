package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MTutorialSubListener.class)
@Table(name = "m_tutorial_sub")
public class MTutorialSub {

    /** */
    @Id
    @Column(name = "tutorial_id")
    Integer tutorialId;

    /** */
    @Id
    @Column(name = "sub_number")
    Integer subNumber;

    /** */
    @Column(name = "action_type")
    Integer actionType;

    /** */
    @Column(name = "action_id")
    Integer actionId;

    /** */
    @Column(name = "my_show_button_flag")
    Boolean myShowButtonFlag;

    /** */
    @Column(name = "visit_button_flag")
    Boolean visitButtonFlag;

    /** */
    @Column(name = "map_button_flag")
    Boolean mapButtonFlag;

    /** */
    @Column(name = "gacha_button_flag")
    Boolean gachaButtonFlag;

    /** */
    @Column(name = "menu_button_flag")
    Boolean menuButtonFlag;

    /** */
    @Column(name = "visit_random_button_flag")
    Boolean visitRandomButtonFlag;

    /** */
    @Column(name = "visit_gifts_button_flag")
    Boolean visitGiftsButtonFlag;

    /** */
    @Column(name = "visit_friend_button_flag")
    Boolean visitFriendButtonFlag;

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
     * Returns the subNumber.
     * 
     * @return the subNumber
     */
    public Integer getSubNumber() {
        return subNumber;
    }

    /** 
     * Sets the subNumber.
     * 
     * @param subNumber the subNumber
     */
    public void setSubNumber(Integer subNumber) {
        this.subNumber = subNumber;
    }

    /** 
     * Returns the actionType.
     * 
     * @return the actionType
     */
    public Integer getActionType() {
        return actionType;
    }

    /** 
     * Sets the actionType.
     * 
     * @param actionType the actionType
     */
    public void setActionType(Integer actionType) {
        this.actionType = actionType;
    }

    /** 
     * Returns the actionId.
     * 
     * @return the actionId
     */
    public Integer getActionId() {
        return actionId;
    }

    /** 
     * Sets the actionId.
     * 
     * @param actionId the actionId
     */
    public void setActionId(Integer actionId) {
        this.actionId = actionId;
    }

    /** 
     * Returns the myShowButtonFlag.
     * 
     * @return the myShowButtonFlag
     */
    public Boolean getMyShowButtonFlag() {
        return myShowButtonFlag;
    }

    /** 
     * Sets the myShowButtonFlag.
     * 
     * @param myShowButtonFlag the myShowButtonFlag
     */
    public void setMyShowButtonFlag(Boolean myShowButtonFlag) {
        this.myShowButtonFlag = myShowButtonFlag;
    }

    /** 
     * Returns the visitButtonFlag.
     * 
     * @return the visitButtonFlag
     */
    public Boolean getVisitButtonFlag() {
        return visitButtonFlag;
    }

    /** 
     * Sets the visitButtonFlag.
     * 
     * @param visitButtonFlag the visitButtonFlag
     */
    public void setVisitButtonFlag(Boolean visitButtonFlag) {
        this.visitButtonFlag = visitButtonFlag;
    }

    /** 
     * Returns the mapButtonFlag.
     * 
     * @return the mapButtonFlag
     */
    public Boolean getMapButtonFlag() {
        return mapButtonFlag;
    }

    /** 
     * Sets the mapButtonFlag.
     * 
     * @param mapButtonFlag the mapButtonFlag
     */
    public void setMapButtonFlag(Boolean mapButtonFlag) {
        this.mapButtonFlag = mapButtonFlag;
    }

    /** 
     * Returns the gachaButtonFlag.
     * 
     * @return the gachaButtonFlag
     */
    public Boolean getGachaButtonFlag() {
        return gachaButtonFlag;
    }

    /** 
     * Sets the gachaButtonFlag.
     * 
     * @param gachaButtonFlag the gachaButtonFlag
     */
    public void setGachaButtonFlag(Boolean gachaButtonFlag) {
        this.gachaButtonFlag = gachaButtonFlag;
    }

    /** 
     * Returns the menuButtonFlag.
     * 
     * @return the menuButtonFlag
     */
    public Boolean getMenuButtonFlag() {
        return menuButtonFlag;
    }

    /** 
     * Sets the menuButtonFlag.
     * 
     * @param menuButtonFlag the menuButtonFlag
     */
    public void setMenuButtonFlag(Boolean menuButtonFlag) {
        this.menuButtonFlag = menuButtonFlag;
    }

    /** 
     * Returns the visitRandomButtonFlag.
     * 
     * @return the visitRandomButtonFlag
     */
    public Boolean getVisitRandomButtonFlag() {
        return visitRandomButtonFlag;
    }

    /** 
     * Sets the visitRandomButtonFlag.
     * 
     * @param visitRandomButtonFlag the visitRandomButtonFlag
     */
    public void setVisitRandomButtonFlag(Boolean visitRandomButtonFlag) {
        this.visitRandomButtonFlag = visitRandomButtonFlag;
    }

    /** 
     * Returns the visitGiftsButtonFlag.
     * 
     * @return the visitGiftsButtonFlag
     */
    public Boolean getVisitGiftsButtonFlag() {
        return visitGiftsButtonFlag;
    }

    /** 
     * Sets the visitGiftsButtonFlag.
     * 
     * @param visitGiftsButtonFlag the visitGiftsButtonFlag
     */
    public void setVisitGiftsButtonFlag(Boolean visitGiftsButtonFlag) {
        this.visitGiftsButtonFlag = visitGiftsButtonFlag;
    }

    /** 
     * Returns the visitFriendButtonFlag.
     * 
     * @return the visitFriendButtonFlag
     */
    public Boolean getVisitFriendButtonFlag() {
        return visitFriendButtonFlag;
    }

    /** 
     * Sets the visitFriendButtonFlag.
     * 
     * @param visitFriendButtonFlag the visitFriendButtonFlag
     */
    public void setVisitFriendButtonFlag(Boolean visitFriendButtonFlag) {
        this.visitFriendButtonFlag = visitFriendButtonFlag;
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
package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MTipsListener.class)
@Table(name = "m_tips")
public class MTips {

    /** */
    @Id
    @Column(name = "tips_id")
    Integer tipsId;

    /** */
    @Column(name = "character_id")
    Integer characterId;

    /** */
    @Column(name = "draw_y")
    Integer drawY;

    /** */
    @Column(name = "arrow_direction")
    Integer arrowDirection;

    /** */
    @Column(name = "arrow_x")
    Integer arrowX;

    /** */
    @Column(name = "arrow_y")
    Integer arrowY;

    /** */
    @Column(name = "grayout_flag")
    Boolean grayoutFlag;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the tipsId.
     * 
     * @return the tipsId
     */
    public Integer getTipsId() {
        return tipsId;
    }

    /** 
     * Sets the tipsId.
     * 
     * @param tipsId the tipsId
     */
    public void setTipsId(Integer tipsId) {
        this.tipsId = tipsId;
    }

    /** 
     * Returns the characterId.
     * 
     * @return the characterId
     */
    public Integer getCharacterId() {
        return characterId;
    }

    /** 
     * Sets the characterId.
     * 
     * @param characterId the characterId
     */
    public void setCharacterId(Integer characterId) {
        this.characterId = characterId;
    }

    /** 
     * Returns the drawY.
     * 
     * @return the drawY
     */
    public Integer getDrawY() {
        return drawY;
    }

    /** 
     * Sets the drawY.
     * 
     * @param drawY the drawY
     */
    public void setDrawY(Integer drawY) {
        this.drawY = drawY;
    }

    /** 
     * Returns the arrowDirection.
     * 
     * @return the arrowDirection
     */
    public Integer getArrowDirection() {
        return arrowDirection;
    }

    /** 
     * Sets the arrowDirection.
     * 
     * @param arrowDirection the arrowDirection
     */
    public void setArrowDirection(Integer arrowDirection) {
        this.arrowDirection = arrowDirection;
    }

    /** 
     * Returns the arrowX.
     * 
     * @return the arrowX
     */
    public Integer getArrowX() {
        return arrowX;
    }

    /** 
     * Sets the arrowX.
     * 
     * @param arrowX the arrowX
     */
    public void setArrowX(Integer arrowX) {
        this.arrowX = arrowX;
    }

    /** 
     * Returns the arrowY.
     * 
     * @return the arrowY
     */
    public Integer getArrowY() {
        return arrowY;
    }

    /** 
     * Sets the arrowY.
     * 
     * @param arrowY the arrowY
     */
    public void setArrowY(Integer arrowY) {
        this.arrowY = arrowY;
    }

    /** 
     * Returns the grayoutFlag.
     * 
     * @return the grayoutFlag
     */
    public Boolean getGrayoutFlag() {
        return grayoutFlag;
    }

    /** 
     * Sets the grayoutFlag.
     * 
     * @param grayoutFlag the grayoutFlag
     */
    public void setGrayoutFlag(Boolean grayoutFlag) {
        this.grayoutFlag = grayoutFlag;
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
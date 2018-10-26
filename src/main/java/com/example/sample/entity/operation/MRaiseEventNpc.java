package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MRaiseEventNpcListener.class)
@Table(name = "m_raise_event_npc")
public class MRaiseEventNpc {

    /** */
    @Id
    @Column(name = "event_id")
    Integer eventId;

    /** */
    @Id
    @Column(name = "rare")
    Short rare;

    /** */
    @Column(name = "probability")
    Integer probability;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the eventId.
     * 
     * @return the eventId
     */
    public Integer getEventId() {
        return eventId;
    }

    /** 
     * Sets the eventId.
     * 
     * @param eventId the eventId
     */
    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    /** 
     * Returns the rare.
     * 
     * @return the rare
     */
    public Short getRare() {
        return rare;
    }

    /** 
     * Sets the rare.
     * 
     * @param rare the rare
     */
    public void setRare(Short rare) {
        this.rare = rare;
    }

    /** 
     * Returns the probability.
     * 
     * @return the probability
     */
    public Integer getProbability() {
        return probability;
    }

    /** 
     * Sets the probability.
     * 
     * @param probability the probability
     */
    public void setProbability(Integer probability) {
        this.probability = probability;
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
package com.example.sample.entity.operation;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MRaiseEventStoryListener.class)
@Table(name = "m_raise_event_story")
public class MRaiseEventStory {

    /** */
    @Id
    @Column(name = "event_id")
    Integer eventId;

    /** */
    @Column(name = "clear_scale")
    Integer clearScale;

    /** */
    @Column(name = "final_episode")
    Integer finalEpisode;

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
     * Returns the clearScale.
     * 
     * @return the clearScale
     */
    public Integer getClearScale() {
        return clearScale;
    }

    /** 
     * Sets the clearScale.
     * 
     * @param clearScale the clearScale
     */
    public void setClearScale(Integer clearScale) {
        this.clearScale = clearScale;
    }

    /** 
     * Returns the finalEpisode.
     * 
     * @return the finalEpisode
     */
    public Integer getFinalEpisode() {
        return finalEpisode;
    }

    /** 
     * Sets the finalEpisode.
     * 
     * @param finalEpisode the finalEpisode
     */
    public void setFinalEpisode(Integer finalEpisode) {
        this.finalEpisode = finalEpisode;
    }
}
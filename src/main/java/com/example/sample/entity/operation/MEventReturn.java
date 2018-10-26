package com.example.sample.entity.operation;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MEventReturnListener.class)
@Table(name = "m_event_return")
public class MEventReturn {

    /** */
    @Id
    @Column(name = "event_id")
    Integer eventId;

    /** */
    @Id
    @Column(name = "return_no")
    Short returnNo;

    /** */
    @Column(name = "return_path")
    String returnPath;

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
     * Returns the returnNo.
     * 
     * @return the returnNo
     */
    public Short getReturnNo() {
        return returnNo;
    }

    /** 
     * Sets the returnNo.
     * 
     * @param returnNo the returnNo
     */
    public void setReturnNo(Short returnNo) {
        this.returnNo = returnNo;
    }

    /** 
     * Returns the returnPath.
     * 
     * @return the returnPath
     */
    public String getReturnPath() {
        return returnPath;
    }

    /** 
     * Sets the returnPath.
     * 
     * @param returnPath the returnPath
     */
    public void setReturnPath(String returnPath) {
        this.returnPath = returnPath;
    }
}
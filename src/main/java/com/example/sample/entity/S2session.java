package com.example.sample.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = S2sessionListener.class)
@Table(name = "s2session")
public class S2session {

    /** */
    @Id
    @Column(name = "session_id")
    String sessionId;

    /** */
    @Id
    @Column(name = "name")
    String name;

    /** */
    @Column(name = "value")
    byte[] value;

    /** */
    @Column(name = "last_access")
    LocalDateTime lastAccess;

    /** 
     * Returns the sessionId.
     * 
     * @return the sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    /** 
     * Sets the sessionId.
     * 
     * @param sessionId the sessionId
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /** 
     * Returns the name.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /** 
     * Sets the name.
     * 
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Returns the value.
     * 
     * @return the value
     */
    public byte[] getValue() {
        return value;
    }

    /** 
     * Sets the value.
     * 
     * @param value the value
     */
    public void setValue(byte[] value) {
        this.value = value;
    }

    /** 
     * Returns the lastAccess.
     * 
     * @return the lastAccess
     */
    public LocalDateTime getLastAccess() {
        return lastAccess;
    }

    /** 
     * Sets the lastAccess.
     * 
     * @param lastAccess the lastAccess
     */
    public void setLastAccess(LocalDateTime lastAccess) {
        this.lastAccess = lastAccess;
    }
}
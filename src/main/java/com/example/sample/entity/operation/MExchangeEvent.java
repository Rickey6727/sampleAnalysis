package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MExchangeEventListener.class)
@Table(name = "m_exchange_event")
public class MExchangeEvent {

    /** */
    @Id
    @Column(name = "event_id")
    Integer eventId;

    /** */
    @Id
    @Column(name = "event_type")
    Integer eventType;

    /** */
    @Id
    @Column(name = "exchange_id")
    Integer exchangeId;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** */
    @Column(name = "tab_id")
    Integer tabId;

    /** */
    @Column(name = "page_id")
    Integer pageId;

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
     * Returns the eventType.
     * 
     * @return the eventType
     */
    public Integer getEventType() {
        return eventType;
    }

    /** 
     * Sets the eventType.
     * 
     * @param eventType the eventType
     */
    public void setEventType(Integer eventType) {
        this.eventType = eventType;
    }

    /** 
     * Returns the exchangeId.
     * 
     * @return the exchangeId
     */
    public Integer getExchangeId() {
        return exchangeId;
    }

    /** 
     * Sets the exchangeId.
     * 
     * @param exchangeId the exchangeId
     */
    public void setExchangeId(Integer exchangeId) {
        this.exchangeId = exchangeId;
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
     * Returns the pageId.
     * 
     * @return the pageId
     */
    public Integer getPageId() {
        return pageId;
    }

    /** 
     * Sets the pageId.
     * 
     * @param pageId the pageId
     */
    public void setPageId(Integer pageId) {
        this.pageId = pageId;
    }
}
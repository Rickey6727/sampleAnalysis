package com.example.sample.entity.operation;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MRaiseEventNpcUseItemListener.class)
@Table(name = "m_raise_event_npc_use_item")
public class MRaiseEventNpcUseItem {

    /** */
    @Id
    @Column(name = "event_id")
    Integer eventId;

    /** */
    @Id
    @Column(name = "rare")
    Short rare;

    /** */
    @Id
    @Column(name = "use_item_type")
    Short useItemType;

    /** */
    @Column(name = "item_type")
    Integer itemType;

    /** */
    @Column(name = "item_id")
    Integer itemId;

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
     * Returns the useItemType.
     * 
     * @return the useItemType
     */
    public Short getUseItemType() {
        return useItemType;
    }

    /** 
     * Sets the useItemType.
     * 
     * @param useItemType the useItemType
     */
    public void setUseItemType(Short useItemType) {
        this.useItemType = useItemType;
    }

    /** 
     * Returns the itemType.
     * 
     * @return the itemType
     */
    public Integer getItemType() {
        return itemType;
    }

    /** 
     * Sets the itemType.
     * 
     * @param itemType the itemType
     */
    public void setItemType(Integer itemType) {
        this.itemType = itemType;
    }

    /** 
     * Returns the itemId.
     * 
     * @return the itemId
     */
    public Integer getItemId() {
        return itemId;
    }

    /** 
     * Sets the itemId.
     * 
     * @param itemId the itemId
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }
}
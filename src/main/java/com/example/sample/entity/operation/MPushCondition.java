package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MPushConditionListener.class)
@Table(name = "m_push_condition")
public class MPushCondition {

    /** */
    @Id
    @Column(name = "push_id")
    Integer pushId;

    /** */
    @Column(name = "count")
    Integer count;

    /** */
    @Column(name = "push_message_id")
    Integer pushMessageId;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the pushId.
     * 
     * @return the pushId
     */
    public Integer getPushId() {
        return pushId;
    }

    /** 
     * Sets the pushId.
     * 
     * @param pushId the pushId
     */
    public void setPushId(Integer pushId) {
        this.pushId = pushId;
    }

    /** 
     * Returns the count.
     * 
     * @return the count
     */
    public Integer getCount() {
        return count;
    }

    /** 
     * Sets the count.
     * 
     * @param count the count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /** 
     * Returns the pushMessageId.
     * 
     * @return the pushMessageId
     */
    public Integer getPushMessageId() {
        return pushMessageId;
    }

    /** 
     * Sets the pushMessageId.
     * 
     * @param pushMessageId the pushMessageId
     */
    public void setPushMessageId(Integer pushMessageId) {
        this.pushMessageId = pushMessageId;
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
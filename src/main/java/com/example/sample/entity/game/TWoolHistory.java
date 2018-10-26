package com.example.sample.entity.game;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TWoolHistoryListener.class)
@Table(name = "t_wool_history")
public class TWoolHistory {

    /** */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "serial_id")
    Long serialId;

    /** */
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Column(name = "sheep_id")
    Integer sheepId;

    /** */
    @Column(name = "acquire_point")
    Integer acquirePoint;

    /** */
    @Column(name = "wool_count")
    Integer woolCount;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** 
     * Returns the serialId.
     * 
     * @return the serialId
     */
    public Long getSerialId() {
        return serialId;
    }

    /** 
     * Sets the serialId.
     * 
     * @param serialId the serialId
     */
    public void setSerialId(Long serialId) {
        this.serialId = serialId;
    }

    /** 
     * Returns the accountId.
     * 
     * @return the accountId
     */
    public Integer getAccountId() {
        return accountId;
    }

    /** 
     * Sets the accountId.
     * 
     * @param accountId the accountId
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    /** 
     * Returns the sheepId.
     * 
     * @return the sheepId
     */
    public Integer getSheepId() {
        return sheepId;
    }

    /** 
     * Sets the sheepId.
     * 
     * @param sheepId the sheepId
     */
    public void setSheepId(Integer sheepId) {
        this.sheepId = sheepId;
    }

    /** 
     * Returns the acquirePoint.
     * 
     * @return the acquirePoint
     */
    public Integer getAcquirePoint() {
        return acquirePoint;
    }

    /** 
     * Sets the acquirePoint.
     * 
     * @param acquirePoint the acquirePoint
     */
    public void setAcquirePoint(Integer acquirePoint) {
        this.acquirePoint = acquirePoint;
    }

    /** 
     * Returns the woolCount.
     * 
     * @return the woolCount
     */
    public Integer getWoolCount() {
        return woolCount;
    }

    /** 
     * Sets the woolCount.
     * 
     * @param woolCount the woolCount
     */
    public void setWoolCount(Integer woolCount) {
        this.woolCount = woolCount;
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
}
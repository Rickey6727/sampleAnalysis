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
@Entity(listener = TSheepShopHistoryListener.class)
@Table(name = "t_sheep_shop_history")
public class TSheepShopHistory {

    /** */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "serial_id")
    Long serialId;

    /** */
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Column(name = "purchase_type")
    Integer purchaseType;

    /** */
    @Column(name = "purchase_id")
    Integer purchaseId;

    /** */
    @Column(name = "use_point")
    Integer usePoint;

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
     * Returns the purchaseType.
     * 
     * @return the purchaseType
     */
    public Integer getPurchaseType() {
        return purchaseType;
    }

    /** 
     * Sets the purchaseType.
     * 
     * @param purchaseType the purchaseType
     */
    public void setPurchaseType(Integer purchaseType) {
        this.purchaseType = purchaseType;
    }

    /** 
     * Returns the purchaseId.
     * 
     * @return the purchaseId
     */
    public Integer getPurchaseId() {
        return purchaseId;
    }

    /** 
     * Sets the purchaseId.
     * 
     * @param purchaseId the purchaseId
     */
    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    /** 
     * Returns the usePoint.
     * 
     * @return the usePoint
     */
    public Integer getUsePoint() {
        return usePoint;
    }

    /** 
     * Sets the usePoint.
     * 
     * @param usePoint the usePoint
     */
    public void setUsePoint(Integer usePoint) {
        this.usePoint = usePoint;
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
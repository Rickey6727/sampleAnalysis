package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TCcpFamilyPresentCountListener.class)
@Table(name = "t_ccp_family_present_count")
public class TCcpFamilyPresentCount {

    /** */
    @Id
    @Column(name = "application_id")
    Integer applicationId;

    /** */
    @Id
    @Column(name = "family_account_id")
    Integer familyAccountId;

    /** */
    @Column(name = "present_count")
    Integer presentCount;

    /** */
    @Column(name = "last_present_date")
    LocalDateTime lastPresentDate;

    /** 
     * Returns the applicationId.
     * 
     * @return the applicationId
     */
    public Integer getApplicationId() {
        return applicationId;
    }

    /** 
     * Sets the applicationId.
     * 
     * @param applicationId the applicationId
     */
    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    /** 
     * Returns the familyAccountId.
     * 
     * @return the familyAccountId
     */
    public Integer getFamilyAccountId() {
        return familyAccountId;
    }

    /** 
     * Sets the familyAccountId.
     * 
     * @param familyAccountId the familyAccountId
     */
    public void setFamilyAccountId(Integer familyAccountId) {
        this.familyAccountId = familyAccountId;
    }

    /** 
     * Returns the presentCount.
     * 
     * @return the presentCount
     */
    public Integer getPresentCount() {
        return presentCount;
    }

    /** 
     * Sets the presentCount.
     * 
     * @param presentCount the presentCount
     */
    public void setPresentCount(Integer presentCount) {
        this.presentCount = presentCount;
    }

    /** 
     * Returns the lastPresentDate.
     * 
     * @return the lastPresentDate
     */
    public LocalDateTime getLastPresentDate() {
        return lastPresentDate;
    }

    /** 
     * Sets the lastPresentDate.
     * 
     * @param lastPresentDate the lastPresentDate
     */
    public void setLastPresentDate(LocalDateTime lastPresentDate) {
        this.lastPresentDate = lastPresentDate;
    }
}
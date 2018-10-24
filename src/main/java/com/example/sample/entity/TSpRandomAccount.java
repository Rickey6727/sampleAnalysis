package com.example.sample.entity;

import java.time.LocalDate;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TSpRandomAccountListener.class)
@Table(name = "t_sp_random_account")
public class TSpRandomAccount {

    /** */
    @Id
    @Column(name = "random_type")
    Integer randomType;

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Column(name = "create_date")
    LocalDate createDate;

    /** 
     * Returns the randomType.
     * 
     * @return the randomType
     */
    public Integer getRandomType() {
        return randomType;
    }

    /** 
     * Sets the randomType.
     * 
     * @param randomType the randomType
     */
    public void setRandomType(Integer randomType) {
        this.randomType = randomType;
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
     * Returns the createDate.
     * 
     * @return the createDate
     */
    public LocalDate getCreateDate() {
        return createDate;
    }

    /** 
     * Sets the createDate.
     * 
     * @param createDate the createDate
     */
    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }
}
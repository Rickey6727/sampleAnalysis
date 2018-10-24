package com.example.sample.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * テストアカウントテーブル
 */
@Entity(listener = TTestAccountListener.class)
@Table(name = "t_test_account")
public class TTestAccount {

    /** アカウントID */
    @Id
    @Column(name = "account_id")
    Integer accountId;

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
}
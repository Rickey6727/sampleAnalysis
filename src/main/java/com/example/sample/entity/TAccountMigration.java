package com.example.sample.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * アカウント移行テーブル
 */
@Entity(listener = TAccountMigrationListener.class)
@Table(name = "t_account_migration")
public class TAccountMigration {

    /** アカウントID */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** 端末移行コード */
    @Column(name = "migration_cd")
    String migrationCd;

    /** 登録日時 */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** 更新日時 */
    @Column(name = "update_date")
    LocalDateTime updateDate;

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
     * Returns the migrationCd.
     * 
     * @return the migrationCd
     */
    public String getMigrationCd() {
        return migrationCd;
    }

    /** 
     * Sets the migrationCd.
     * 
     * @param migrationCd the migrationCd
     */
    public void setMigrationCd(String migrationCd) {
        this.migrationCd = migrationCd;
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
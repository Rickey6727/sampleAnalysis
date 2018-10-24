package com.example.sample.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * ログイン情報テーブル
 */
@Entity(listener = TLoginListener.class)
@Table(name = "t_login")
public class TLogin {

    /** アカウントID */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** 最終ログイン日時 */
    @Column(name = "last_login")
    LocalDateTime lastLogin;

    /** セッションID */
    @Column(name = "session_id")
    String sessionId;

    /** ログイン回数 */
    @Column(name = "login_cnt")
    Integer loginCnt;

    /** */
    @Column(name = "login_err_cnt")
    Integer loginErrCnt;

    /** アカウントロック回数 */
    @Column(name = "account_lock_cnt")
    Integer accountLockCnt;

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
     * Returns the lastLogin.
     * 
     * @return the lastLogin
     */
    public LocalDateTime getLastLogin() {
        return lastLogin;
    }

    /** 
     * Sets the lastLogin.
     * 
     * @param lastLogin the lastLogin
     */
    public void setLastLogin(LocalDateTime lastLogin) {
        this.lastLogin = lastLogin;
    }

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
     * Returns the loginCnt.
     * 
     * @return the loginCnt
     */
    public Integer getLoginCnt() {
        return loginCnt;
    }

    /** 
     * Sets the loginCnt.
     * 
     * @param loginCnt the loginCnt
     */
    public void setLoginCnt(Integer loginCnt) {
        this.loginCnt = loginCnt;
    }

    /** 
     * Returns the loginErrCnt.
     * 
     * @return the loginErrCnt
     */
    public Integer getLoginErrCnt() {
        return loginErrCnt;
    }

    /** 
     * Sets the loginErrCnt.
     * 
     * @param loginErrCnt the loginErrCnt
     */
    public void setLoginErrCnt(Integer loginErrCnt) {
        this.loginErrCnt = loginErrCnt;
    }

    /** 
     * Returns the accountLockCnt.
     * 
     * @return the accountLockCnt
     */
    public Integer getAccountLockCnt() {
        return accountLockCnt;
    }

    /** 
     * Sets the accountLockCnt.
     * 
     * @param accountLockCnt the accountLockCnt
     */
    public void setAccountLockCnt(Integer accountLockCnt) {
        this.accountLockCnt = accountLockCnt;
    }
}
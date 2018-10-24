package com.example.sample.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TCheerNoticeListener.class)
@Table(name = "t_cheer_notice")
public class TCheerNotice {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Column(name = "notice_flg")
    Integer noticeFlg;

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
     * Returns the noticeFlg.
     * 
     * @return the noticeFlg
     */
    public Integer getNoticeFlg() {
        return noticeFlg;
    }

    /** 
     * Sets the noticeFlg.
     * 
     * @param noticeFlg the noticeFlg
     */
    public void setNoticeFlg(Integer noticeFlg) {
        this.noticeFlg = noticeFlg;
    }
}
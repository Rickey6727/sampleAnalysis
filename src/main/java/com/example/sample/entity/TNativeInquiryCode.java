package com.example.sample.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TNativeInquiryCodeListener.class)
@Table(name = "t_native_inquiry_code")
public class TNativeInquiryCode {

    /** */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** */
    @Column(name = "inquiry_code")
    String inquiryCode;

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
     * Returns the inquiryCode.
     * 
     * @return the inquiryCode
     */
    public String getInquiryCode() {
        return inquiryCode;
    }

    /** 
     * Sets the inquiryCode.
     * 
     * @param inquiryCode the inquiryCode
     */
    public void setInquiryCode(String inquiryCode) {
        this.inquiryCode = inquiryCode;
    }
}
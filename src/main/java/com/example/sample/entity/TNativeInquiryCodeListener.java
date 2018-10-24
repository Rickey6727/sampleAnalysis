package com.example.sample.entity;

import org.seasar.doma.jdbc.entity.EntityListener;
import org.seasar.doma.jdbc.entity.PostDeleteContext;
import org.seasar.doma.jdbc.entity.PostInsertContext;
import org.seasar.doma.jdbc.entity.PostUpdateContext;
import org.seasar.doma.jdbc.entity.PreDeleteContext;
import org.seasar.doma.jdbc.entity.PreInsertContext;
import org.seasar.doma.jdbc.entity.PreUpdateContext;

/**
 * 
 */
public class TNativeInquiryCodeListener implements EntityListener<TNativeInquiryCode> {

    @Override
    public void preInsert(TNativeInquiryCode entity, PreInsertContext<TNativeInquiryCode> context) {
    }

    @Override
    public void preUpdate(TNativeInquiryCode entity, PreUpdateContext<TNativeInquiryCode> context) {
    }

    @Override
    public void preDelete(TNativeInquiryCode entity, PreDeleteContext<TNativeInquiryCode> context) {
    }

    @Override
    public void postInsert(TNativeInquiryCode entity, PostInsertContext<TNativeInquiryCode> context) {
    }

    @Override
    public void postUpdate(TNativeInquiryCode entity, PostUpdateContext<TNativeInquiryCode> context) {
    }

    @Override
    public void postDelete(TNativeInquiryCode entity, PostDeleteContext<TNativeInquiryCode> context) {
    }
}
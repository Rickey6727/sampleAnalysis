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
public class TNativeInviteListener implements EntityListener<TNativeInvite> {

    @Override
    public void preInsert(TNativeInvite entity, PreInsertContext<TNativeInvite> context) {
    }

    @Override
    public void preUpdate(TNativeInvite entity, PreUpdateContext<TNativeInvite> context) {
    }

    @Override
    public void preDelete(TNativeInvite entity, PreDeleteContext<TNativeInvite> context) {
    }

    @Override
    public void postInsert(TNativeInvite entity, PostInsertContext<TNativeInvite> context) {
    }

    @Override
    public void postUpdate(TNativeInvite entity, PostUpdateContext<TNativeInvite> context) {
    }

    @Override
    public void postDelete(TNativeInvite entity, PostDeleteContext<TNativeInvite> context) {
    }
}
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
public class TNativeInviteFailHistoryListener implements EntityListener<TNativeInviteFailHistory> {

    @Override
    public void preInsert(TNativeInviteFailHistory entity, PreInsertContext<TNativeInviteFailHistory> context) {
    }

    @Override
    public void preUpdate(TNativeInviteFailHistory entity, PreUpdateContext<TNativeInviteFailHistory> context) {
    }

    @Override
    public void preDelete(TNativeInviteFailHistory entity, PreDeleteContext<TNativeInviteFailHistory> context) {
    }

    @Override
    public void postInsert(TNativeInviteFailHistory entity, PostInsertContext<TNativeInviteFailHistory> context) {
    }

    @Override
    public void postUpdate(TNativeInviteFailHistory entity, PostUpdateContext<TNativeInviteFailHistory> context) {
    }

    @Override
    public void postDelete(TNativeInviteFailHistory entity, PostDeleteContext<TNativeInviteFailHistory> context) {
    }
}
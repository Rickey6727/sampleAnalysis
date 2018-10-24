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
public class TInviteHistoryListener implements EntityListener<TInviteHistory> {

    @Override
    public void preInsert(TInviteHistory entity, PreInsertContext<TInviteHistory> context) {
    }

    @Override
    public void preUpdate(TInviteHistory entity, PreUpdateContext<TInviteHistory> context) {
    }

    @Override
    public void preDelete(TInviteHistory entity, PreDeleteContext<TInviteHistory> context) {
    }

    @Override
    public void postInsert(TInviteHistory entity, PostInsertContext<TInviteHistory> context) {
    }

    @Override
    public void postUpdate(TInviteHistory entity, PostUpdateContext<TInviteHistory> context) {
    }

    @Override
    public void postDelete(TInviteHistory entity, PostDeleteContext<TInviteHistory> context) {
    }
}
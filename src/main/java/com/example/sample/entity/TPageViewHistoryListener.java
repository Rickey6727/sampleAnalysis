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
public class TPageViewHistoryListener implements EntityListener<TPageViewHistory> {

    @Override
    public void preInsert(TPageViewHistory entity, PreInsertContext<TPageViewHistory> context) {
    }

    @Override
    public void preUpdate(TPageViewHistory entity, PreUpdateContext<TPageViewHistory> context) {
    }

    @Override
    public void preDelete(TPageViewHistory entity, PreDeleteContext<TPageViewHistory> context) {
    }

    @Override
    public void postInsert(TPageViewHistory entity, PostInsertContext<TPageViewHistory> context) {
    }

    @Override
    public void postUpdate(TPageViewHistory entity, PostUpdateContext<TPageViewHistory> context) {
    }

    @Override
    public void postDelete(TPageViewHistory entity, PostDeleteContext<TPageViewHistory> context) {
    }
}
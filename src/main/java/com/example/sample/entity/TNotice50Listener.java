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
public class TNotice50Listener implements EntityListener<TNotice50> {

    @Override
    public void preInsert(TNotice50 entity, PreInsertContext<TNotice50> context) {
    }

    @Override
    public void preUpdate(TNotice50 entity, PreUpdateContext<TNotice50> context) {
    }

    @Override
    public void preDelete(TNotice50 entity, PreDeleteContext<TNotice50> context) {
    }

    @Override
    public void postInsert(TNotice50 entity, PostInsertContext<TNotice50> context) {
    }

    @Override
    public void postUpdate(TNotice50 entity, PostUpdateContext<TNotice50> context) {
    }

    @Override
    public void postDelete(TNotice50 entity, PostDeleteContext<TNotice50> context) {
    }
}
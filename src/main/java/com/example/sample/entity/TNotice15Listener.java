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
public class TNotice15Listener implements EntityListener<TNotice15> {

    @Override
    public void preInsert(TNotice15 entity, PreInsertContext<TNotice15> context) {
    }

    @Override
    public void preUpdate(TNotice15 entity, PreUpdateContext<TNotice15> context) {
    }

    @Override
    public void preDelete(TNotice15 entity, PreDeleteContext<TNotice15> context) {
    }

    @Override
    public void postInsert(TNotice15 entity, PostInsertContext<TNotice15> context) {
    }

    @Override
    public void postUpdate(TNotice15 entity, PostUpdateContext<TNotice15> context) {
    }

    @Override
    public void postDelete(TNotice15 entity, PostDeleteContext<TNotice15> context) {
    }
}
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
public class TNotice28Listener implements EntityListener<TNotice28> {

    @Override
    public void preInsert(TNotice28 entity, PreInsertContext<TNotice28> context) {
    }

    @Override
    public void preUpdate(TNotice28 entity, PreUpdateContext<TNotice28> context) {
    }

    @Override
    public void preDelete(TNotice28 entity, PreDeleteContext<TNotice28> context) {
    }

    @Override
    public void postInsert(TNotice28 entity, PostInsertContext<TNotice28> context) {
    }

    @Override
    public void postUpdate(TNotice28 entity, PostUpdateContext<TNotice28> context) {
    }

    @Override
    public void postDelete(TNotice28 entity, PostDeleteContext<TNotice28> context) {
    }
}
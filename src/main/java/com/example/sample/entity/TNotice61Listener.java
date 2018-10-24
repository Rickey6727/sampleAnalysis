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
public class TNotice61Listener implements EntityListener<TNotice61> {

    @Override
    public void preInsert(TNotice61 entity, PreInsertContext<TNotice61> context) {
    }

    @Override
    public void preUpdate(TNotice61 entity, PreUpdateContext<TNotice61> context) {
    }

    @Override
    public void preDelete(TNotice61 entity, PreDeleteContext<TNotice61> context) {
    }

    @Override
    public void postInsert(TNotice61 entity, PostInsertContext<TNotice61> context) {
    }

    @Override
    public void postUpdate(TNotice61 entity, PostUpdateContext<TNotice61> context) {
    }

    @Override
    public void postDelete(TNotice61 entity, PostDeleteContext<TNotice61> context) {
    }
}
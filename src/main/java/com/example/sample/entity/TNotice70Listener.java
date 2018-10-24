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
public class TNotice70Listener implements EntityListener<TNotice70> {

    @Override
    public void preInsert(TNotice70 entity, PreInsertContext<TNotice70> context) {
    }

    @Override
    public void preUpdate(TNotice70 entity, PreUpdateContext<TNotice70> context) {
    }

    @Override
    public void preDelete(TNotice70 entity, PreDeleteContext<TNotice70> context) {
    }

    @Override
    public void postInsert(TNotice70 entity, PostInsertContext<TNotice70> context) {
    }

    @Override
    public void postUpdate(TNotice70 entity, PostUpdateContext<TNotice70> context) {
    }

    @Override
    public void postDelete(TNotice70 entity, PostDeleteContext<TNotice70> context) {
    }
}
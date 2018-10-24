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
public class TNotice31Listener implements EntityListener<TNotice31> {

    @Override
    public void preInsert(TNotice31 entity, PreInsertContext<TNotice31> context) {
    }

    @Override
    public void preUpdate(TNotice31 entity, PreUpdateContext<TNotice31> context) {
    }

    @Override
    public void preDelete(TNotice31 entity, PreDeleteContext<TNotice31> context) {
    }

    @Override
    public void postInsert(TNotice31 entity, PostInsertContext<TNotice31> context) {
    }

    @Override
    public void postUpdate(TNotice31 entity, PostUpdateContext<TNotice31> context) {
    }

    @Override
    public void postDelete(TNotice31 entity, PostDeleteContext<TNotice31> context) {
    }
}
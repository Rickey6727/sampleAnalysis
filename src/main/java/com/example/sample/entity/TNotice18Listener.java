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
public class TNotice18Listener implements EntityListener<TNotice18> {

    @Override
    public void preInsert(TNotice18 entity, PreInsertContext<TNotice18> context) {
    }

    @Override
    public void preUpdate(TNotice18 entity, PreUpdateContext<TNotice18> context) {
    }

    @Override
    public void preDelete(TNotice18 entity, PreDeleteContext<TNotice18> context) {
    }

    @Override
    public void postInsert(TNotice18 entity, PostInsertContext<TNotice18> context) {
    }

    @Override
    public void postUpdate(TNotice18 entity, PostUpdateContext<TNotice18> context) {
    }

    @Override
    public void postDelete(TNotice18 entity, PostDeleteContext<TNotice18> context) {
    }
}
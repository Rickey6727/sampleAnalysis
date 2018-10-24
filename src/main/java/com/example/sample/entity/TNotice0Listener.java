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
public class TNotice0Listener implements EntityListener<TNotice0> {

    @Override
    public void preInsert(TNotice0 entity, PreInsertContext<TNotice0> context) {
    }

    @Override
    public void preUpdate(TNotice0 entity, PreUpdateContext<TNotice0> context) {
    }

    @Override
    public void preDelete(TNotice0 entity, PreDeleteContext<TNotice0> context) {
    }

    @Override
    public void postInsert(TNotice0 entity, PostInsertContext<TNotice0> context) {
    }

    @Override
    public void postUpdate(TNotice0 entity, PostUpdateContext<TNotice0> context) {
    }

    @Override
    public void postDelete(TNotice0 entity, PostDeleteContext<TNotice0> context) {
    }
}
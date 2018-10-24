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
public class TNotice95Listener implements EntityListener<TNotice95> {

    @Override
    public void preInsert(TNotice95 entity, PreInsertContext<TNotice95> context) {
    }

    @Override
    public void preUpdate(TNotice95 entity, PreUpdateContext<TNotice95> context) {
    }

    @Override
    public void preDelete(TNotice95 entity, PreDeleteContext<TNotice95> context) {
    }

    @Override
    public void postInsert(TNotice95 entity, PostInsertContext<TNotice95> context) {
    }

    @Override
    public void postUpdate(TNotice95 entity, PostUpdateContext<TNotice95> context) {
    }

    @Override
    public void postDelete(TNotice95 entity, PostDeleteContext<TNotice95> context) {
    }
}
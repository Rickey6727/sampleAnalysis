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
public class TNotice64Listener implements EntityListener<TNotice64> {

    @Override
    public void preInsert(TNotice64 entity, PreInsertContext<TNotice64> context) {
    }

    @Override
    public void preUpdate(TNotice64 entity, PreUpdateContext<TNotice64> context) {
    }

    @Override
    public void preDelete(TNotice64 entity, PreDeleteContext<TNotice64> context) {
    }

    @Override
    public void postInsert(TNotice64 entity, PostInsertContext<TNotice64> context) {
    }

    @Override
    public void postUpdate(TNotice64 entity, PostUpdateContext<TNotice64> context) {
    }

    @Override
    public void postDelete(TNotice64 entity, PostDeleteContext<TNotice64> context) {
    }
}
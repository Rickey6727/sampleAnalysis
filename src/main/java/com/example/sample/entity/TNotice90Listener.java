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
public class TNotice90Listener implements EntityListener<TNotice90> {

    @Override
    public void preInsert(TNotice90 entity, PreInsertContext<TNotice90> context) {
    }

    @Override
    public void preUpdate(TNotice90 entity, PreUpdateContext<TNotice90> context) {
    }

    @Override
    public void preDelete(TNotice90 entity, PreDeleteContext<TNotice90> context) {
    }

    @Override
    public void postInsert(TNotice90 entity, PostInsertContext<TNotice90> context) {
    }

    @Override
    public void postUpdate(TNotice90 entity, PostUpdateContext<TNotice90> context) {
    }

    @Override
    public void postDelete(TNotice90 entity, PostDeleteContext<TNotice90> context) {
    }
}
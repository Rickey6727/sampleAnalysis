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
public class TNotice30Listener implements EntityListener<TNotice30> {

    @Override
    public void preInsert(TNotice30 entity, PreInsertContext<TNotice30> context) {
    }

    @Override
    public void preUpdate(TNotice30 entity, PreUpdateContext<TNotice30> context) {
    }

    @Override
    public void preDelete(TNotice30 entity, PreDeleteContext<TNotice30> context) {
    }

    @Override
    public void postInsert(TNotice30 entity, PostInsertContext<TNotice30> context) {
    }

    @Override
    public void postUpdate(TNotice30 entity, PostUpdateContext<TNotice30> context) {
    }

    @Override
    public void postDelete(TNotice30 entity, PostDeleteContext<TNotice30> context) {
    }
}
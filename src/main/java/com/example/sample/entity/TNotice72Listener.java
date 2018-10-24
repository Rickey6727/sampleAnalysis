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
public class TNotice72Listener implements EntityListener<TNotice72> {

    @Override
    public void preInsert(TNotice72 entity, PreInsertContext<TNotice72> context) {
    }

    @Override
    public void preUpdate(TNotice72 entity, PreUpdateContext<TNotice72> context) {
    }

    @Override
    public void preDelete(TNotice72 entity, PreDeleteContext<TNotice72> context) {
    }

    @Override
    public void postInsert(TNotice72 entity, PostInsertContext<TNotice72> context) {
    }

    @Override
    public void postUpdate(TNotice72 entity, PostUpdateContext<TNotice72> context) {
    }

    @Override
    public void postDelete(TNotice72 entity, PostDeleteContext<TNotice72> context) {
    }
}
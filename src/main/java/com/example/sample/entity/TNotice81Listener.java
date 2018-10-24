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
public class TNotice81Listener implements EntityListener<TNotice81> {

    @Override
    public void preInsert(TNotice81 entity, PreInsertContext<TNotice81> context) {
    }

    @Override
    public void preUpdate(TNotice81 entity, PreUpdateContext<TNotice81> context) {
    }

    @Override
    public void preDelete(TNotice81 entity, PreDeleteContext<TNotice81> context) {
    }

    @Override
    public void postInsert(TNotice81 entity, PostInsertContext<TNotice81> context) {
    }

    @Override
    public void postUpdate(TNotice81 entity, PostUpdateContext<TNotice81> context) {
    }

    @Override
    public void postDelete(TNotice81 entity, PostDeleteContext<TNotice81> context) {
    }
}
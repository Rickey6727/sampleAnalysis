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
public class TNotice8Listener implements EntityListener<TNotice8> {

    @Override
    public void preInsert(TNotice8 entity, PreInsertContext<TNotice8> context) {
    }

    @Override
    public void preUpdate(TNotice8 entity, PreUpdateContext<TNotice8> context) {
    }

    @Override
    public void preDelete(TNotice8 entity, PreDeleteContext<TNotice8> context) {
    }

    @Override
    public void postInsert(TNotice8 entity, PostInsertContext<TNotice8> context) {
    }

    @Override
    public void postUpdate(TNotice8 entity, PostUpdateContext<TNotice8> context) {
    }

    @Override
    public void postDelete(TNotice8 entity, PostDeleteContext<TNotice8> context) {
    }
}
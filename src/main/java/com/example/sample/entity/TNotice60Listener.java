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
public class TNotice60Listener implements EntityListener<TNotice60> {

    @Override
    public void preInsert(TNotice60 entity, PreInsertContext<TNotice60> context) {
    }

    @Override
    public void preUpdate(TNotice60 entity, PreUpdateContext<TNotice60> context) {
    }

    @Override
    public void preDelete(TNotice60 entity, PreDeleteContext<TNotice60> context) {
    }

    @Override
    public void postInsert(TNotice60 entity, PostInsertContext<TNotice60> context) {
    }

    @Override
    public void postUpdate(TNotice60 entity, PostUpdateContext<TNotice60> context) {
    }

    @Override
    public void postDelete(TNotice60 entity, PostDeleteContext<TNotice60> context) {
    }
}
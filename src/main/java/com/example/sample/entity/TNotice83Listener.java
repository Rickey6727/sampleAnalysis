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
public class TNotice83Listener implements EntityListener<TNotice83> {

    @Override
    public void preInsert(TNotice83 entity, PreInsertContext<TNotice83> context) {
    }

    @Override
    public void preUpdate(TNotice83 entity, PreUpdateContext<TNotice83> context) {
    }

    @Override
    public void preDelete(TNotice83 entity, PreDeleteContext<TNotice83> context) {
    }

    @Override
    public void postInsert(TNotice83 entity, PostInsertContext<TNotice83> context) {
    }

    @Override
    public void postUpdate(TNotice83 entity, PostUpdateContext<TNotice83> context) {
    }

    @Override
    public void postDelete(TNotice83 entity, PostDeleteContext<TNotice83> context) {
    }
}
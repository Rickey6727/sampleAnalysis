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
public class TNotice19Listener implements EntityListener<TNotice19> {

    @Override
    public void preInsert(TNotice19 entity, PreInsertContext<TNotice19> context) {
    }

    @Override
    public void preUpdate(TNotice19 entity, PreUpdateContext<TNotice19> context) {
    }

    @Override
    public void preDelete(TNotice19 entity, PreDeleteContext<TNotice19> context) {
    }

    @Override
    public void postInsert(TNotice19 entity, PostInsertContext<TNotice19> context) {
    }

    @Override
    public void postUpdate(TNotice19 entity, PostUpdateContext<TNotice19> context) {
    }

    @Override
    public void postDelete(TNotice19 entity, PostDeleteContext<TNotice19> context) {
    }
}
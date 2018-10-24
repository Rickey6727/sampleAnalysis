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
public class TNotice5Listener implements EntityListener<TNotice5> {

    @Override
    public void preInsert(TNotice5 entity, PreInsertContext<TNotice5> context) {
    }

    @Override
    public void preUpdate(TNotice5 entity, PreUpdateContext<TNotice5> context) {
    }

    @Override
    public void preDelete(TNotice5 entity, PreDeleteContext<TNotice5> context) {
    }

    @Override
    public void postInsert(TNotice5 entity, PostInsertContext<TNotice5> context) {
    }

    @Override
    public void postUpdate(TNotice5 entity, PostUpdateContext<TNotice5> context) {
    }

    @Override
    public void postDelete(TNotice5 entity, PostDeleteContext<TNotice5> context) {
    }
}
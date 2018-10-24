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
public class TNotice4Listener implements EntityListener<TNotice4> {

    @Override
    public void preInsert(TNotice4 entity, PreInsertContext<TNotice4> context) {
    }

    @Override
    public void preUpdate(TNotice4 entity, PreUpdateContext<TNotice4> context) {
    }

    @Override
    public void preDelete(TNotice4 entity, PreDeleteContext<TNotice4> context) {
    }

    @Override
    public void postInsert(TNotice4 entity, PostInsertContext<TNotice4> context) {
    }

    @Override
    public void postUpdate(TNotice4 entity, PostUpdateContext<TNotice4> context) {
    }

    @Override
    public void postDelete(TNotice4 entity, PostDeleteContext<TNotice4> context) {
    }
}
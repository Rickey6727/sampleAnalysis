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
public class TNotice85Listener implements EntityListener<TNotice85> {

    @Override
    public void preInsert(TNotice85 entity, PreInsertContext<TNotice85> context) {
    }

    @Override
    public void preUpdate(TNotice85 entity, PreUpdateContext<TNotice85> context) {
    }

    @Override
    public void preDelete(TNotice85 entity, PreDeleteContext<TNotice85> context) {
    }

    @Override
    public void postInsert(TNotice85 entity, PostInsertContext<TNotice85> context) {
    }

    @Override
    public void postUpdate(TNotice85 entity, PostUpdateContext<TNotice85> context) {
    }

    @Override
    public void postDelete(TNotice85 entity, PostDeleteContext<TNotice85> context) {
    }
}
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
public class TNotice99Listener implements EntityListener<TNotice99> {

    @Override
    public void preInsert(TNotice99 entity, PreInsertContext<TNotice99> context) {
    }

    @Override
    public void preUpdate(TNotice99 entity, PreUpdateContext<TNotice99> context) {
    }

    @Override
    public void preDelete(TNotice99 entity, PreDeleteContext<TNotice99> context) {
    }

    @Override
    public void postInsert(TNotice99 entity, PostInsertContext<TNotice99> context) {
    }

    @Override
    public void postUpdate(TNotice99 entity, PostUpdateContext<TNotice99> context) {
    }

    @Override
    public void postDelete(TNotice99 entity, PostDeleteContext<TNotice99> context) {
    }
}
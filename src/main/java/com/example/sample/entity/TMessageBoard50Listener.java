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
public class TMessageBoard50Listener implements EntityListener<TMessageBoard50> {

    @Override
    public void preInsert(TMessageBoard50 entity, PreInsertContext<TMessageBoard50> context) {
    }

    @Override
    public void preUpdate(TMessageBoard50 entity, PreUpdateContext<TMessageBoard50> context) {
    }

    @Override
    public void preDelete(TMessageBoard50 entity, PreDeleteContext<TMessageBoard50> context) {
    }

    @Override
    public void postInsert(TMessageBoard50 entity, PostInsertContext<TMessageBoard50> context) {
    }

    @Override
    public void postUpdate(TMessageBoard50 entity, PostUpdateContext<TMessageBoard50> context) {
    }

    @Override
    public void postDelete(TMessageBoard50 entity, PostDeleteContext<TMessageBoard50> context) {
    }
}
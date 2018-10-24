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
public class TMessageBoard83Listener implements EntityListener<TMessageBoard83> {

    @Override
    public void preInsert(TMessageBoard83 entity, PreInsertContext<TMessageBoard83> context) {
    }

    @Override
    public void preUpdate(TMessageBoard83 entity, PreUpdateContext<TMessageBoard83> context) {
    }

    @Override
    public void preDelete(TMessageBoard83 entity, PreDeleteContext<TMessageBoard83> context) {
    }

    @Override
    public void postInsert(TMessageBoard83 entity, PostInsertContext<TMessageBoard83> context) {
    }

    @Override
    public void postUpdate(TMessageBoard83 entity, PostUpdateContext<TMessageBoard83> context) {
    }

    @Override
    public void postDelete(TMessageBoard83 entity, PostDeleteContext<TMessageBoard83> context) {
    }
}
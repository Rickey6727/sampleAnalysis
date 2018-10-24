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
public class TMessageBoard6Listener implements EntityListener<TMessageBoard6> {

    @Override
    public void preInsert(TMessageBoard6 entity, PreInsertContext<TMessageBoard6> context) {
    }

    @Override
    public void preUpdate(TMessageBoard6 entity, PreUpdateContext<TMessageBoard6> context) {
    }

    @Override
    public void preDelete(TMessageBoard6 entity, PreDeleteContext<TMessageBoard6> context) {
    }

    @Override
    public void postInsert(TMessageBoard6 entity, PostInsertContext<TMessageBoard6> context) {
    }

    @Override
    public void postUpdate(TMessageBoard6 entity, PostUpdateContext<TMessageBoard6> context) {
    }

    @Override
    public void postDelete(TMessageBoard6 entity, PostDeleteContext<TMessageBoard6> context) {
    }
}
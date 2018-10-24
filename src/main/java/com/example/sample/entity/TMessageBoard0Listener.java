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
public class TMessageBoard0Listener implements EntityListener<TMessageBoard0> {

    @Override
    public void preInsert(TMessageBoard0 entity, PreInsertContext<TMessageBoard0> context) {
    }

    @Override
    public void preUpdate(TMessageBoard0 entity, PreUpdateContext<TMessageBoard0> context) {
    }

    @Override
    public void preDelete(TMessageBoard0 entity, PreDeleteContext<TMessageBoard0> context) {
    }

    @Override
    public void postInsert(TMessageBoard0 entity, PostInsertContext<TMessageBoard0> context) {
    }

    @Override
    public void postUpdate(TMessageBoard0 entity, PostUpdateContext<TMessageBoard0> context) {
    }

    @Override
    public void postDelete(TMessageBoard0 entity, PostDeleteContext<TMessageBoard0> context) {
    }
}
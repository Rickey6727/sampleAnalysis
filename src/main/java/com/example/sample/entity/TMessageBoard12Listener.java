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
public class TMessageBoard12Listener implements EntityListener<TMessageBoard12> {

    @Override
    public void preInsert(TMessageBoard12 entity, PreInsertContext<TMessageBoard12> context) {
    }

    @Override
    public void preUpdate(TMessageBoard12 entity, PreUpdateContext<TMessageBoard12> context) {
    }

    @Override
    public void preDelete(TMessageBoard12 entity, PreDeleteContext<TMessageBoard12> context) {
    }

    @Override
    public void postInsert(TMessageBoard12 entity, PostInsertContext<TMessageBoard12> context) {
    }

    @Override
    public void postUpdate(TMessageBoard12 entity, PostUpdateContext<TMessageBoard12> context) {
    }

    @Override
    public void postDelete(TMessageBoard12 entity, PostDeleteContext<TMessageBoard12> context) {
    }
}
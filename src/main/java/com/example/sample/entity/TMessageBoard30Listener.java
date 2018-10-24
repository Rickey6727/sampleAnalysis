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
public class TMessageBoard30Listener implements EntityListener<TMessageBoard30> {

    @Override
    public void preInsert(TMessageBoard30 entity, PreInsertContext<TMessageBoard30> context) {
    }

    @Override
    public void preUpdate(TMessageBoard30 entity, PreUpdateContext<TMessageBoard30> context) {
    }

    @Override
    public void preDelete(TMessageBoard30 entity, PreDeleteContext<TMessageBoard30> context) {
    }

    @Override
    public void postInsert(TMessageBoard30 entity, PostInsertContext<TMessageBoard30> context) {
    }

    @Override
    public void postUpdate(TMessageBoard30 entity, PostUpdateContext<TMessageBoard30> context) {
    }

    @Override
    public void postDelete(TMessageBoard30 entity, PostDeleteContext<TMessageBoard30> context) {
    }
}
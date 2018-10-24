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
public class TMessageBoard90Listener implements EntityListener<TMessageBoard90> {

    @Override
    public void preInsert(TMessageBoard90 entity, PreInsertContext<TMessageBoard90> context) {
    }

    @Override
    public void preUpdate(TMessageBoard90 entity, PreUpdateContext<TMessageBoard90> context) {
    }

    @Override
    public void preDelete(TMessageBoard90 entity, PreDeleteContext<TMessageBoard90> context) {
    }

    @Override
    public void postInsert(TMessageBoard90 entity, PostInsertContext<TMessageBoard90> context) {
    }

    @Override
    public void postUpdate(TMessageBoard90 entity, PostUpdateContext<TMessageBoard90> context) {
    }

    @Override
    public void postDelete(TMessageBoard90 entity, PostDeleteContext<TMessageBoard90> context) {
    }
}
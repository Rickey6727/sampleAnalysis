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
public class TMessageBoard15Listener implements EntityListener<TMessageBoard15> {

    @Override
    public void preInsert(TMessageBoard15 entity, PreInsertContext<TMessageBoard15> context) {
    }

    @Override
    public void preUpdate(TMessageBoard15 entity, PreUpdateContext<TMessageBoard15> context) {
    }

    @Override
    public void preDelete(TMessageBoard15 entity, PreDeleteContext<TMessageBoard15> context) {
    }

    @Override
    public void postInsert(TMessageBoard15 entity, PostInsertContext<TMessageBoard15> context) {
    }

    @Override
    public void postUpdate(TMessageBoard15 entity, PostUpdateContext<TMessageBoard15> context) {
    }

    @Override
    public void postDelete(TMessageBoard15 entity, PostDeleteContext<TMessageBoard15> context) {
    }
}
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
public class TMessageBoard70Listener implements EntityListener<TMessageBoard70> {

    @Override
    public void preInsert(TMessageBoard70 entity, PreInsertContext<TMessageBoard70> context) {
    }

    @Override
    public void preUpdate(TMessageBoard70 entity, PreUpdateContext<TMessageBoard70> context) {
    }

    @Override
    public void preDelete(TMessageBoard70 entity, PreDeleteContext<TMessageBoard70> context) {
    }

    @Override
    public void postInsert(TMessageBoard70 entity, PostInsertContext<TMessageBoard70> context) {
    }

    @Override
    public void postUpdate(TMessageBoard70 entity, PostUpdateContext<TMessageBoard70> context) {
    }

    @Override
    public void postDelete(TMessageBoard70 entity, PostDeleteContext<TMessageBoard70> context) {
    }
}
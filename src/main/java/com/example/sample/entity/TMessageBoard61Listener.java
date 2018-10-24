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
public class TMessageBoard61Listener implements EntityListener<TMessageBoard61> {

    @Override
    public void preInsert(TMessageBoard61 entity, PreInsertContext<TMessageBoard61> context) {
    }

    @Override
    public void preUpdate(TMessageBoard61 entity, PreUpdateContext<TMessageBoard61> context) {
    }

    @Override
    public void preDelete(TMessageBoard61 entity, PreDeleteContext<TMessageBoard61> context) {
    }

    @Override
    public void postInsert(TMessageBoard61 entity, PostInsertContext<TMessageBoard61> context) {
    }

    @Override
    public void postUpdate(TMessageBoard61 entity, PostUpdateContext<TMessageBoard61> context) {
    }

    @Override
    public void postDelete(TMessageBoard61 entity, PostDeleteContext<TMessageBoard61> context) {
    }
}
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
public class TMessageBoard31Listener implements EntityListener<TMessageBoard31> {

    @Override
    public void preInsert(TMessageBoard31 entity, PreInsertContext<TMessageBoard31> context) {
    }

    @Override
    public void preUpdate(TMessageBoard31 entity, PreUpdateContext<TMessageBoard31> context) {
    }

    @Override
    public void preDelete(TMessageBoard31 entity, PreDeleteContext<TMessageBoard31> context) {
    }

    @Override
    public void postInsert(TMessageBoard31 entity, PostInsertContext<TMessageBoard31> context) {
    }

    @Override
    public void postUpdate(TMessageBoard31 entity, PostUpdateContext<TMessageBoard31> context) {
    }

    @Override
    public void postDelete(TMessageBoard31 entity, PostDeleteContext<TMessageBoard31> context) {
    }
}
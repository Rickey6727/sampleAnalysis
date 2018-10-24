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
public class TMessageBoard99Listener implements EntityListener<TMessageBoard99> {

    @Override
    public void preInsert(TMessageBoard99 entity, PreInsertContext<TMessageBoard99> context) {
    }

    @Override
    public void preUpdate(TMessageBoard99 entity, PreUpdateContext<TMessageBoard99> context) {
    }

    @Override
    public void preDelete(TMessageBoard99 entity, PreDeleteContext<TMessageBoard99> context) {
    }

    @Override
    public void postInsert(TMessageBoard99 entity, PostInsertContext<TMessageBoard99> context) {
    }

    @Override
    public void postUpdate(TMessageBoard99 entity, PostUpdateContext<TMessageBoard99> context) {
    }

    @Override
    public void postDelete(TMessageBoard99 entity, PostDeleteContext<TMessageBoard99> context) {
    }
}
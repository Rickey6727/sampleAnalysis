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
public class TMessageBoard8Listener implements EntityListener<TMessageBoard8> {

    @Override
    public void preInsert(TMessageBoard8 entity, PreInsertContext<TMessageBoard8> context) {
    }

    @Override
    public void preUpdate(TMessageBoard8 entity, PreUpdateContext<TMessageBoard8> context) {
    }

    @Override
    public void preDelete(TMessageBoard8 entity, PreDeleteContext<TMessageBoard8> context) {
    }

    @Override
    public void postInsert(TMessageBoard8 entity, PostInsertContext<TMessageBoard8> context) {
    }

    @Override
    public void postUpdate(TMessageBoard8 entity, PostUpdateContext<TMessageBoard8> context) {
    }

    @Override
    public void postDelete(TMessageBoard8 entity, PostDeleteContext<TMessageBoard8> context) {
    }
}
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
public class TMessageBoard64Listener implements EntityListener<TMessageBoard64> {

    @Override
    public void preInsert(TMessageBoard64 entity, PreInsertContext<TMessageBoard64> context) {
    }

    @Override
    public void preUpdate(TMessageBoard64 entity, PreUpdateContext<TMessageBoard64> context) {
    }

    @Override
    public void preDelete(TMessageBoard64 entity, PreDeleteContext<TMessageBoard64> context) {
    }

    @Override
    public void postInsert(TMessageBoard64 entity, PostInsertContext<TMessageBoard64> context) {
    }

    @Override
    public void postUpdate(TMessageBoard64 entity, PostUpdateContext<TMessageBoard64> context) {
    }

    @Override
    public void postDelete(TMessageBoard64 entity, PostDeleteContext<TMessageBoard64> context) {
    }
}
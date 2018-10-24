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
public class TMessageBoard82Listener implements EntityListener<TMessageBoard82> {

    @Override
    public void preInsert(TMessageBoard82 entity, PreInsertContext<TMessageBoard82> context) {
    }

    @Override
    public void preUpdate(TMessageBoard82 entity, PreUpdateContext<TMessageBoard82> context) {
    }

    @Override
    public void preDelete(TMessageBoard82 entity, PreDeleteContext<TMessageBoard82> context) {
    }

    @Override
    public void postInsert(TMessageBoard82 entity, PostInsertContext<TMessageBoard82> context) {
    }

    @Override
    public void postUpdate(TMessageBoard82 entity, PostUpdateContext<TMessageBoard82> context) {
    }

    @Override
    public void postDelete(TMessageBoard82 entity, PostDeleteContext<TMessageBoard82> context) {
    }
}
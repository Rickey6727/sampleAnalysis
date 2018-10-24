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
public class TMessageBoard24Listener implements EntityListener<TMessageBoard24> {

    @Override
    public void preInsert(TMessageBoard24 entity, PreInsertContext<TMessageBoard24> context) {
    }

    @Override
    public void preUpdate(TMessageBoard24 entity, PreUpdateContext<TMessageBoard24> context) {
    }

    @Override
    public void preDelete(TMessageBoard24 entity, PreDeleteContext<TMessageBoard24> context) {
    }

    @Override
    public void postInsert(TMessageBoard24 entity, PostInsertContext<TMessageBoard24> context) {
    }

    @Override
    public void postUpdate(TMessageBoard24 entity, PostUpdateContext<TMessageBoard24> context) {
    }

    @Override
    public void postDelete(TMessageBoard24 entity, PostDeleteContext<TMessageBoard24> context) {
    }
}
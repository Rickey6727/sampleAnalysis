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
public class TMessageBoard92Listener implements EntityListener<TMessageBoard92> {

    @Override
    public void preInsert(TMessageBoard92 entity, PreInsertContext<TMessageBoard92> context) {
    }

    @Override
    public void preUpdate(TMessageBoard92 entity, PreUpdateContext<TMessageBoard92> context) {
    }

    @Override
    public void preDelete(TMessageBoard92 entity, PreDeleteContext<TMessageBoard92> context) {
    }

    @Override
    public void postInsert(TMessageBoard92 entity, PostInsertContext<TMessageBoard92> context) {
    }

    @Override
    public void postUpdate(TMessageBoard92 entity, PostUpdateContext<TMessageBoard92> context) {
    }

    @Override
    public void postDelete(TMessageBoard92 entity, PostDeleteContext<TMessageBoard92> context) {
    }
}
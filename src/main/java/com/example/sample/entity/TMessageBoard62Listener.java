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
public class TMessageBoard62Listener implements EntityListener<TMessageBoard62> {

    @Override
    public void preInsert(TMessageBoard62 entity, PreInsertContext<TMessageBoard62> context) {
    }

    @Override
    public void preUpdate(TMessageBoard62 entity, PreUpdateContext<TMessageBoard62> context) {
    }

    @Override
    public void preDelete(TMessageBoard62 entity, PreDeleteContext<TMessageBoard62> context) {
    }

    @Override
    public void postInsert(TMessageBoard62 entity, PostInsertContext<TMessageBoard62> context) {
    }

    @Override
    public void postUpdate(TMessageBoard62 entity, PostUpdateContext<TMessageBoard62> context) {
    }

    @Override
    public void postDelete(TMessageBoard62 entity, PostDeleteContext<TMessageBoard62> context) {
    }
}
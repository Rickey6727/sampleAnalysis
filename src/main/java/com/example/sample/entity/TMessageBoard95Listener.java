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
public class TMessageBoard95Listener implements EntityListener<TMessageBoard95> {

    @Override
    public void preInsert(TMessageBoard95 entity, PreInsertContext<TMessageBoard95> context) {
    }

    @Override
    public void preUpdate(TMessageBoard95 entity, PreUpdateContext<TMessageBoard95> context) {
    }

    @Override
    public void preDelete(TMessageBoard95 entity, PreDeleteContext<TMessageBoard95> context) {
    }

    @Override
    public void postInsert(TMessageBoard95 entity, PostInsertContext<TMessageBoard95> context) {
    }

    @Override
    public void postUpdate(TMessageBoard95 entity, PostUpdateContext<TMessageBoard95> context) {
    }

    @Override
    public void postDelete(TMessageBoard95 entity, PostDeleteContext<TMessageBoard95> context) {
    }
}
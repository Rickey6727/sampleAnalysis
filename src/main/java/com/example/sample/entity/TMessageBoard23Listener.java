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
public class TMessageBoard23Listener implements EntityListener<TMessageBoard23> {

    @Override
    public void preInsert(TMessageBoard23 entity, PreInsertContext<TMessageBoard23> context) {
    }

    @Override
    public void preUpdate(TMessageBoard23 entity, PreUpdateContext<TMessageBoard23> context) {
    }

    @Override
    public void preDelete(TMessageBoard23 entity, PreDeleteContext<TMessageBoard23> context) {
    }

    @Override
    public void postInsert(TMessageBoard23 entity, PostInsertContext<TMessageBoard23> context) {
    }

    @Override
    public void postUpdate(TMessageBoard23 entity, PostUpdateContext<TMessageBoard23> context) {
    }

    @Override
    public void postDelete(TMessageBoard23 entity, PostDeleteContext<TMessageBoard23> context) {
    }
}
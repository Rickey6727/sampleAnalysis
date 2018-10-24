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
public class TMessageBoard28Listener implements EntityListener<TMessageBoard28> {

    @Override
    public void preInsert(TMessageBoard28 entity, PreInsertContext<TMessageBoard28> context) {
    }

    @Override
    public void preUpdate(TMessageBoard28 entity, PreUpdateContext<TMessageBoard28> context) {
    }

    @Override
    public void preDelete(TMessageBoard28 entity, PreDeleteContext<TMessageBoard28> context) {
    }

    @Override
    public void postInsert(TMessageBoard28 entity, PostInsertContext<TMessageBoard28> context) {
    }

    @Override
    public void postUpdate(TMessageBoard28 entity, PostUpdateContext<TMessageBoard28> context) {
    }

    @Override
    public void postDelete(TMessageBoard28 entity, PostDeleteContext<TMessageBoard28> context) {
    }
}
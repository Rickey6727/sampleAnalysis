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
public class TMessageBoard40Listener implements EntityListener<TMessageBoard40> {

    @Override
    public void preInsert(TMessageBoard40 entity, PreInsertContext<TMessageBoard40> context) {
    }

    @Override
    public void preUpdate(TMessageBoard40 entity, PreUpdateContext<TMessageBoard40> context) {
    }

    @Override
    public void preDelete(TMessageBoard40 entity, PreDeleteContext<TMessageBoard40> context) {
    }

    @Override
    public void postInsert(TMessageBoard40 entity, PostInsertContext<TMessageBoard40> context) {
    }

    @Override
    public void postUpdate(TMessageBoard40 entity, PostUpdateContext<TMessageBoard40> context) {
    }

    @Override
    public void postDelete(TMessageBoard40 entity, PostDeleteContext<TMessageBoard40> context) {
    }
}
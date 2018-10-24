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
public class TMessageBoard81Listener implements EntityListener<TMessageBoard81> {

    @Override
    public void preInsert(TMessageBoard81 entity, PreInsertContext<TMessageBoard81> context) {
    }

    @Override
    public void preUpdate(TMessageBoard81 entity, PreUpdateContext<TMessageBoard81> context) {
    }

    @Override
    public void preDelete(TMessageBoard81 entity, PreDeleteContext<TMessageBoard81> context) {
    }

    @Override
    public void postInsert(TMessageBoard81 entity, PostInsertContext<TMessageBoard81> context) {
    }

    @Override
    public void postUpdate(TMessageBoard81 entity, PostUpdateContext<TMessageBoard81> context) {
    }

    @Override
    public void postDelete(TMessageBoard81 entity, PostDeleteContext<TMessageBoard81> context) {
    }
}
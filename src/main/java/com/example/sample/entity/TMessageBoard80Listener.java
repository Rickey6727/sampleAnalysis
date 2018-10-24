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
public class TMessageBoard80Listener implements EntityListener<TMessageBoard80> {

    @Override
    public void preInsert(TMessageBoard80 entity, PreInsertContext<TMessageBoard80> context) {
    }

    @Override
    public void preUpdate(TMessageBoard80 entity, PreUpdateContext<TMessageBoard80> context) {
    }

    @Override
    public void preDelete(TMessageBoard80 entity, PreDeleteContext<TMessageBoard80> context) {
    }

    @Override
    public void postInsert(TMessageBoard80 entity, PostInsertContext<TMessageBoard80> context) {
    }

    @Override
    public void postUpdate(TMessageBoard80 entity, PostUpdateContext<TMessageBoard80> context) {
    }

    @Override
    public void postDelete(TMessageBoard80 entity, PostDeleteContext<TMessageBoard80> context) {
    }
}
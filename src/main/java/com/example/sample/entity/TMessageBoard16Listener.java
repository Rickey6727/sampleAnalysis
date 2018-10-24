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
public class TMessageBoard16Listener implements EntityListener<TMessageBoard16> {

    @Override
    public void preInsert(TMessageBoard16 entity, PreInsertContext<TMessageBoard16> context) {
    }

    @Override
    public void preUpdate(TMessageBoard16 entity, PreUpdateContext<TMessageBoard16> context) {
    }

    @Override
    public void preDelete(TMessageBoard16 entity, PreDeleteContext<TMessageBoard16> context) {
    }

    @Override
    public void postInsert(TMessageBoard16 entity, PostInsertContext<TMessageBoard16> context) {
    }

    @Override
    public void postUpdate(TMessageBoard16 entity, PostUpdateContext<TMessageBoard16> context) {
    }

    @Override
    public void postDelete(TMessageBoard16 entity, PostDeleteContext<TMessageBoard16> context) {
    }
}
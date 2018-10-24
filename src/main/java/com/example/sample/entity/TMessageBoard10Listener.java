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
public class TMessageBoard10Listener implements EntityListener<TMessageBoard10> {

    @Override
    public void preInsert(TMessageBoard10 entity, PreInsertContext<TMessageBoard10> context) {
    }

    @Override
    public void preUpdate(TMessageBoard10 entity, PreUpdateContext<TMessageBoard10> context) {
    }

    @Override
    public void preDelete(TMessageBoard10 entity, PreDeleteContext<TMessageBoard10> context) {
    }

    @Override
    public void postInsert(TMessageBoard10 entity, PostInsertContext<TMessageBoard10> context) {
    }

    @Override
    public void postUpdate(TMessageBoard10 entity, PostUpdateContext<TMessageBoard10> context) {
    }

    @Override
    public void postDelete(TMessageBoard10 entity, PostDeleteContext<TMessageBoard10> context) {
    }
}
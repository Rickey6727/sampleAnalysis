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
public class TMessageBoard19Listener implements EntityListener<TMessageBoard19> {

    @Override
    public void preInsert(TMessageBoard19 entity, PreInsertContext<TMessageBoard19> context) {
    }

    @Override
    public void preUpdate(TMessageBoard19 entity, PreUpdateContext<TMessageBoard19> context) {
    }

    @Override
    public void preDelete(TMessageBoard19 entity, PreDeleteContext<TMessageBoard19> context) {
    }

    @Override
    public void postInsert(TMessageBoard19 entity, PostInsertContext<TMessageBoard19> context) {
    }

    @Override
    public void postUpdate(TMessageBoard19 entity, PostUpdateContext<TMessageBoard19> context) {
    }

    @Override
    public void postDelete(TMessageBoard19 entity, PostDeleteContext<TMessageBoard19> context) {
    }
}
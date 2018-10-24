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
public class TNotice96Listener implements EntityListener<TNotice96> {

    @Override
    public void preInsert(TNotice96 entity, PreInsertContext<TNotice96> context) {
    }

    @Override
    public void preUpdate(TNotice96 entity, PreUpdateContext<TNotice96> context) {
    }

    @Override
    public void preDelete(TNotice96 entity, PreDeleteContext<TNotice96> context) {
    }

    @Override
    public void postInsert(TNotice96 entity, PostInsertContext<TNotice96> context) {
    }

    @Override
    public void postUpdate(TNotice96 entity, PostUpdateContext<TNotice96> context) {
    }

    @Override
    public void postDelete(TNotice96 entity, PostDeleteContext<TNotice96> context) {
    }
}
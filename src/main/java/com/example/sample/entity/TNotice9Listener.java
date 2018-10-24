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
public class TNotice9Listener implements EntityListener<TNotice9> {

    @Override
    public void preInsert(TNotice9 entity, PreInsertContext<TNotice9> context) {
    }

    @Override
    public void preUpdate(TNotice9 entity, PreUpdateContext<TNotice9> context) {
    }

    @Override
    public void preDelete(TNotice9 entity, PreDeleteContext<TNotice9> context) {
    }

    @Override
    public void postInsert(TNotice9 entity, PostInsertContext<TNotice9> context) {
    }

    @Override
    public void postUpdate(TNotice9 entity, PostUpdateContext<TNotice9> context) {
    }

    @Override
    public void postDelete(TNotice9 entity, PostDeleteContext<TNotice9> context) {
    }
}
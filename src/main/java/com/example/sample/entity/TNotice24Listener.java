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
public class TNotice24Listener implements EntityListener<TNotice24> {

    @Override
    public void preInsert(TNotice24 entity, PreInsertContext<TNotice24> context) {
    }

    @Override
    public void preUpdate(TNotice24 entity, PreUpdateContext<TNotice24> context) {
    }

    @Override
    public void preDelete(TNotice24 entity, PreDeleteContext<TNotice24> context) {
    }

    @Override
    public void postInsert(TNotice24 entity, PostInsertContext<TNotice24> context) {
    }

    @Override
    public void postUpdate(TNotice24 entity, PostUpdateContext<TNotice24> context) {
    }

    @Override
    public void postDelete(TNotice24 entity, PostDeleteContext<TNotice24> context) {
    }
}
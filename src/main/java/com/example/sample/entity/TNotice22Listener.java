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
public class TNotice22Listener implements EntityListener<TNotice22> {

    @Override
    public void preInsert(TNotice22 entity, PreInsertContext<TNotice22> context) {
    }

    @Override
    public void preUpdate(TNotice22 entity, PreUpdateContext<TNotice22> context) {
    }

    @Override
    public void preDelete(TNotice22 entity, PreDeleteContext<TNotice22> context) {
    }

    @Override
    public void postInsert(TNotice22 entity, PostInsertContext<TNotice22> context) {
    }

    @Override
    public void postUpdate(TNotice22 entity, PostUpdateContext<TNotice22> context) {
    }

    @Override
    public void postDelete(TNotice22 entity, PostDeleteContext<TNotice22> context) {
    }
}
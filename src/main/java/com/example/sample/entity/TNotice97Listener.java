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
public class TNotice97Listener implements EntityListener<TNotice97> {

    @Override
    public void preInsert(TNotice97 entity, PreInsertContext<TNotice97> context) {
    }

    @Override
    public void preUpdate(TNotice97 entity, PreUpdateContext<TNotice97> context) {
    }

    @Override
    public void preDelete(TNotice97 entity, PreDeleteContext<TNotice97> context) {
    }

    @Override
    public void postInsert(TNotice97 entity, PostInsertContext<TNotice97> context) {
    }

    @Override
    public void postUpdate(TNotice97 entity, PostUpdateContext<TNotice97> context) {
    }

    @Override
    public void postDelete(TNotice97 entity, PostDeleteContext<TNotice97> context) {
    }
}
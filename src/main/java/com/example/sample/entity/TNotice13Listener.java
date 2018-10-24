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
public class TNotice13Listener implements EntityListener<TNotice13> {

    @Override
    public void preInsert(TNotice13 entity, PreInsertContext<TNotice13> context) {
    }

    @Override
    public void preUpdate(TNotice13 entity, PreUpdateContext<TNotice13> context) {
    }

    @Override
    public void preDelete(TNotice13 entity, PreDeleteContext<TNotice13> context) {
    }

    @Override
    public void postInsert(TNotice13 entity, PostInsertContext<TNotice13> context) {
    }

    @Override
    public void postUpdate(TNotice13 entity, PostUpdateContext<TNotice13> context) {
    }

    @Override
    public void postDelete(TNotice13 entity, PostDeleteContext<TNotice13> context) {
    }
}
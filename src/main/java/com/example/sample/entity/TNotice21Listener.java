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
public class TNotice21Listener implements EntityListener<TNotice21> {

    @Override
    public void preInsert(TNotice21 entity, PreInsertContext<TNotice21> context) {
    }

    @Override
    public void preUpdate(TNotice21 entity, PreUpdateContext<TNotice21> context) {
    }

    @Override
    public void preDelete(TNotice21 entity, PreDeleteContext<TNotice21> context) {
    }

    @Override
    public void postInsert(TNotice21 entity, PostInsertContext<TNotice21> context) {
    }

    @Override
    public void postUpdate(TNotice21 entity, PostUpdateContext<TNotice21> context) {
    }

    @Override
    public void postDelete(TNotice21 entity, PostDeleteContext<TNotice21> context) {
    }
}
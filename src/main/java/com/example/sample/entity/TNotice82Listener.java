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
public class TNotice82Listener implements EntityListener<TNotice82> {

    @Override
    public void preInsert(TNotice82 entity, PreInsertContext<TNotice82> context) {
    }

    @Override
    public void preUpdate(TNotice82 entity, PreUpdateContext<TNotice82> context) {
    }

    @Override
    public void preDelete(TNotice82 entity, PreDeleteContext<TNotice82> context) {
    }

    @Override
    public void postInsert(TNotice82 entity, PostInsertContext<TNotice82> context) {
    }

    @Override
    public void postUpdate(TNotice82 entity, PostUpdateContext<TNotice82> context) {
    }

    @Override
    public void postDelete(TNotice82 entity, PostDeleteContext<TNotice82> context) {
    }
}
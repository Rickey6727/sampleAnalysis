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
public class TNotice91Listener implements EntityListener<TNotice91> {

    @Override
    public void preInsert(TNotice91 entity, PreInsertContext<TNotice91> context) {
    }

    @Override
    public void preUpdate(TNotice91 entity, PreUpdateContext<TNotice91> context) {
    }

    @Override
    public void preDelete(TNotice91 entity, PreDeleteContext<TNotice91> context) {
    }

    @Override
    public void postInsert(TNotice91 entity, PostInsertContext<TNotice91> context) {
    }

    @Override
    public void postUpdate(TNotice91 entity, PostUpdateContext<TNotice91> context) {
    }

    @Override
    public void postDelete(TNotice91 entity, PostDeleteContext<TNotice91> context) {
    }
}
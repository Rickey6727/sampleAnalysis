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
public class TNotice80Listener implements EntityListener<TNotice80> {

    @Override
    public void preInsert(TNotice80 entity, PreInsertContext<TNotice80> context) {
    }

    @Override
    public void preUpdate(TNotice80 entity, PreUpdateContext<TNotice80> context) {
    }

    @Override
    public void preDelete(TNotice80 entity, PreDeleteContext<TNotice80> context) {
    }

    @Override
    public void postInsert(TNotice80 entity, PostInsertContext<TNotice80> context) {
    }

    @Override
    public void postUpdate(TNotice80 entity, PostUpdateContext<TNotice80> context) {
    }

    @Override
    public void postDelete(TNotice80 entity, PostDeleteContext<TNotice80> context) {
    }
}
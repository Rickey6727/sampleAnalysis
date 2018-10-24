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
public class TNotice23Listener implements EntityListener<TNotice23> {

    @Override
    public void preInsert(TNotice23 entity, PreInsertContext<TNotice23> context) {
    }

    @Override
    public void preUpdate(TNotice23 entity, PreUpdateContext<TNotice23> context) {
    }

    @Override
    public void preDelete(TNotice23 entity, PreDeleteContext<TNotice23> context) {
    }

    @Override
    public void postInsert(TNotice23 entity, PostInsertContext<TNotice23> context) {
    }

    @Override
    public void postUpdate(TNotice23 entity, PostUpdateContext<TNotice23> context) {
    }

    @Override
    public void postDelete(TNotice23 entity, PostDeleteContext<TNotice23> context) {
    }
}
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
public class TNotice6Listener implements EntityListener<TNotice6> {

    @Override
    public void preInsert(TNotice6 entity, PreInsertContext<TNotice6> context) {
    }

    @Override
    public void preUpdate(TNotice6 entity, PreUpdateContext<TNotice6> context) {
    }

    @Override
    public void preDelete(TNotice6 entity, PreDeleteContext<TNotice6> context) {
    }

    @Override
    public void postInsert(TNotice6 entity, PostInsertContext<TNotice6> context) {
    }

    @Override
    public void postUpdate(TNotice6 entity, PostUpdateContext<TNotice6> context) {
    }

    @Override
    public void postDelete(TNotice6 entity, PostDeleteContext<TNotice6> context) {
    }
}
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
public class TNotice16Listener implements EntityListener<TNotice16> {

    @Override
    public void preInsert(TNotice16 entity, PreInsertContext<TNotice16> context) {
    }

    @Override
    public void preUpdate(TNotice16 entity, PreUpdateContext<TNotice16> context) {
    }

    @Override
    public void preDelete(TNotice16 entity, PreDeleteContext<TNotice16> context) {
    }

    @Override
    public void postInsert(TNotice16 entity, PostInsertContext<TNotice16> context) {
    }

    @Override
    public void postUpdate(TNotice16 entity, PostUpdateContext<TNotice16> context) {
    }

    @Override
    public void postDelete(TNotice16 entity, PostDeleteContext<TNotice16> context) {
    }
}
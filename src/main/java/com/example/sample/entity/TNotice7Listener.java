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
public class TNotice7Listener implements EntityListener<TNotice7> {

    @Override
    public void preInsert(TNotice7 entity, PreInsertContext<TNotice7> context) {
    }

    @Override
    public void preUpdate(TNotice7 entity, PreUpdateContext<TNotice7> context) {
    }

    @Override
    public void preDelete(TNotice7 entity, PreDeleteContext<TNotice7> context) {
    }

    @Override
    public void postInsert(TNotice7 entity, PostInsertContext<TNotice7> context) {
    }

    @Override
    public void postUpdate(TNotice7 entity, PostUpdateContext<TNotice7> context) {
    }

    @Override
    public void postDelete(TNotice7 entity, PostDeleteContext<TNotice7> context) {
    }
}
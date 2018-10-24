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
public class TNotice51Listener implements EntityListener<TNotice51> {

    @Override
    public void preInsert(TNotice51 entity, PreInsertContext<TNotice51> context) {
    }

    @Override
    public void preUpdate(TNotice51 entity, PreUpdateContext<TNotice51> context) {
    }

    @Override
    public void preDelete(TNotice51 entity, PreDeleteContext<TNotice51> context) {
    }

    @Override
    public void postInsert(TNotice51 entity, PostInsertContext<TNotice51> context) {
    }

    @Override
    public void postUpdate(TNotice51 entity, PostUpdateContext<TNotice51> context) {
    }

    @Override
    public void postDelete(TNotice51 entity, PostDeleteContext<TNotice51> context) {
    }
}
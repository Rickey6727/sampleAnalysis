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
public class TNotice86Listener implements EntityListener<TNotice86> {

    @Override
    public void preInsert(TNotice86 entity, PreInsertContext<TNotice86> context) {
    }

    @Override
    public void preUpdate(TNotice86 entity, PreUpdateContext<TNotice86> context) {
    }

    @Override
    public void preDelete(TNotice86 entity, PreDeleteContext<TNotice86> context) {
    }

    @Override
    public void postInsert(TNotice86 entity, PostInsertContext<TNotice86> context) {
    }

    @Override
    public void postUpdate(TNotice86 entity, PostUpdateContext<TNotice86> context) {
    }

    @Override
    public void postDelete(TNotice86 entity, PostDeleteContext<TNotice86> context) {
    }
}
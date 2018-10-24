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
public class TNotice12Listener implements EntityListener<TNotice12> {

    @Override
    public void preInsert(TNotice12 entity, PreInsertContext<TNotice12> context) {
    }

    @Override
    public void preUpdate(TNotice12 entity, PreUpdateContext<TNotice12> context) {
    }

    @Override
    public void preDelete(TNotice12 entity, PreDeleteContext<TNotice12> context) {
    }

    @Override
    public void postInsert(TNotice12 entity, PostInsertContext<TNotice12> context) {
    }

    @Override
    public void postUpdate(TNotice12 entity, PostUpdateContext<TNotice12> context) {
    }

    @Override
    public void postDelete(TNotice12 entity, PostDeleteContext<TNotice12> context) {
    }
}
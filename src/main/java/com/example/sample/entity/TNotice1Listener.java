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
public class TNotice1Listener implements EntityListener<TNotice1> {

    @Override
    public void preInsert(TNotice1 entity, PreInsertContext<TNotice1> context) {
    }

    @Override
    public void preUpdate(TNotice1 entity, PreUpdateContext<TNotice1> context) {
    }

    @Override
    public void preDelete(TNotice1 entity, PreDeleteContext<TNotice1> context) {
    }

    @Override
    public void postInsert(TNotice1 entity, PostInsertContext<TNotice1> context) {
    }

    @Override
    public void postUpdate(TNotice1 entity, PostUpdateContext<TNotice1> context) {
    }

    @Override
    public void postDelete(TNotice1 entity, PostDeleteContext<TNotice1> context) {
    }
}
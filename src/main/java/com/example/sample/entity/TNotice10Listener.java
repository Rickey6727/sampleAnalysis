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
public class TNotice10Listener implements EntityListener<TNotice10> {

    @Override
    public void preInsert(TNotice10 entity, PreInsertContext<TNotice10> context) {
    }

    @Override
    public void preUpdate(TNotice10 entity, PreUpdateContext<TNotice10> context) {
    }

    @Override
    public void preDelete(TNotice10 entity, PreDeleteContext<TNotice10> context) {
    }

    @Override
    public void postInsert(TNotice10 entity, PostInsertContext<TNotice10> context) {
    }

    @Override
    public void postUpdate(TNotice10 entity, PostUpdateContext<TNotice10> context) {
    }

    @Override
    public void postDelete(TNotice10 entity, PostDeleteContext<TNotice10> context) {
    }
}
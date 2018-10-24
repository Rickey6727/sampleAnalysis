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
public class TNotice32Listener implements EntityListener<TNotice32> {

    @Override
    public void preInsert(TNotice32 entity, PreInsertContext<TNotice32> context) {
    }

    @Override
    public void preUpdate(TNotice32 entity, PreUpdateContext<TNotice32> context) {
    }

    @Override
    public void preDelete(TNotice32 entity, PreDeleteContext<TNotice32> context) {
    }

    @Override
    public void postInsert(TNotice32 entity, PostInsertContext<TNotice32> context) {
    }

    @Override
    public void postUpdate(TNotice32 entity, PostUpdateContext<TNotice32> context) {
    }

    @Override
    public void postDelete(TNotice32 entity, PostDeleteContext<TNotice32> context) {
    }
}
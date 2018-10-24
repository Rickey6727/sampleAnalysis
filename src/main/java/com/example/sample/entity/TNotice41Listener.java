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
public class TNotice41Listener implements EntityListener<TNotice41> {

    @Override
    public void preInsert(TNotice41 entity, PreInsertContext<TNotice41> context) {
    }

    @Override
    public void preUpdate(TNotice41 entity, PreUpdateContext<TNotice41> context) {
    }

    @Override
    public void preDelete(TNotice41 entity, PreDeleteContext<TNotice41> context) {
    }

    @Override
    public void postInsert(TNotice41 entity, PostInsertContext<TNotice41> context) {
    }

    @Override
    public void postUpdate(TNotice41 entity, PostUpdateContext<TNotice41> context) {
    }

    @Override
    public void postDelete(TNotice41 entity, PostDeleteContext<TNotice41> context) {
    }
}
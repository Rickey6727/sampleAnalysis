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
public class TNotice2Listener implements EntityListener<TNotice2> {

    @Override
    public void preInsert(TNotice2 entity, PreInsertContext<TNotice2> context) {
    }

    @Override
    public void preUpdate(TNotice2 entity, PreUpdateContext<TNotice2> context) {
    }

    @Override
    public void preDelete(TNotice2 entity, PreDeleteContext<TNotice2> context) {
    }

    @Override
    public void postInsert(TNotice2 entity, PostInsertContext<TNotice2> context) {
    }

    @Override
    public void postUpdate(TNotice2 entity, PostUpdateContext<TNotice2> context) {
    }

    @Override
    public void postDelete(TNotice2 entity, PostDeleteContext<TNotice2> context) {
    }
}
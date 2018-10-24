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
public class TNoticeListener implements EntityListener<TNotice> {

    @Override
    public void preInsert(TNotice entity, PreInsertContext<TNotice> context) {
    }

    @Override
    public void preUpdate(TNotice entity, PreUpdateContext<TNotice> context) {
    }

    @Override
    public void preDelete(TNotice entity, PreDeleteContext<TNotice> context) {
    }

    @Override
    public void postInsert(TNotice entity, PostInsertContext<TNotice> context) {
    }

    @Override
    public void postUpdate(TNotice entity, PostUpdateContext<TNotice> context) {
    }

    @Override
    public void postDelete(TNotice entity, PostDeleteContext<TNotice> context) {
    }
}
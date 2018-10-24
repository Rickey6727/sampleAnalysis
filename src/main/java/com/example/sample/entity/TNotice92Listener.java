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
public class TNotice92Listener implements EntityListener<TNotice92> {

    @Override
    public void preInsert(TNotice92 entity, PreInsertContext<TNotice92> context) {
    }

    @Override
    public void preUpdate(TNotice92 entity, PreUpdateContext<TNotice92> context) {
    }

    @Override
    public void preDelete(TNotice92 entity, PreDeleteContext<TNotice92> context) {
    }

    @Override
    public void postInsert(TNotice92 entity, PostInsertContext<TNotice92> context) {
    }

    @Override
    public void postUpdate(TNotice92 entity, PostUpdateContext<TNotice92> context) {
    }

    @Override
    public void postDelete(TNotice92 entity, PostDeleteContext<TNotice92> context) {
    }
}
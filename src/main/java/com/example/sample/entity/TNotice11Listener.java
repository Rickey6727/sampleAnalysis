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
public class TNotice11Listener implements EntityListener<TNotice11> {

    @Override
    public void preInsert(TNotice11 entity, PreInsertContext<TNotice11> context) {
    }

    @Override
    public void preUpdate(TNotice11 entity, PreUpdateContext<TNotice11> context) {
    }

    @Override
    public void preDelete(TNotice11 entity, PreDeleteContext<TNotice11> context) {
    }

    @Override
    public void postInsert(TNotice11 entity, PostInsertContext<TNotice11> context) {
    }

    @Override
    public void postUpdate(TNotice11 entity, PostUpdateContext<TNotice11> context) {
    }

    @Override
    public void postDelete(TNotice11 entity, PostDeleteContext<TNotice11> context) {
    }
}
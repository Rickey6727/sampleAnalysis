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
public class TNotice3Listener implements EntityListener<TNotice3> {

    @Override
    public void preInsert(TNotice3 entity, PreInsertContext<TNotice3> context) {
    }

    @Override
    public void preUpdate(TNotice3 entity, PreUpdateContext<TNotice3> context) {
    }

    @Override
    public void preDelete(TNotice3 entity, PreDeleteContext<TNotice3> context) {
    }

    @Override
    public void postInsert(TNotice3 entity, PostInsertContext<TNotice3> context) {
    }

    @Override
    public void postUpdate(TNotice3 entity, PostUpdateContext<TNotice3> context) {
    }

    @Override
    public void postDelete(TNotice3 entity, PostDeleteContext<TNotice3> context) {
    }
}
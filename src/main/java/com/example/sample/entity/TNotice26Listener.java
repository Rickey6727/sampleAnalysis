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
public class TNotice26Listener implements EntityListener<TNotice26> {

    @Override
    public void preInsert(TNotice26 entity, PreInsertContext<TNotice26> context) {
    }

    @Override
    public void preUpdate(TNotice26 entity, PreUpdateContext<TNotice26> context) {
    }

    @Override
    public void preDelete(TNotice26 entity, PreDeleteContext<TNotice26> context) {
    }

    @Override
    public void postInsert(TNotice26 entity, PostInsertContext<TNotice26> context) {
    }

    @Override
    public void postUpdate(TNotice26 entity, PostUpdateContext<TNotice26> context) {
    }

    @Override
    public void postDelete(TNotice26 entity, PostDeleteContext<TNotice26> context) {
    }
}
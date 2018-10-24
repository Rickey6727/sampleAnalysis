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
public class TNotice98Listener implements EntityListener<TNotice98> {

    @Override
    public void preInsert(TNotice98 entity, PreInsertContext<TNotice98> context) {
    }

    @Override
    public void preUpdate(TNotice98 entity, PreUpdateContext<TNotice98> context) {
    }

    @Override
    public void preDelete(TNotice98 entity, PreDeleteContext<TNotice98> context) {
    }

    @Override
    public void postInsert(TNotice98 entity, PostInsertContext<TNotice98> context) {
    }

    @Override
    public void postUpdate(TNotice98 entity, PostUpdateContext<TNotice98> context) {
    }

    @Override
    public void postDelete(TNotice98 entity, PostDeleteContext<TNotice98> context) {
    }
}
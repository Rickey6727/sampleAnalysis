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
public class TNotice17Listener implements EntityListener<TNotice17> {

    @Override
    public void preInsert(TNotice17 entity, PreInsertContext<TNotice17> context) {
    }

    @Override
    public void preUpdate(TNotice17 entity, PreUpdateContext<TNotice17> context) {
    }

    @Override
    public void preDelete(TNotice17 entity, PreDeleteContext<TNotice17> context) {
    }

    @Override
    public void postInsert(TNotice17 entity, PostInsertContext<TNotice17> context) {
    }

    @Override
    public void postUpdate(TNotice17 entity, PostUpdateContext<TNotice17> context) {
    }

    @Override
    public void postDelete(TNotice17 entity, PostDeleteContext<TNotice17> context) {
    }
}
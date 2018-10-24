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
public class TNotice53Listener implements EntityListener<TNotice53> {

    @Override
    public void preInsert(TNotice53 entity, PreInsertContext<TNotice53> context) {
    }

    @Override
    public void preUpdate(TNotice53 entity, PreUpdateContext<TNotice53> context) {
    }

    @Override
    public void preDelete(TNotice53 entity, PreDeleteContext<TNotice53> context) {
    }

    @Override
    public void postInsert(TNotice53 entity, PostInsertContext<TNotice53> context) {
    }

    @Override
    public void postUpdate(TNotice53 entity, PostUpdateContext<TNotice53> context) {
    }

    @Override
    public void postDelete(TNotice53 entity, PostDeleteContext<TNotice53> context) {
    }
}
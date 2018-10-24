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
public class TNotice42Listener implements EntityListener<TNotice42> {

    @Override
    public void preInsert(TNotice42 entity, PreInsertContext<TNotice42> context) {
    }

    @Override
    public void preUpdate(TNotice42 entity, PreUpdateContext<TNotice42> context) {
    }

    @Override
    public void preDelete(TNotice42 entity, PreDeleteContext<TNotice42> context) {
    }

    @Override
    public void postInsert(TNotice42 entity, PostInsertContext<TNotice42> context) {
    }

    @Override
    public void postUpdate(TNotice42 entity, PostUpdateContext<TNotice42> context) {
    }

    @Override
    public void postDelete(TNotice42 entity, PostDeleteContext<TNotice42> context) {
    }
}
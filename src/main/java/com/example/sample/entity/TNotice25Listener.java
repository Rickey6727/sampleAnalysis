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
public class TNotice25Listener implements EntityListener<TNotice25> {

    @Override
    public void preInsert(TNotice25 entity, PreInsertContext<TNotice25> context) {
    }

    @Override
    public void preUpdate(TNotice25 entity, PreUpdateContext<TNotice25> context) {
    }

    @Override
    public void preDelete(TNotice25 entity, PreDeleteContext<TNotice25> context) {
    }

    @Override
    public void postInsert(TNotice25 entity, PostInsertContext<TNotice25> context) {
    }

    @Override
    public void postUpdate(TNotice25 entity, PostUpdateContext<TNotice25> context) {
    }

    @Override
    public void postDelete(TNotice25 entity, PostDeleteContext<TNotice25> context) {
    }
}
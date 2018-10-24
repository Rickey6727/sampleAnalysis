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
public class TMessageBoard25Listener implements EntityListener<TMessageBoard25> {

    @Override
    public void preInsert(TMessageBoard25 entity, PreInsertContext<TMessageBoard25> context) {
    }

    @Override
    public void preUpdate(TMessageBoard25 entity, PreUpdateContext<TMessageBoard25> context) {
    }

    @Override
    public void preDelete(TMessageBoard25 entity, PreDeleteContext<TMessageBoard25> context) {
    }

    @Override
    public void postInsert(TMessageBoard25 entity, PostInsertContext<TMessageBoard25> context) {
    }

    @Override
    public void postUpdate(TMessageBoard25 entity, PostUpdateContext<TMessageBoard25> context) {
    }

    @Override
    public void postDelete(TMessageBoard25 entity, PostDeleteContext<TMessageBoard25> context) {
    }
}
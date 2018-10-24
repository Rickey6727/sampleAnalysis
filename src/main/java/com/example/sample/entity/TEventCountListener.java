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
public class TEventCountListener implements EntityListener<TEventCount> {

    @Override
    public void preInsert(TEventCount entity, PreInsertContext<TEventCount> context) {
    }

    @Override
    public void preUpdate(TEventCount entity, PreUpdateContext<TEventCount> context) {
    }

    @Override
    public void preDelete(TEventCount entity, PreDeleteContext<TEventCount> context) {
    }

    @Override
    public void postInsert(TEventCount entity, PostInsertContext<TEventCount> context) {
    }

    @Override
    public void postUpdate(TEventCount entity, PostUpdateContext<TEventCount> context) {
    }

    @Override
    public void postDelete(TEventCount entity, PostDeleteContext<TEventCount> context) {
    }
}
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
public class TEventUserListener implements EntityListener<TEventUser> {

    @Override
    public void preInsert(TEventUser entity, PreInsertContext<TEventUser> context) {
    }

    @Override
    public void preUpdate(TEventUser entity, PreUpdateContext<TEventUser> context) {
    }

    @Override
    public void preDelete(TEventUser entity, PreDeleteContext<TEventUser> context) {
    }

    @Override
    public void postInsert(TEventUser entity, PostInsertContext<TEventUser> context) {
    }

    @Override
    public void postUpdate(TEventUser entity, PostUpdateContext<TEventUser> context) {
    }

    @Override
    public void postDelete(TEventUser entity, PostDeleteContext<TEventUser> context) {
    }
}
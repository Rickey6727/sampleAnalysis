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
public class TRaiseEventNpcListener implements EntityListener<TRaiseEventNpc> {

    @Override
    public void preInsert(TRaiseEventNpc entity, PreInsertContext<TRaiseEventNpc> context) {
    }

    @Override
    public void preUpdate(TRaiseEventNpc entity, PreUpdateContext<TRaiseEventNpc> context) {
    }

    @Override
    public void preDelete(TRaiseEventNpc entity, PreDeleteContext<TRaiseEventNpc> context) {
    }

    @Override
    public void postInsert(TRaiseEventNpc entity, PostInsertContext<TRaiseEventNpc> context) {
    }

    @Override
    public void postUpdate(TRaiseEventNpc entity, PostUpdateContext<TRaiseEventNpc> context) {
    }

    @Override
    public void postDelete(TRaiseEventNpc entity, PostDeleteContext<TRaiseEventNpc> context) {
    }
}
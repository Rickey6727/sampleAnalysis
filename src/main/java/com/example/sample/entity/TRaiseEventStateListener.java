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
public class TRaiseEventStateListener implements EntityListener<TRaiseEventState> {

    @Override
    public void preInsert(TRaiseEventState entity, PreInsertContext<TRaiseEventState> context) {
    }

    @Override
    public void preUpdate(TRaiseEventState entity, PreUpdateContext<TRaiseEventState> context) {
    }

    @Override
    public void preDelete(TRaiseEventState entity, PreDeleteContext<TRaiseEventState> context) {
    }

    @Override
    public void postInsert(TRaiseEventState entity, PostInsertContext<TRaiseEventState> context) {
    }

    @Override
    public void postUpdate(TRaiseEventState entity, PostUpdateContext<TRaiseEventState> context) {
    }

    @Override
    public void postDelete(TRaiseEventState entity, PostDeleteContext<TRaiseEventState> context) {
    }
}
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
public class TRaiseEventItemOwnListener implements EntityListener<TRaiseEventItemOwn> {

    @Override
    public void preInsert(TRaiseEventItemOwn entity, PreInsertContext<TRaiseEventItemOwn> context) {
    }

    @Override
    public void preUpdate(TRaiseEventItemOwn entity, PreUpdateContext<TRaiseEventItemOwn> context) {
    }

    @Override
    public void preDelete(TRaiseEventItemOwn entity, PreDeleteContext<TRaiseEventItemOwn> context) {
    }

    @Override
    public void postInsert(TRaiseEventItemOwn entity, PostInsertContext<TRaiseEventItemOwn> context) {
    }

    @Override
    public void postUpdate(TRaiseEventItemOwn entity, PostUpdateContext<TRaiseEventItemOwn> context) {
    }

    @Override
    public void postDelete(TRaiseEventItemOwn entity, PostDeleteContext<TRaiseEventItemOwn> context) {
    }
}
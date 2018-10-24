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
public class TRaiseEventItemOwnHistoryListener implements EntityListener<TRaiseEventItemOwnHistory> {

    @Override
    public void preInsert(TRaiseEventItemOwnHistory entity, PreInsertContext<TRaiseEventItemOwnHistory> context) {
    }

    @Override
    public void preUpdate(TRaiseEventItemOwnHistory entity, PreUpdateContext<TRaiseEventItemOwnHistory> context) {
    }

    @Override
    public void preDelete(TRaiseEventItemOwnHistory entity, PreDeleteContext<TRaiseEventItemOwnHistory> context) {
    }

    @Override
    public void postInsert(TRaiseEventItemOwnHistory entity, PostInsertContext<TRaiseEventItemOwnHistory> context) {
    }

    @Override
    public void postUpdate(TRaiseEventItemOwnHistory entity, PostUpdateContext<TRaiseEventItemOwnHistory> context) {
    }

    @Override
    public void postDelete(TRaiseEventItemOwnHistory entity, PostDeleteContext<TRaiseEventItemOwnHistory> context) {
    }
}
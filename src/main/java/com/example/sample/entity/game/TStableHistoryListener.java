package com.example.sample.entity.game;

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
public class TStableHistoryListener implements EntityListener<TStableHistory> {

    @Override
    public void preInsert(TStableHistory entity, PreInsertContext<TStableHistory> context) {
    }

    @Override
    public void preUpdate(TStableHistory entity, PreUpdateContext<TStableHistory> context) {
    }

    @Override
    public void preDelete(TStableHistory entity, PreDeleteContext<TStableHistory> context) {
    }

    @Override
    public void postInsert(TStableHistory entity, PostInsertContext<TStableHistory> context) {
    }

    @Override
    public void postUpdate(TStableHistory entity, PostUpdateContext<TStableHistory> context) {
    }

    @Override
    public void postDelete(TStableHistory entity, PostDeleteContext<TStableHistory> context) {
    }
}
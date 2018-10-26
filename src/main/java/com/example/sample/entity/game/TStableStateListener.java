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
public class TStableStateListener implements EntityListener<TStableState> {

    @Override
    public void preInsert(TStableState entity, PreInsertContext<TStableState> context) {
    }

    @Override
    public void preUpdate(TStableState entity, PreUpdateContext<TStableState> context) {
    }

    @Override
    public void preDelete(TStableState entity, PreDeleteContext<TStableState> context) {
    }

    @Override
    public void postInsert(TStableState entity, PostInsertContext<TStableState> context) {
    }

    @Override
    public void postUpdate(TStableState entity, PostUpdateContext<TStableState> context) {
    }

    @Override
    public void postDelete(TStableState entity, PostDeleteContext<TStableState> context) {
    }
}
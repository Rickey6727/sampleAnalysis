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
public class TGainUser90Listener implements EntityListener<TGainUser90> {

    @Override
    public void preInsert(TGainUser90 entity, PreInsertContext<TGainUser90> context) {
    }

    @Override
    public void preUpdate(TGainUser90 entity, PreUpdateContext<TGainUser90> context) {
    }

    @Override
    public void preDelete(TGainUser90 entity, PreDeleteContext<TGainUser90> context) {
    }

    @Override
    public void postInsert(TGainUser90 entity, PostInsertContext<TGainUser90> context) {
    }

    @Override
    public void postUpdate(TGainUser90 entity, PostUpdateContext<TGainUser90> context) {
    }

    @Override
    public void postDelete(TGainUser90 entity, PostDeleteContext<TGainUser90> context) {
    }
}
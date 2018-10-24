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
public class TGainUser64Listener implements EntityListener<TGainUser64> {

    @Override
    public void preInsert(TGainUser64 entity, PreInsertContext<TGainUser64> context) {
    }

    @Override
    public void preUpdate(TGainUser64 entity, PreUpdateContext<TGainUser64> context) {
    }

    @Override
    public void preDelete(TGainUser64 entity, PreDeleteContext<TGainUser64> context) {
    }

    @Override
    public void postInsert(TGainUser64 entity, PostInsertContext<TGainUser64> context) {
    }

    @Override
    public void postUpdate(TGainUser64 entity, PostUpdateContext<TGainUser64> context) {
    }

    @Override
    public void postDelete(TGainUser64 entity, PostDeleteContext<TGainUser64> context) {
    }
}
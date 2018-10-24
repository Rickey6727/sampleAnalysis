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
public class TGainUser32Listener implements EntityListener<TGainUser32> {

    @Override
    public void preInsert(TGainUser32 entity, PreInsertContext<TGainUser32> context) {
    }

    @Override
    public void preUpdate(TGainUser32 entity, PreUpdateContext<TGainUser32> context) {
    }

    @Override
    public void preDelete(TGainUser32 entity, PreDeleteContext<TGainUser32> context) {
    }

    @Override
    public void postInsert(TGainUser32 entity, PostInsertContext<TGainUser32> context) {
    }

    @Override
    public void postUpdate(TGainUser32 entity, PostUpdateContext<TGainUser32> context) {
    }

    @Override
    public void postDelete(TGainUser32 entity, PostDeleteContext<TGainUser32> context) {
    }
}
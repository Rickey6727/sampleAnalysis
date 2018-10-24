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
public class TGainUser82Listener implements EntityListener<TGainUser82> {

    @Override
    public void preInsert(TGainUser82 entity, PreInsertContext<TGainUser82> context) {
    }

    @Override
    public void preUpdate(TGainUser82 entity, PreUpdateContext<TGainUser82> context) {
    }

    @Override
    public void preDelete(TGainUser82 entity, PreDeleteContext<TGainUser82> context) {
    }

    @Override
    public void postInsert(TGainUser82 entity, PostInsertContext<TGainUser82> context) {
    }

    @Override
    public void postUpdate(TGainUser82 entity, PostUpdateContext<TGainUser82> context) {
    }

    @Override
    public void postDelete(TGainUser82 entity, PostDeleteContext<TGainUser82> context) {
    }
}
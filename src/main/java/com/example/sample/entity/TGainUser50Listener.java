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
public class TGainUser50Listener implements EntityListener<TGainUser50> {

    @Override
    public void preInsert(TGainUser50 entity, PreInsertContext<TGainUser50> context) {
    }

    @Override
    public void preUpdate(TGainUser50 entity, PreUpdateContext<TGainUser50> context) {
    }

    @Override
    public void preDelete(TGainUser50 entity, PreDeleteContext<TGainUser50> context) {
    }

    @Override
    public void postInsert(TGainUser50 entity, PostInsertContext<TGainUser50> context) {
    }

    @Override
    public void postUpdate(TGainUser50 entity, PostUpdateContext<TGainUser50> context) {
    }

    @Override
    public void postDelete(TGainUser50 entity, PostDeleteContext<TGainUser50> context) {
    }
}
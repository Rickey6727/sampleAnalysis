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
public class TGainUser81Listener implements EntityListener<TGainUser81> {

    @Override
    public void preInsert(TGainUser81 entity, PreInsertContext<TGainUser81> context) {
    }

    @Override
    public void preUpdate(TGainUser81 entity, PreUpdateContext<TGainUser81> context) {
    }

    @Override
    public void preDelete(TGainUser81 entity, PreDeleteContext<TGainUser81> context) {
    }

    @Override
    public void postInsert(TGainUser81 entity, PostInsertContext<TGainUser81> context) {
    }

    @Override
    public void postUpdate(TGainUser81 entity, PostUpdateContext<TGainUser81> context) {
    }

    @Override
    public void postDelete(TGainUser81 entity, PostDeleteContext<TGainUser81> context) {
    }
}
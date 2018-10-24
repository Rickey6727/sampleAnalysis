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
public class TGainUser60Listener implements EntityListener<TGainUser60> {

    @Override
    public void preInsert(TGainUser60 entity, PreInsertContext<TGainUser60> context) {
    }

    @Override
    public void preUpdate(TGainUser60 entity, PreUpdateContext<TGainUser60> context) {
    }

    @Override
    public void preDelete(TGainUser60 entity, PreDeleteContext<TGainUser60> context) {
    }

    @Override
    public void postInsert(TGainUser60 entity, PostInsertContext<TGainUser60> context) {
    }

    @Override
    public void postUpdate(TGainUser60 entity, PostUpdateContext<TGainUser60> context) {
    }

    @Override
    public void postDelete(TGainUser60 entity, PostDeleteContext<TGainUser60> context) {
    }
}
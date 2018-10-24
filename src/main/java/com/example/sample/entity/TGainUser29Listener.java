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
public class TGainUser29Listener implements EntityListener<TGainUser29> {

    @Override
    public void preInsert(TGainUser29 entity, PreInsertContext<TGainUser29> context) {
    }

    @Override
    public void preUpdate(TGainUser29 entity, PreUpdateContext<TGainUser29> context) {
    }

    @Override
    public void preDelete(TGainUser29 entity, PreDeleteContext<TGainUser29> context) {
    }

    @Override
    public void postInsert(TGainUser29 entity, PostInsertContext<TGainUser29> context) {
    }

    @Override
    public void postUpdate(TGainUser29 entity, PostUpdateContext<TGainUser29> context) {
    }

    @Override
    public void postDelete(TGainUser29 entity, PostDeleteContext<TGainUser29> context) {
    }
}
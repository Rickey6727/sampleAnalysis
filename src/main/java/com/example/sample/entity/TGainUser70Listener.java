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
public class TGainUser70Listener implements EntityListener<TGainUser70> {

    @Override
    public void preInsert(TGainUser70 entity, PreInsertContext<TGainUser70> context) {
    }

    @Override
    public void preUpdate(TGainUser70 entity, PreUpdateContext<TGainUser70> context) {
    }

    @Override
    public void preDelete(TGainUser70 entity, PreDeleteContext<TGainUser70> context) {
    }

    @Override
    public void postInsert(TGainUser70 entity, PostInsertContext<TGainUser70> context) {
    }

    @Override
    public void postUpdate(TGainUser70 entity, PostUpdateContext<TGainUser70> context) {
    }

    @Override
    public void postDelete(TGainUser70 entity, PostDeleteContext<TGainUser70> context) {
    }
}
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
public class TGainUser8Listener implements EntityListener<TGainUser8> {

    @Override
    public void preInsert(TGainUser8 entity, PreInsertContext<TGainUser8> context) {
    }

    @Override
    public void preUpdate(TGainUser8 entity, PreUpdateContext<TGainUser8> context) {
    }

    @Override
    public void preDelete(TGainUser8 entity, PreDeleteContext<TGainUser8> context) {
    }

    @Override
    public void postInsert(TGainUser8 entity, PostInsertContext<TGainUser8> context) {
    }

    @Override
    public void postUpdate(TGainUser8 entity, PostUpdateContext<TGainUser8> context) {
    }

    @Override
    public void postDelete(TGainUser8 entity, PostDeleteContext<TGainUser8> context) {
    }
}
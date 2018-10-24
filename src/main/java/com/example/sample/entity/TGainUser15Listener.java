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
public class TGainUser15Listener implements EntityListener<TGainUser15> {

    @Override
    public void preInsert(TGainUser15 entity, PreInsertContext<TGainUser15> context) {
    }

    @Override
    public void preUpdate(TGainUser15 entity, PreUpdateContext<TGainUser15> context) {
    }

    @Override
    public void preDelete(TGainUser15 entity, PreDeleteContext<TGainUser15> context) {
    }

    @Override
    public void postInsert(TGainUser15 entity, PostInsertContext<TGainUser15> context) {
    }

    @Override
    public void postUpdate(TGainUser15 entity, PostUpdateContext<TGainUser15> context) {
    }

    @Override
    public void postDelete(TGainUser15 entity, PostDeleteContext<TGainUser15> context) {
    }
}
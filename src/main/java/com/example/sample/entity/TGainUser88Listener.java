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
public class TGainUser88Listener implements EntityListener<TGainUser88> {

    @Override
    public void preInsert(TGainUser88 entity, PreInsertContext<TGainUser88> context) {
    }

    @Override
    public void preUpdate(TGainUser88 entity, PreUpdateContext<TGainUser88> context) {
    }

    @Override
    public void preDelete(TGainUser88 entity, PreDeleteContext<TGainUser88> context) {
    }

    @Override
    public void postInsert(TGainUser88 entity, PostInsertContext<TGainUser88> context) {
    }

    @Override
    public void postUpdate(TGainUser88 entity, PostUpdateContext<TGainUser88> context) {
    }

    @Override
    public void postDelete(TGainUser88 entity, PostDeleteContext<TGainUser88> context) {
    }
}
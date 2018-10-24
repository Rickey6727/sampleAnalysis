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
public class TGainUser0Listener implements EntityListener<TGainUser0> {

    @Override
    public void preInsert(TGainUser0 entity, PreInsertContext<TGainUser0> context) {
    }

    @Override
    public void preUpdate(TGainUser0 entity, PreUpdateContext<TGainUser0> context) {
    }

    @Override
    public void preDelete(TGainUser0 entity, PreDeleteContext<TGainUser0> context) {
    }

    @Override
    public void postInsert(TGainUser0 entity, PostInsertContext<TGainUser0> context) {
    }

    @Override
    public void postUpdate(TGainUser0 entity, PostUpdateContext<TGainUser0> context) {
    }

    @Override
    public void postDelete(TGainUser0 entity, PostDeleteContext<TGainUser0> context) {
    }
}
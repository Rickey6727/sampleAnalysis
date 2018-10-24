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
public class TGainUser95Listener implements EntityListener<TGainUser95> {

    @Override
    public void preInsert(TGainUser95 entity, PreInsertContext<TGainUser95> context) {
    }

    @Override
    public void preUpdate(TGainUser95 entity, PreUpdateContext<TGainUser95> context) {
    }

    @Override
    public void preDelete(TGainUser95 entity, PreDeleteContext<TGainUser95> context) {
    }

    @Override
    public void postInsert(TGainUser95 entity, PostInsertContext<TGainUser95> context) {
    }

    @Override
    public void postUpdate(TGainUser95 entity, PostUpdateContext<TGainUser95> context) {
    }

    @Override
    public void postDelete(TGainUser95 entity, PostDeleteContext<TGainUser95> context) {
    }
}
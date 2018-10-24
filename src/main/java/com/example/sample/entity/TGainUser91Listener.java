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
public class TGainUser91Listener implements EntityListener<TGainUser91> {

    @Override
    public void preInsert(TGainUser91 entity, PreInsertContext<TGainUser91> context) {
    }

    @Override
    public void preUpdate(TGainUser91 entity, PreUpdateContext<TGainUser91> context) {
    }

    @Override
    public void preDelete(TGainUser91 entity, PreDeleteContext<TGainUser91> context) {
    }

    @Override
    public void postInsert(TGainUser91 entity, PostInsertContext<TGainUser91> context) {
    }

    @Override
    public void postUpdate(TGainUser91 entity, PostUpdateContext<TGainUser91> context) {
    }

    @Override
    public void postDelete(TGainUser91 entity, PostDeleteContext<TGainUser91> context) {
    }
}
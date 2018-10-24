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
public class TGainUser97Listener implements EntityListener<TGainUser97> {

    @Override
    public void preInsert(TGainUser97 entity, PreInsertContext<TGainUser97> context) {
    }

    @Override
    public void preUpdate(TGainUser97 entity, PreUpdateContext<TGainUser97> context) {
    }

    @Override
    public void preDelete(TGainUser97 entity, PreDeleteContext<TGainUser97> context) {
    }

    @Override
    public void postInsert(TGainUser97 entity, PostInsertContext<TGainUser97> context) {
    }

    @Override
    public void postUpdate(TGainUser97 entity, PostUpdateContext<TGainUser97> context) {
    }

    @Override
    public void postDelete(TGainUser97 entity, PostDeleteContext<TGainUser97> context) {
    }
}
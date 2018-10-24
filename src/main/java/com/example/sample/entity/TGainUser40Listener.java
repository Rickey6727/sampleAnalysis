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
public class TGainUser40Listener implements EntityListener<TGainUser40> {

    @Override
    public void preInsert(TGainUser40 entity, PreInsertContext<TGainUser40> context) {
    }

    @Override
    public void preUpdate(TGainUser40 entity, PreUpdateContext<TGainUser40> context) {
    }

    @Override
    public void preDelete(TGainUser40 entity, PreDeleteContext<TGainUser40> context) {
    }

    @Override
    public void postInsert(TGainUser40 entity, PostInsertContext<TGainUser40> context) {
    }

    @Override
    public void postUpdate(TGainUser40 entity, PostUpdateContext<TGainUser40> context) {
    }

    @Override
    public void postDelete(TGainUser40 entity, PostDeleteContext<TGainUser40> context) {
    }
}
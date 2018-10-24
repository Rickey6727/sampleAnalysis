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
public class TGainUser65Listener implements EntityListener<TGainUser65> {

    @Override
    public void preInsert(TGainUser65 entity, PreInsertContext<TGainUser65> context) {
    }

    @Override
    public void preUpdate(TGainUser65 entity, PreUpdateContext<TGainUser65> context) {
    }

    @Override
    public void preDelete(TGainUser65 entity, PreDeleteContext<TGainUser65> context) {
    }

    @Override
    public void postInsert(TGainUser65 entity, PostInsertContext<TGainUser65> context) {
    }

    @Override
    public void postUpdate(TGainUser65 entity, PostUpdateContext<TGainUser65> context) {
    }

    @Override
    public void postDelete(TGainUser65 entity, PostDeleteContext<TGainUser65> context) {
    }
}
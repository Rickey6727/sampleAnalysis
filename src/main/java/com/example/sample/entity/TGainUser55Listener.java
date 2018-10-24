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
public class TGainUser55Listener implements EntityListener<TGainUser55> {

    @Override
    public void preInsert(TGainUser55 entity, PreInsertContext<TGainUser55> context) {
    }

    @Override
    public void preUpdate(TGainUser55 entity, PreUpdateContext<TGainUser55> context) {
    }

    @Override
    public void preDelete(TGainUser55 entity, PreDeleteContext<TGainUser55> context) {
    }

    @Override
    public void postInsert(TGainUser55 entity, PostInsertContext<TGainUser55> context) {
    }

    @Override
    public void postUpdate(TGainUser55 entity, PostUpdateContext<TGainUser55> context) {
    }

    @Override
    public void postDelete(TGainUser55 entity, PostDeleteContext<TGainUser55> context) {
    }
}
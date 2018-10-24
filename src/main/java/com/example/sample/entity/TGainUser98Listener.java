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
public class TGainUser98Listener implements EntityListener<TGainUser98> {

    @Override
    public void preInsert(TGainUser98 entity, PreInsertContext<TGainUser98> context) {
    }

    @Override
    public void preUpdate(TGainUser98 entity, PreUpdateContext<TGainUser98> context) {
    }

    @Override
    public void preDelete(TGainUser98 entity, PreDeleteContext<TGainUser98> context) {
    }

    @Override
    public void postInsert(TGainUser98 entity, PostInsertContext<TGainUser98> context) {
    }

    @Override
    public void postUpdate(TGainUser98 entity, PostUpdateContext<TGainUser98> context) {
    }

    @Override
    public void postDelete(TGainUser98 entity, PostDeleteContext<TGainUser98> context) {
    }
}
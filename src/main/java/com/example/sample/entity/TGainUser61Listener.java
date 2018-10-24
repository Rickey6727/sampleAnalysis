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
public class TGainUser61Listener implements EntityListener<TGainUser61> {

    @Override
    public void preInsert(TGainUser61 entity, PreInsertContext<TGainUser61> context) {
    }

    @Override
    public void preUpdate(TGainUser61 entity, PreUpdateContext<TGainUser61> context) {
    }

    @Override
    public void preDelete(TGainUser61 entity, PreDeleteContext<TGainUser61> context) {
    }

    @Override
    public void postInsert(TGainUser61 entity, PostInsertContext<TGainUser61> context) {
    }

    @Override
    public void postUpdate(TGainUser61 entity, PostUpdateContext<TGainUser61> context) {
    }

    @Override
    public void postDelete(TGainUser61 entity, PostDeleteContext<TGainUser61> context) {
    }
}
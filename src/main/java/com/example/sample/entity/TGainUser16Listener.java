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
public class TGainUser16Listener implements EntityListener<TGainUser16> {

    @Override
    public void preInsert(TGainUser16 entity, PreInsertContext<TGainUser16> context) {
    }

    @Override
    public void preUpdate(TGainUser16 entity, PreUpdateContext<TGainUser16> context) {
    }

    @Override
    public void preDelete(TGainUser16 entity, PreDeleteContext<TGainUser16> context) {
    }

    @Override
    public void postInsert(TGainUser16 entity, PostInsertContext<TGainUser16> context) {
    }

    @Override
    public void postUpdate(TGainUser16 entity, PostUpdateContext<TGainUser16> context) {
    }

    @Override
    public void postDelete(TGainUser16 entity, PostDeleteContext<TGainUser16> context) {
    }
}
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
public class TGainUser53Listener implements EntityListener<TGainUser53> {

    @Override
    public void preInsert(TGainUser53 entity, PreInsertContext<TGainUser53> context) {
    }

    @Override
    public void preUpdate(TGainUser53 entity, PreUpdateContext<TGainUser53> context) {
    }

    @Override
    public void preDelete(TGainUser53 entity, PreDeleteContext<TGainUser53> context) {
    }

    @Override
    public void postInsert(TGainUser53 entity, PostInsertContext<TGainUser53> context) {
    }

    @Override
    public void postUpdate(TGainUser53 entity, PostUpdateContext<TGainUser53> context) {
    }

    @Override
    public void postDelete(TGainUser53 entity, PostDeleteContext<TGainUser53> context) {
    }
}
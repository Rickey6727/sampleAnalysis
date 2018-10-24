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
public class TGainUser13Listener implements EntityListener<TGainUser13> {

    @Override
    public void preInsert(TGainUser13 entity, PreInsertContext<TGainUser13> context) {
    }

    @Override
    public void preUpdate(TGainUser13 entity, PreUpdateContext<TGainUser13> context) {
    }

    @Override
    public void preDelete(TGainUser13 entity, PreDeleteContext<TGainUser13> context) {
    }

    @Override
    public void postInsert(TGainUser13 entity, PostInsertContext<TGainUser13> context) {
    }

    @Override
    public void postUpdate(TGainUser13 entity, PostUpdateContext<TGainUser13> context) {
    }

    @Override
    public void postDelete(TGainUser13 entity, PostDeleteContext<TGainUser13> context) {
    }
}
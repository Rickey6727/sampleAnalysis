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
public class TGainUser99Listener implements EntityListener<TGainUser99> {

    @Override
    public void preInsert(TGainUser99 entity, PreInsertContext<TGainUser99> context) {
    }

    @Override
    public void preUpdate(TGainUser99 entity, PreUpdateContext<TGainUser99> context) {
    }

    @Override
    public void preDelete(TGainUser99 entity, PreDeleteContext<TGainUser99> context) {
    }

    @Override
    public void postInsert(TGainUser99 entity, PostInsertContext<TGainUser99> context) {
    }

    @Override
    public void postUpdate(TGainUser99 entity, PostUpdateContext<TGainUser99> context) {
    }

    @Override
    public void postDelete(TGainUser99 entity, PostDeleteContext<TGainUser99> context) {
    }
}
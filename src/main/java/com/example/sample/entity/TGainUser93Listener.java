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
public class TGainUser93Listener implements EntityListener<TGainUser93> {

    @Override
    public void preInsert(TGainUser93 entity, PreInsertContext<TGainUser93> context) {
    }

    @Override
    public void preUpdate(TGainUser93 entity, PreUpdateContext<TGainUser93> context) {
    }

    @Override
    public void preDelete(TGainUser93 entity, PreDeleteContext<TGainUser93> context) {
    }

    @Override
    public void postInsert(TGainUser93 entity, PostInsertContext<TGainUser93> context) {
    }

    @Override
    public void postUpdate(TGainUser93 entity, PostUpdateContext<TGainUser93> context) {
    }

    @Override
    public void postDelete(TGainUser93 entity, PostDeleteContext<TGainUser93> context) {
    }
}
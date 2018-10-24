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
public class TGainUser83Listener implements EntityListener<TGainUser83> {

    @Override
    public void preInsert(TGainUser83 entity, PreInsertContext<TGainUser83> context) {
    }

    @Override
    public void preUpdate(TGainUser83 entity, PreUpdateContext<TGainUser83> context) {
    }

    @Override
    public void preDelete(TGainUser83 entity, PreDeleteContext<TGainUser83> context) {
    }

    @Override
    public void postInsert(TGainUser83 entity, PostInsertContext<TGainUser83> context) {
    }

    @Override
    public void postUpdate(TGainUser83 entity, PostUpdateContext<TGainUser83> context) {
    }

    @Override
    public void postDelete(TGainUser83 entity, PostDeleteContext<TGainUser83> context) {
    }
}
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
public class TGainUser19Listener implements EntityListener<TGainUser19> {

    @Override
    public void preInsert(TGainUser19 entity, PreInsertContext<TGainUser19> context) {
    }

    @Override
    public void preUpdate(TGainUser19 entity, PreUpdateContext<TGainUser19> context) {
    }

    @Override
    public void preDelete(TGainUser19 entity, PreDeleteContext<TGainUser19> context) {
    }

    @Override
    public void postInsert(TGainUser19 entity, PostInsertContext<TGainUser19> context) {
    }

    @Override
    public void postUpdate(TGainUser19 entity, PostUpdateContext<TGainUser19> context) {
    }

    @Override
    public void postDelete(TGainUser19 entity, PostDeleteContext<TGainUser19> context) {
    }
}
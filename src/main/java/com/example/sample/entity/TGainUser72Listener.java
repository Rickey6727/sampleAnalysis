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
public class TGainUser72Listener implements EntityListener<TGainUser72> {

    @Override
    public void preInsert(TGainUser72 entity, PreInsertContext<TGainUser72> context) {
    }

    @Override
    public void preUpdate(TGainUser72 entity, PreUpdateContext<TGainUser72> context) {
    }

    @Override
    public void preDelete(TGainUser72 entity, PreDeleteContext<TGainUser72> context) {
    }

    @Override
    public void postInsert(TGainUser72 entity, PostInsertContext<TGainUser72> context) {
    }

    @Override
    public void postUpdate(TGainUser72 entity, PostUpdateContext<TGainUser72> context) {
    }

    @Override
    public void postDelete(TGainUser72 entity, PostDeleteContext<TGainUser72> context) {
    }
}
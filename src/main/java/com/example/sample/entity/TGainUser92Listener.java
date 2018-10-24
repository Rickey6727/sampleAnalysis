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
public class TGainUser92Listener implements EntityListener<TGainUser92> {

    @Override
    public void preInsert(TGainUser92 entity, PreInsertContext<TGainUser92> context) {
    }

    @Override
    public void preUpdate(TGainUser92 entity, PreUpdateContext<TGainUser92> context) {
    }

    @Override
    public void preDelete(TGainUser92 entity, PreDeleteContext<TGainUser92> context) {
    }

    @Override
    public void postInsert(TGainUser92 entity, PostInsertContext<TGainUser92> context) {
    }

    @Override
    public void postUpdate(TGainUser92 entity, PostUpdateContext<TGainUser92> context) {
    }

    @Override
    public void postDelete(TGainUser92 entity, PostDeleteContext<TGainUser92> context) {
    }
}
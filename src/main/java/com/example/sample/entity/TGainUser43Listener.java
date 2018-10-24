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
public class TGainUser43Listener implements EntityListener<TGainUser43> {

    @Override
    public void preInsert(TGainUser43 entity, PreInsertContext<TGainUser43> context) {
    }

    @Override
    public void preUpdate(TGainUser43 entity, PreUpdateContext<TGainUser43> context) {
    }

    @Override
    public void preDelete(TGainUser43 entity, PreDeleteContext<TGainUser43> context) {
    }

    @Override
    public void postInsert(TGainUser43 entity, PostInsertContext<TGainUser43> context) {
    }

    @Override
    public void postUpdate(TGainUser43 entity, PostUpdateContext<TGainUser43> context) {
    }

    @Override
    public void postDelete(TGainUser43 entity, PostDeleteContext<TGainUser43> context) {
    }
}
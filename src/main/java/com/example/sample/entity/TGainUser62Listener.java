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
public class TGainUser62Listener implements EntityListener<TGainUser62> {

    @Override
    public void preInsert(TGainUser62 entity, PreInsertContext<TGainUser62> context) {
    }

    @Override
    public void preUpdate(TGainUser62 entity, PreUpdateContext<TGainUser62> context) {
    }

    @Override
    public void preDelete(TGainUser62 entity, PreDeleteContext<TGainUser62> context) {
    }

    @Override
    public void postInsert(TGainUser62 entity, PostInsertContext<TGainUser62> context) {
    }

    @Override
    public void postUpdate(TGainUser62 entity, PostUpdateContext<TGainUser62> context) {
    }

    @Override
    public void postDelete(TGainUser62 entity, PostDeleteContext<TGainUser62> context) {
    }
}
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
public class TGainUser85Listener implements EntityListener<TGainUser85> {

    @Override
    public void preInsert(TGainUser85 entity, PreInsertContext<TGainUser85> context) {
    }

    @Override
    public void preUpdate(TGainUser85 entity, PreUpdateContext<TGainUser85> context) {
    }

    @Override
    public void preDelete(TGainUser85 entity, PreDeleteContext<TGainUser85> context) {
    }

    @Override
    public void postInsert(TGainUser85 entity, PostInsertContext<TGainUser85> context) {
    }

    @Override
    public void postUpdate(TGainUser85 entity, PostUpdateContext<TGainUser85> context) {
    }

    @Override
    public void postDelete(TGainUser85 entity, PostDeleteContext<TGainUser85> context) {
    }
}
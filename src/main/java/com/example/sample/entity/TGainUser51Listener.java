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
public class TGainUser51Listener implements EntityListener<TGainUser51> {

    @Override
    public void preInsert(TGainUser51 entity, PreInsertContext<TGainUser51> context) {
    }

    @Override
    public void preUpdate(TGainUser51 entity, PreUpdateContext<TGainUser51> context) {
    }

    @Override
    public void preDelete(TGainUser51 entity, PreDeleteContext<TGainUser51> context) {
    }

    @Override
    public void postInsert(TGainUser51 entity, PostInsertContext<TGainUser51> context) {
    }

    @Override
    public void postUpdate(TGainUser51 entity, PostUpdateContext<TGainUser51> context) {
    }

    @Override
    public void postDelete(TGainUser51 entity, PostDeleteContext<TGainUser51> context) {
    }
}
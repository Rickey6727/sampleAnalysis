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
public class TGainUser23Listener implements EntityListener<TGainUser23> {

    @Override
    public void preInsert(TGainUser23 entity, PreInsertContext<TGainUser23> context) {
    }

    @Override
    public void preUpdate(TGainUser23 entity, PreUpdateContext<TGainUser23> context) {
    }

    @Override
    public void preDelete(TGainUser23 entity, PreDeleteContext<TGainUser23> context) {
    }

    @Override
    public void postInsert(TGainUser23 entity, PostInsertContext<TGainUser23> context) {
    }

    @Override
    public void postUpdate(TGainUser23 entity, PostUpdateContext<TGainUser23> context) {
    }

    @Override
    public void postDelete(TGainUser23 entity, PostDeleteContext<TGainUser23> context) {
    }
}
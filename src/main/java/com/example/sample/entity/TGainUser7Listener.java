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
public class TGainUser7Listener implements EntityListener<TGainUser7> {

    @Override
    public void preInsert(TGainUser7 entity, PreInsertContext<TGainUser7> context) {
    }

    @Override
    public void preUpdate(TGainUser7 entity, PreUpdateContext<TGainUser7> context) {
    }

    @Override
    public void preDelete(TGainUser7 entity, PreDeleteContext<TGainUser7> context) {
    }

    @Override
    public void postInsert(TGainUser7 entity, PostInsertContext<TGainUser7> context) {
    }

    @Override
    public void postUpdate(TGainUser7 entity, PostUpdateContext<TGainUser7> context) {
    }

    @Override
    public void postDelete(TGainUser7 entity, PostDeleteContext<TGainUser7> context) {
    }
}
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
public class TGainUser30Listener implements EntityListener<TGainUser30> {

    @Override
    public void preInsert(TGainUser30 entity, PreInsertContext<TGainUser30> context) {
    }

    @Override
    public void preUpdate(TGainUser30 entity, PreUpdateContext<TGainUser30> context) {
    }

    @Override
    public void preDelete(TGainUser30 entity, PreDeleteContext<TGainUser30> context) {
    }

    @Override
    public void postInsert(TGainUser30 entity, PostInsertContext<TGainUser30> context) {
    }

    @Override
    public void postUpdate(TGainUser30 entity, PostUpdateContext<TGainUser30> context) {
    }

    @Override
    public void postDelete(TGainUser30 entity, PostDeleteContext<TGainUser30> context) {
    }
}
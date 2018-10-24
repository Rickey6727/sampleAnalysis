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
public class TGainUser12Listener implements EntityListener<TGainUser12> {

    @Override
    public void preInsert(TGainUser12 entity, PreInsertContext<TGainUser12> context) {
    }

    @Override
    public void preUpdate(TGainUser12 entity, PreUpdateContext<TGainUser12> context) {
    }

    @Override
    public void preDelete(TGainUser12 entity, PreDeleteContext<TGainUser12> context) {
    }

    @Override
    public void postInsert(TGainUser12 entity, PostInsertContext<TGainUser12> context) {
    }

    @Override
    public void postUpdate(TGainUser12 entity, PostUpdateContext<TGainUser12> context) {
    }

    @Override
    public void postDelete(TGainUser12 entity, PostDeleteContext<TGainUser12> context) {
    }
}
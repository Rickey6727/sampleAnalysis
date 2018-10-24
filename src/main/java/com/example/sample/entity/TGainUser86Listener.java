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
public class TGainUser86Listener implements EntityListener<TGainUser86> {

    @Override
    public void preInsert(TGainUser86 entity, PreInsertContext<TGainUser86> context) {
    }

    @Override
    public void preUpdate(TGainUser86 entity, PreUpdateContext<TGainUser86> context) {
    }

    @Override
    public void preDelete(TGainUser86 entity, PreDeleteContext<TGainUser86> context) {
    }

    @Override
    public void postInsert(TGainUser86 entity, PostInsertContext<TGainUser86> context) {
    }

    @Override
    public void postUpdate(TGainUser86 entity, PostUpdateContext<TGainUser86> context) {
    }

    @Override
    public void postDelete(TGainUser86 entity, PostDeleteContext<TGainUser86> context) {
    }
}
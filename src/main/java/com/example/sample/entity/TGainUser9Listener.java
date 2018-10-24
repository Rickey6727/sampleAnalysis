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
public class TGainUser9Listener implements EntityListener<TGainUser9> {

    @Override
    public void preInsert(TGainUser9 entity, PreInsertContext<TGainUser9> context) {
    }

    @Override
    public void preUpdate(TGainUser9 entity, PreUpdateContext<TGainUser9> context) {
    }

    @Override
    public void preDelete(TGainUser9 entity, PreDeleteContext<TGainUser9> context) {
    }

    @Override
    public void postInsert(TGainUser9 entity, PostInsertContext<TGainUser9> context) {
    }

    @Override
    public void postUpdate(TGainUser9 entity, PostUpdateContext<TGainUser9> context) {
    }

    @Override
    public void postDelete(TGainUser9 entity, PostDeleteContext<TGainUser9> context) {
    }
}
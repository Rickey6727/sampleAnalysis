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
public class TGainUser80Listener implements EntityListener<TGainUser80> {

    @Override
    public void preInsert(TGainUser80 entity, PreInsertContext<TGainUser80> context) {
    }

    @Override
    public void preUpdate(TGainUser80 entity, PreUpdateContext<TGainUser80> context) {
    }

    @Override
    public void preDelete(TGainUser80 entity, PreDeleteContext<TGainUser80> context) {
    }

    @Override
    public void postInsert(TGainUser80 entity, PostInsertContext<TGainUser80> context) {
    }

    @Override
    public void postUpdate(TGainUser80 entity, PostUpdateContext<TGainUser80> context) {
    }

    @Override
    public void postDelete(TGainUser80 entity, PostDeleteContext<TGainUser80> context) {
    }
}
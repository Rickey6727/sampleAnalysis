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
public class TGainUser45Listener implements EntityListener<TGainUser45> {

    @Override
    public void preInsert(TGainUser45 entity, PreInsertContext<TGainUser45> context) {
    }

    @Override
    public void preUpdate(TGainUser45 entity, PreUpdateContext<TGainUser45> context) {
    }

    @Override
    public void preDelete(TGainUser45 entity, PreDeleteContext<TGainUser45> context) {
    }

    @Override
    public void postInsert(TGainUser45 entity, PostInsertContext<TGainUser45> context) {
    }

    @Override
    public void postUpdate(TGainUser45 entity, PostUpdateContext<TGainUser45> context) {
    }

    @Override
    public void postDelete(TGainUser45 entity, PostDeleteContext<TGainUser45> context) {
    }
}
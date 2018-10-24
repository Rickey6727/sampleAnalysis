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
public class TGainUser96Listener implements EntityListener<TGainUser96> {

    @Override
    public void preInsert(TGainUser96 entity, PreInsertContext<TGainUser96> context) {
    }

    @Override
    public void preUpdate(TGainUser96 entity, PreUpdateContext<TGainUser96> context) {
    }

    @Override
    public void preDelete(TGainUser96 entity, PreDeleteContext<TGainUser96> context) {
    }

    @Override
    public void postInsert(TGainUser96 entity, PostInsertContext<TGainUser96> context) {
    }

    @Override
    public void postUpdate(TGainUser96 entity, PostUpdateContext<TGainUser96> context) {
    }

    @Override
    public void postDelete(TGainUser96 entity, PostDeleteContext<TGainUser96> context) {
    }
}
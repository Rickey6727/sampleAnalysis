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
public class TGainUser31Listener implements EntityListener<TGainUser31> {

    @Override
    public void preInsert(TGainUser31 entity, PreInsertContext<TGainUser31> context) {
    }

    @Override
    public void preUpdate(TGainUser31 entity, PreUpdateContext<TGainUser31> context) {
    }

    @Override
    public void preDelete(TGainUser31 entity, PreDeleteContext<TGainUser31> context) {
    }

    @Override
    public void postInsert(TGainUser31 entity, PostInsertContext<TGainUser31> context) {
    }

    @Override
    public void postUpdate(TGainUser31 entity, PostUpdateContext<TGainUser31> context) {
    }

    @Override
    public void postDelete(TGainUser31 entity, PostDeleteContext<TGainUser31> context) {
    }
}
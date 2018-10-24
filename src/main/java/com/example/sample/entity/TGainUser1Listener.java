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
public class TGainUser1Listener implements EntityListener<TGainUser1> {

    @Override
    public void preInsert(TGainUser1 entity, PreInsertContext<TGainUser1> context) {
    }

    @Override
    public void preUpdate(TGainUser1 entity, PreUpdateContext<TGainUser1> context) {
    }

    @Override
    public void preDelete(TGainUser1 entity, PreDeleteContext<TGainUser1> context) {
    }

    @Override
    public void postInsert(TGainUser1 entity, PostInsertContext<TGainUser1> context) {
    }

    @Override
    public void postUpdate(TGainUser1 entity, PostUpdateContext<TGainUser1> context) {
    }

    @Override
    public void postDelete(TGainUser1 entity, PostDeleteContext<TGainUser1> context) {
    }
}
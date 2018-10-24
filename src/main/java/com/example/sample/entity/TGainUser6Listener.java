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
public class TGainUser6Listener implements EntityListener<TGainUser6> {

    @Override
    public void preInsert(TGainUser6 entity, PreInsertContext<TGainUser6> context) {
    }

    @Override
    public void preUpdate(TGainUser6 entity, PreUpdateContext<TGainUser6> context) {
    }

    @Override
    public void preDelete(TGainUser6 entity, PreDeleteContext<TGainUser6> context) {
    }

    @Override
    public void postInsert(TGainUser6 entity, PostInsertContext<TGainUser6> context) {
    }

    @Override
    public void postUpdate(TGainUser6 entity, PostUpdateContext<TGainUser6> context) {
    }

    @Override
    public void postDelete(TGainUser6 entity, PostDeleteContext<TGainUser6> context) {
    }
}
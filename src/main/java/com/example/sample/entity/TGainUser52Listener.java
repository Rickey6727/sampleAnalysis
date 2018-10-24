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
public class TGainUser52Listener implements EntityListener<TGainUser52> {

    @Override
    public void preInsert(TGainUser52 entity, PreInsertContext<TGainUser52> context) {
    }

    @Override
    public void preUpdate(TGainUser52 entity, PreUpdateContext<TGainUser52> context) {
    }

    @Override
    public void preDelete(TGainUser52 entity, PreDeleteContext<TGainUser52> context) {
    }

    @Override
    public void postInsert(TGainUser52 entity, PostInsertContext<TGainUser52> context) {
    }

    @Override
    public void postUpdate(TGainUser52 entity, PostUpdateContext<TGainUser52> context) {
    }

    @Override
    public void postDelete(TGainUser52 entity, PostDeleteContext<TGainUser52> context) {
    }
}
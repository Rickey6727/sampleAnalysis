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
public class TGainUser18Listener implements EntityListener<TGainUser18> {

    @Override
    public void preInsert(TGainUser18 entity, PreInsertContext<TGainUser18> context) {
    }

    @Override
    public void preUpdate(TGainUser18 entity, PreUpdateContext<TGainUser18> context) {
    }

    @Override
    public void preDelete(TGainUser18 entity, PreDeleteContext<TGainUser18> context) {
    }

    @Override
    public void postInsert(TGainUser18 entity, PostInsertContext<TGainUser18> context) {
    }

    @Override
    public void postUpdate(TGainUser18 entity, PostUpdateContext<TGainUser18> context) {
    }

    @Override
    public void postDelete(TGainUser18 entity, PostDeleteContext<TGainUser18> context) {
    }
}
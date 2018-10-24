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
public class TGainUser75Listener implements EntityListener<TGainUser75> {

    @Override
    public void preInsert(TGainUser75 entity, PreInsertContext<TGainUser75> context) {
    }

    @Override
    public void preUpdate(TGainUser75 entity, PreUpdateContext<TGainUser75> context) {
    }

    @Override
    public void preDelete(TGainUser75 entity, PreDeleteContext<TGainUser75> context) {
    }

    @Override
    public void postInsert(TGainUser75 entity, PostInsertContext<TGainUser75> context) {
    }

    @Override
    public void postUpdate(TGainUser75 entity, PostUpdateContext<TGainUser75> context) {
    }

    @Override
    public void postDelete(TGainUser75 entity, PostDeleteContext<TGainUser75> context) {
    }
}
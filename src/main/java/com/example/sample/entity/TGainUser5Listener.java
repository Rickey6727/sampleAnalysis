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
public class TGainUser5Listener implements EntityListener<TGainUser5> {

    @Override
    public void preInsert(TGainUser5 entity, PreInsertContext<TGainUser5> context) {
    }

    @Override
    public void preUpdate(TGainUser5 entity, PreUpdateContext<TGainUser5> context) {
    }

    @Override
    public void preDelete(TGainUser5 entity, PreDeleteContext<TGainUser5> context) {
    }

    @Override
    public void postInsert(TGainUser5 entity, PostInsertContext<TGainUser5> context) {
    }

    @Override
    public void postUpdate(TGainUser5 entity, PostUpdateContext<TGainUser5> context) {
    }

    @Override
    public void postDelete(TGainUser5 entity, PostDeleteContext<TGainUser5> context) {
    }
}
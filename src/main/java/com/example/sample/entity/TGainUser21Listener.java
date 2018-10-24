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
public class TGainUser21Listener implements EntityListener<TGainUser21> {

    @Override
    public void preInsert(TGainUser21 entity, PreInsertContext<TGainUser21> context) {
    }

    @Override
    public void preUpdate(TGainUser21 entity, PreUpdateContext<TGainUser21> context) {
    }

    @Override
    public void preDelete(TGainUser21 entity, PreDeleteContext<TGainUser21> context) {
    }

    @Override
    public void postInsert(TGainUser21 entity, PostInsertContext<TGainUser21> context) {
    }

    @Override
    public void postUpdate(TGainUser21 entity, PostUpdateContext<TGainUser21> context) {
    }

    @Override
    public void postDelete(TGainUser21 entity, PostDeleteContext<TGainUser21> context) {
    }
}
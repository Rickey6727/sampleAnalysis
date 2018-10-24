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
public class TGainUser14Listener implements EntityListener<TGainUser14> {

    @Override
    public void preInsert(TGainUser14 entity, PreInsertContext<TGainUser14> context) {
    }

    @Override
    public void preUpdate(TGainUser14 entity, PreUpdateContext<TGainUser14> context) {
    }

    @Override
    public void preDelete(TGainUser14 entity, PreDeleteContext<TGainUser14> context) {
    }

    @Override
    public void postInsert(TGainUser14 entity, PostInsertContext<TGainUser14> context) {
    }

    @Override
    public void postUpdate(TGainUser14 entity, PostUpdateContext<TGainUser14> context) {
    }

    @Override
    public void postDelete(TGainUser14 entity, PostDeleteContext<TGainUser14> context) {
    }
}
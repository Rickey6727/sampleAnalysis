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
public class TGainUser28Listener implements EntityListener<TGainUser28> {

    @Override
    public void preInsert(TGainUser28 entity, PreInsertContext<TGainUser28> context) {
    }

    @Override
    public void preUpdate(TGainUser28 entity, PreUpdateContext<TGainUser28> context) {
    }

    @Override
    public void preDelete(TGainUser28 entity, PreDeleteContext<TGainUser28> context) {
    }

    @Override
    public void postInsert(TGainUser28 entity, PostInsertContext<TGainUser28> context) {
    }

    @Override
    public void postUpdate(TGainUser28 entity, PostUpdateContext<TGainUser28> context) {
    }

    @Override
    public void postDelete(TGainUser28 entity, PostDeleteContext<TGainUser28> context) {
    }
}
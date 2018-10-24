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
public class TGainUser26Listener implements EntityListener<TGainUser26> {

    @Override
    public void preInsert(TGainUser26 entity, PreInsertContext<TGainUser26> context) {
    }

    @Override
    public void preUpdate(TGainUser26 entity, PreUpdateContext<TGainUser26> context) {
    }

    @Override
    public void preDelete(TGainUser26 entity, PreDeleteContext<TGainUser26> context) {
    }

    @Override
    public void postInsert(TGainUser26 entity, PostInsertContext<TGainUser26> context) {
    }

    @Override
    public void postUpdate(TGainUser26 entity, PostUpdateContext<TGainUser26> context) {
    }

    @Override
    public void postDelete(TGainUser26 entity, PostDeleteContext<TGainUser26> context) {
    }
}
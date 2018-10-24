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
public class TGainUser11Listener implements EntityListener<TGainUser11> {

    @Override
    public void preInsert(TGainUser11 entity, PreInsertContext<TGainUser11> context) {
    }

    @Override
    public void preUpdate(TGainUser11 entity, PreUpdateContext<TGainUser11> context) {
    }

    @Override
    public void preDelete(TGainUser11 entity, PreDeleteContext<TGainUser11> context) {
    }

    @Override
    public void postInsert(TGainUser11 entity, PostInsertContext<TGainUser11> context) {
    }

    @Override
    public void postUpdate(TGainUser11 entity, PostUpdateContext<TGainUser11> context) {
    }

    @Override
    public void postDelete(TGainUser11 entity, PostDeleteContext<TGainUser11> context) {
    }
}
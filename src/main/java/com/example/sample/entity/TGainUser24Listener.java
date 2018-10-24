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
public class TGainUser24Listener implements EntityListener<TGainUser24> {

    @Override
    public void preInsert(TGainUser24 entity, PreInsertContext<TGainUser24> context) {
    }

    @Override
    public void preUpdate(TGainUser24 entity, PreUpdateContext<TGainUser24> context) {
    }

    @Override
    public void preDelete(TGainUser24 entity, PreDeleteContext<TGainUser24> context) {
    }

    @Override
    public void postInsert(TGainUser24 entity, PostInsertContext<TGainUser24> context) {
    }

    @Override
    public void postUpdate(TGainUser24 entity, PostUpdateContext<TGainUser24> context) {
    }

    @Override
    public void postDelete(TGainUser24 entity, PostDeleteContext<TGainUser24> context) {
    }
}
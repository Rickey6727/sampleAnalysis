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
public class TGainUser10Listener implements EntityListener<TGainUser10> {

    @Override
    public void preInsert(TGainUser10 entity, PreInsertContext<TGainUser10> context) {
    }

    @Override
    public void preUpdate(TGainUser10 entity, PreUpdateContext<TGainUser10> context) {
    }

    @Override
    public void preDelete(TGainUser10 entity, PreDeleteContext<TGainUser10> context) {
    }

    @Override
    public void postInsert(TGainUser10 entity, PostInsertContext<TGainUser10> context) {
    }

    @Override
    public void postUpdate(TGainUser10 entity, PostUpdateContext<TGainUser10> context) {
    }

    @Override
    public void postDelete(TGainUser10 entity, PostDeleteContext<TGainUser10> context) {
    }
}
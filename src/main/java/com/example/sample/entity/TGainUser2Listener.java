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
public class TGainUser2Listener implements EntityListener<TGainUser2> {

    @Override
    public void preInsert(TGainUser2 entity, PreInsertContext<TGainUser2> context) {
    }

    @Override
    public void preUpdate(TGainUser2 entity, PreUpdateContext<TGainUser2> context) {
    }

    @Override
    public void preDelete(TGainUser2 entity, PreDeleteContext<TGainUser2> context) {
    }

    @Override
    public void postInsert(TGainUser2 entity, PostInsertContext<TGainUser2> context) {
    }

    @Override
    public void postUpdate(TGainUser2 entity, PostUpdateContext<TGainUser2> context) {
    }

    @Override
    public void postDelete(TGainUser2 entity, PostDeleteContext<TGainUser2> context) {
    }
}
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
public class TGainUser4Listener implements EntityListener<TGainUser4> {

    @Override
    public void preInsert(TGainUser4 entity, PreInsertContext<TGainUser4> context) {
    }

    @Override
    public void preUpdate(TGainUser4 entity, PreUpdateContext<TGainUser4> context) {
    }

    @Override
    public void preDelete(TGainUser4 entity, PreDeleteContext<TGainUser4> context) {
    }

    @Override
    public void postInsert(TGainUser4 entity, PostInsertContext<TGainUser4> context) {
    }

    @Override
    public void postUpdate(TGainUser4 entity, PostUpdateContext<TGainUser4> context) {
    }

    @Override
    public void postDelete(TGainUser4 entity, PostDeleteContext<TGainUser4> context) {
    }
}
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
public class TGainUser20Listener implements EntityListener<TGainUser20> {

    @Override
    public void preInsert(TGainUser20 entity, PreInsertContext<TGainUser20> context) {
    }

    @Override
    public void preUpdate(TGainUser20 entity, PreUpdateContext<TGainUser20> context) {
    }

    @Override
    public void preDelete(TGainUser20 entity, PreDeleteContext<TGainUser20> context) {
    }

    @Override
    public void postInsert(TGainUser20 entity, PostInsertContext<TGainUser20> context) {
    }

    @Override
    public void postUpdate(TGainUser20 entity, PostUpdateContext<TGainUser20> context) {
    }

    @Override
    public void postDelete(TGainUser20 entity, PostDeleteContext<TGainUser20> context) {
    }
}
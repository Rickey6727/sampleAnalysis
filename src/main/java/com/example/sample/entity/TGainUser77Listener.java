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
public class TGainUser77Listener implements EntityListener<TGainUser77> {

    @Override
    public void preInsert(TGainUser77 entity, PreInsertContext<TGainUser77> context) {
    }

    @Override
    public void preUpdate(TGainUser77 entity, PreUpdateContext<TGainUser77> context) {
    }

    @Override
    public void preDelete(TGainUser77 entity, PreDeleteContext<TGainUser77> context) {
    }

    @Override
    public void postInsert(TGainUser77 entity, PostInsertContext<TGainUser77> context) {
    }

    @Override
    public void postUpdate(TGainUser77 entity, PostUpdateContext<TGainUser77> context) {
    }

    @Override
    public void postDelete(TGainUser77 entity, PostDeleteContext<TGainUser77> context) {
    }
}
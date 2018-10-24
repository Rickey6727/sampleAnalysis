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
public class TGainUser25Listener implements EntityListener<TGainUser25> {

    @Override
    public void preInsert(TGainUser25 entity, PreInsertContext<TGainUser25> context) {
    }

    @Override
    public void preUpdate(TGainUser25 entity, PreUpdateContext<TGainUser25> context) {
    }

    @Override
    public void preDelete(TGainUser25 entity, PreDeleteContext<TGainUser25> context) {
    }

    @Override
    public void postInsert(TGainUser25 entity, PostInsertContext<TGainUser25> context) {
    }

    @Override
    public void postUpdate(TGainUser25 entity, PostUpdateContext<TGainUser25> context) {
    }

    @Override
    public void postDelete(TGainUser25 entity, PostDeleteContext<TGainUser25> context) {
    }
}
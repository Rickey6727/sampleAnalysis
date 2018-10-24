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
public class TGainUser17Listener implements EntityListener<TGainUser17> {

    @Override
    public void preInsert(TGainUser17 entity, PreInsertContext<TGainUser17> context) {
    }

    @Override
    public void preUpdate(TGainUser17 entity, PreUpdateContext<TGainUser17> context) {
    }

    @Override
    public void preDelete(TGainUser17 entity, PreDeleteContext<TGainUser17> context) {
    }

    @Override
    public void postInsert(TGainUser17 entity, PostInsertContext<TGainUser17> context) {
    }

    @Override
    public void postUpdate(TGainUser17 entity, PostUpdateContext<TGainUser17> context) {
    }

    @Override
    public void postDelete(TGainUser17 entity, PostDeleteContext<TGainUser17> context) {
    }
}
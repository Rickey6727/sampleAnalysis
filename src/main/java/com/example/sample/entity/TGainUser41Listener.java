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
public class TGainUser41Listener implements EntityListener<TGainUser41> {

    @Override
    public void preInsert(TGainUser41 entity, PreInsertContext<TGainUser41> context) {
    }

    @Override
    public void preUpdate(TGainUser41 entity, PreUpdateContext<TGainUser41> context) {
    }

    @Override
    public void preDelete(TGainUser41 entity, PreDeleteContext<TGainUser41> context) {
    }

    @Override
    public void postInsert(TGainUser41 entity, PostInsertContext<TGainUser41> context) {
    }

    @Override
    public void postUpdate(TGainUser41 entity, PostUpdateContext<TGainUser41> context) {
    }

    @Override
    public void postDelete(TGainUser41 entity, PostDeleteContext<TGainUser41> context) {
    }
}
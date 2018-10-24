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
public class TGainUser94Listener implements EntityListener<TGainUser94> {

    @Override
    public void preInsert(TGainUser94 entity, PreInsertContext<TGainUser94> context) {
    }

    @Override
    public void preUpdate(TGainUser94 entity, PreUpdateContext<TGainUser94> context) {
    }

    @Override
    public void preDelete(TGainUser94 entity, PreDeleteContext<TGainUser94> context) {
    }

    @Override
    public void postInsert(TGainUser94 entity, PostInsertContext<TGainUser94> context) {
    }

    @Override
    public void postUpdate(TGainUser94 entity, PostUpdateContext<TGainUser94> context) {
    }

    @Override
    public void postDelete(TGainUser94 entity, PostDeleteContext<TGainUser94> context) {
    }
}
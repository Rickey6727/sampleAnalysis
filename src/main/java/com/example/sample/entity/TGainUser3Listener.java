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
public class TGainUser3Listener implements EntityListener<TGainUser3> {

    @Override
    public void preInsert(TGainUser3 entity, PreInsertContext<TGainUser3> context) {
    }

    @Override
    public void preUpdate(TGainUser3 entity, PreUpdateContext<TGainUser3> context) {
    }

    @Override
    public void preDelete(TGainUser3 entity, PreDeleteContext<TGainUser3> context) {
    }

    @Override
    public void postInsert(TGainUser3 entity, PostInsertContext<TGainUser3> context) {
    }

    @Override
    public void postUpdate(TGainUser3 entity, PostUpdateContext<TGainUser3> context) {
    }

    @Override
    public void postDelete(TGainUser3 entity, PostDeleteContext<TGainUser3> context) {
    }
}
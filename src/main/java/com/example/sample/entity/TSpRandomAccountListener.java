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
public class TSpRandomAccountListener implements EntityListener<TSpRandomAccount> {

    @Override
    public void preInsert(TSpRandomAccount entity, PreInsertContext<TSpRandomAccount> context) {
    }

    @Override
    public void preUpdate(TSpRandomAccount entity, PreUpdateContext<TSpRandomAccount> context) {
    }

    @Override
    public void preDelete(TSpRandomAccount entity, PreDeleteContext<TSpRandomAccount> context) {
    }

    @Override
    public void postInsert(TSpRandomAccount entity, PostInsertContext<TSpRandomAccount> context) {
    }

    @Override
    public void postUpdate(TSpRandomAccount entity, PostUpdateContext<TSpRandomAccount> context) {
    }

    @Override
    public void postDelete(TSpRandomAccount entity, PostDeleteContext<TSpRandomAccount> context) {
    }
}
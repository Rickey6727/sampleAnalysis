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
public class TBlockAccount5Listener implements EntityListener<TBlockAccount5> {

    @Override
    public void preInsert(TBlockAccount5 entity, PreInsertContext<TBlockAccount5> context) {
    }

    @Override
    public void preUpdate(TBlockAccount5 entity, PreUpdateContext<TBlockAccount5> context) {
    }

    @Override
    public void preDelete(TBlockAccount5 entity, PreDeleteContext<TBlockAccount5> context) {
    }

    @Override
    public void postInsert(TBlockAccount5 entity, PostInsertContext<TBlockAccount5> context) {
    }

    @Override
    public void postUpdate(TBlockAccount5 entity, PostUpdateContext<TBlockAccount5> context) {
    }

    @Override
    public void postDelete(TBlockAccount5 entity, PostDeleteContext<TBlockAccount5> context) {
    }
}
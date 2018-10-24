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
public class TBlockAccount4Listener implements EntityListener<TBlockAccount4> {

    @Override
    public void preInsert(TBlockAccount4 entity, PreInsertContext<TBlockAccount4> context) {
    }

    @Override
    public void preUpdate(TBlockAccount4 entity, PreUpdateContext<TBlockAccount4> context) {
    }

    @Override
    public void preDelete(TBlockAccount4 entity, PreDeleteContext<TBlockAccount4> context) {
    }

    @Override
    public void postInsert(TBlockAccount4 entity, PostInsertContext<TBlockAccount4> context) {
    }

    @Override
    public void postUpdate(TBlockAccount4 entity, PostUpdateContext<TBlockAccount4> context) {
    }

    @Override
    public void postDelete(TBlockAccount4 entity, PostDeleteContext<TBlockAccount4> context) {
    }
}
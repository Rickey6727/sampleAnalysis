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
public class TBlockAccount10Listener implements EntityListener<TBlockAccount10> {

    @Override
    public void preInsert(TBlockAccount10 entity, PreInsertContext<TBlockAccount10> context) {
    }

    @Override
    public void preUpdate(TBlockAccount10 entity, PreUpdateContext<TBlockAccount10> context) {
    }

    @Override
    public void preDelete(TBlockAccount10 entity, PreDeleteContext<TBlockAccount10> context) {
    }

    @Override
    public void postInsert(TBlockAccount10 entity, PostInsertContext<TBlockAccount10> context) {
    }

    @Override
    public void postUpdate(TBlockAccount10 entity, PostUpdateContext<TBlockAccount10> context) {
    }

    @Override
    public void postDelete(TBlockAccount10 entity, PostDeleteContext<TBlockAccount10> context) {
    }
}
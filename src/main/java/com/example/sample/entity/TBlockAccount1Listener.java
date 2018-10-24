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
public class TBlockAccount1Listener implements EntityListener<TBlockAccount1> {

    @Override
    public void preInsert(TBlockAccount1 entity, PreInsertContext<TBlockAccount1> context) {
    }

    @Override
    public void preUpdate(TBlockAccount1 entity, PreUpdateContext<TBlockAccount1> context) {
    }

    @Override
    public void preDelete(TBlockAccount1 entity, PreDeleteContext<TBlockAccount1> context) {
    }

    @Override
    public void postInsert(TBlockAccount1 entity, PostInsertContext<TBlockAccount1> context) {
    }

    @Override
    public void postUpdate(TBlockAccount1 entity, PostUpdateContext<TBlockAccount1> context) {
    }

    @Override
    public void postDelete(TBlockAccount1 entity, PostDeleteContext<TBlockAccount1> context) {
    }
}
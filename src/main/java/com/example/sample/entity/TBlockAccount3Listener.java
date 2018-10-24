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
public class TBlockAccount3Listener implements EntityListener<TBlockAccount3> {

    @Override
    public void preInsert(TBlockAccount3 entity, PreInsertContext<TBlockAccount3> context) {
    }

    @Override
    public void preUpdate(TBlockAccount3 entity, PreUpdateContext<TBlockAccount3> context) {
    }

    @Override
    public void preDelete(TBlockAccount3 entity, PreDeleteContext<TBlockAccount3> context) {
    }

    @Override
    public void postInsert(TBlockAccount3 entity, PostInsertContext<TBlockAccount3> context) {
    }

    @Override
    public void postUpdate(TBlockAccount3 entity, PostUpdateContext<TBlockAccount3> context) {
    }

    @Override
    public void postDelete(TBlockAccount3 entity, PostDeleteContext<TBlockAccount3> context) {
    }
}
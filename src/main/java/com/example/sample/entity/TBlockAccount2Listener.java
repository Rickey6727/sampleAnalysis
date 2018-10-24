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
public class TBlockAccount2Listener implements EntityListener<TBlockAccount2> {

    @Override
    public void preInsert(TBlockAccount2 entity, PreInsertContext<TBlockAccount2> context) {
    }

    @Override
    public void preUpdate(TBlockAccount2 entity, PreUpdateContext<TBlockAccount2> context) {
    }

    @Override
    public void preDelete(TBlockAccount2 entity, PreDeleteContext<TBlockAccount2> context) {
    }

    @Override
    public void postInsert(TBlockAccount2 entity, PostInsertContext<TBlockAccount2> context) {
    }

    @Override
    public void postUpdate(TBlockAccount2 entity, PostUpdateContext<TBlockAccount2> context) {
    }

    @Override
    public void postDelete(TBlockAccount2 entity, PostDeleteContext<TBlockAccount2> context) {
    }
}
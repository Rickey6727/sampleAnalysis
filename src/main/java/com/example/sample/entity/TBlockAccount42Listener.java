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
public class TBlockAccount42Listener implements EntityListener<TBlockAccount42> {

    @Override
    public void preInsert(TBlockAccount42 entity, PreInsertContext<TBlockAccount42> context) {
    }

    @Override
    public void preUpdate(TBlockAccount42 entity, PreUpdateContext<TBlockAccount42> context) {
    }

    @Override
    public void preDelete(TBlockAccount42 entity, PreDeleteContext<TBlockAccount42> context) {
    }

    @Override
    public void postInsert(TBlockAccount42 entity, PostInsertContext<TBlockAccount42> context) {
    }

    @Override
    public void postUpdate(TBlockAccount42 entity, PostUpdateContext<TBlockAccount42> context) {
    }

    @Override
    public void postDelete(TBlockAccount42 entity, PostDeleteContext<TBlockAccount42> context) {
    }
}
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
public class TNewMarkState64Listener implements EntityListener<TNewMarkState64> {

    @Override
    public void preInsert(TNewMarkState64 entity, PreInsertContext<TNewMarkState64> context) {
    }

    @Override
    public void preUpdate(TNewMarkState64 entity, PreUpdateContext<TNewMarkState64> context) {
    }

    @Override
    public void preDelete(TNewMarkState64 entity, PreDeleteContext<TNewMarkState64> context) {
    }

    @Override
    public void postInsert(TNewMarkState64 entity, PostInsertContext<TNewMarkState64> context) {
    }

    @Override
    public void postUpdate(TNewMarkState64 entity, PostUpdateContext<TNewMarkState64> context) {
    }

    @Override
    public void postDelete(TNewMarkState64 entity, PostDeleteContext<TNewMarkState64> context) {
    }
}
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
public class TNewMarkState8Listener implements EntityListener<TNewMarkState8> {

    @Override
    public void preInsert(TNewMarkState8 entity, PreInsertContext<TNewMarkState8> context) {
    }

    @Override
    public void preUpdate(TNewMarkState8 entity, PreUpdateContext<TNewMarkState8> context) {
    }

    @Override
    public void preDelete(TNewMarkState8 entity, PreDeleteContext<TNewMarkState8> context) {
    }

    @Override
    public void postInsert(TNewMarkState8 entity, PostInsertContext<TNewMarkState8> context) {
    }

    @Override
    public void postUpdate(TNewMarkState8 entity, PostUpdateContext<TNewMarkState8> context) {
    }

    @Override
    public void postDelete(TNewMarkState8 entity, PostDeleteContext<TNewMarkState8> context) {
    }
}
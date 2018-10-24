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
public class TNewMarkState20Listener implements EntityListener<TNewMarkState20> {

    @Override
    public void preInsert(TNewMarkState20 entity, PreInsertContext<TNewMarkState20> context) {
    }

    @Override
    public void preUpdate(TNewMarkState20 entity, PreUpdateContext<TNewMarkState20> context) {
    }

    @Override
    public void preDelete(TNewMarkState20 entity, PreDeleteContext<TNewMarkState20> context) {
    }

    @Override
    public void postInsert(TNewMarkState20 entity, PostInsertContext<TNewMarkState20> context) {
    }

    @Override
    public void postUpdate(TNewMarkState20 entity, PostUpdateContext<TNewMarkState20> context) {
    }

    @Override
    public void postDelete(TNewMarkState20 entity, PostDeleteContext<TNewMarkState20> context) {
    }
}
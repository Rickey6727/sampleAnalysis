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
public class TNewMarkState10Listener implements EntityListener<TNewMarkState10> {

    @Override
    public void preInsert(TNewMarkState10 entity, PreInsertContext<TNewMarkState10> context) {
    }

    @Override
    public void preUpdate(TNewMarkState10 entity, PreUpdateContext<TNewMarkState10> context) {
    }

    @Override
    public void preDelete(TNewMarkState10 entity, PreDeleteContext<TNewMarkState10> context) {
    }

    @Override
    public void postInsert(TNewMarkState10 entity, PostInsertContext<TNewMarkState10> context) {
    }

    @Override
    public void postUpdate(TNewMarkState10 entity, PostUpdateContext<TNewMarkState10> context) {
    }

    @Override
    public void postDelete(TNewMarkState10 entity, PostDeleteContext<TNewMarkState10> context) {
    }
}
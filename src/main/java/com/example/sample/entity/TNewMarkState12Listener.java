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
public class TNewMarkState12Listener implements EntityListener<TNewMarkState12> {

    @Override
    public void preInsert(TNewMarkState12 entity, PreInsertContext<TNewMarkState12> context) {
    }

    @Override
    public void preUpdate(TNewMarkState12 entity, PreUpdateContext<TNewMarkState12> context) {
    }

    @Override
    public void preDelete(TNewMarkState12 entity, PreDeleteContext<TNewMarkState12> context) {
    }

    @Override
    public void postInsert(TNewMarkState12 entity, PostInsertContext<TNewMarkState12> context) {
    }

    @Override
    public void postUpdate(TNewMarkState12 entity, PostUpdateContext<TNewMarkState12> context) {
    }

    @Override
    public void postDelete(TNewMarkState12 entity, PostDeleteContext<TNewMarkState12> context) {
    }
}
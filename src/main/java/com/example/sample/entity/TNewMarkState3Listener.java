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
public class TNewMarkState3Listener implements EntityListener<TNewMarkState3> {

    @Override
    public void preInsert(TNewMarkState3 entity, PreInsertContext<TNewMarkState3> context) {
    }

    @Override
    public void preUpdate(TNewMarkState3 entity, PreUpdateContext<TNewMarkState3> context) {
    }

    @Override
    public void preDelete(TNewMarkState3 entity, PreDeleteContext<TNewMarkState3> context) {
    }

    @Override
    public void postInsert(TNewMarkState3 entity, PostInsertContext<TNewMarkState3> context) {
    }

    @Override
    public void postUpdate(TNewMarkState3 entity, PostUpdateContext<TNewMarkState3> context) {
    }

    @Override
    public void postDelete(TNewMarkState3 entity, PostDeleteContext<TNewMarkState3> context) {
    }
}
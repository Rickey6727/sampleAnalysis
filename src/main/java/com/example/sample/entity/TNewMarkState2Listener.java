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
public class TNewMarkState2Listener implements EntityListener<TNewMarkState2> {

    @Override
    public void preInsert(TNewMarkState2 entity, PreInsertContext<TNewMarkState2> context) {
    }

    @Override
    public void preUpdate(TNewMarkState2 entity, PreUpdateContext<TNewMarkState2> context) {
    }

    @Override
    public void preDelete(TNewMarkState2 entity, PreDeleteContext<TNewMarkState2> context) {
    }

    @Override
    public void postInsert(TNewMarkState2 entity, PostInsertContext<TNewMarkState2> context) {
    }

    @Override
    public void postUpdate(TNewMarkState2 entity, PostUpdateContext<TNewMarkState2> context) {
    }

    @Override
    public void postDelete(TNewMarkState2 entity, PostDeleteContext<TNewMarkState2> context) {
    }
}
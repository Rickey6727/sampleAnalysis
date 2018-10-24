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
public class TNewMarkState1Listener implements EntityListener<TNewMarkState1> {

    @Override
    public void preInsert(TNewMarkState1 entity, PreInsertContext<TNewMarkState1> context) {
    }

    @Override
    public void preUpdate(TNewMarkState1 entity, PreUpdateContext<TNewMarkState1> context) {
    }

    @Override
    public void preDelete(TNewMarkState1 entity, PreDeleteContext<TNewMarkState1> context) {
    }

    @Override
    public void postInsert(TNewMarkState1 entity, PostInsertContext<TNewMarkState1> context) {
    }

    @Override
    public void postUpdate(TNewMarkState1 entity, PostUpdateContext<TNewMarkState1> context) {
    }

    @Override
    public void postDelete(TNewMarkState1 entity, PostDeleteContext<TNewMarkState1> context) {
    }
}
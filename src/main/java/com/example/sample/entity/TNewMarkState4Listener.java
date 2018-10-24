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
public class TNewMarkState4Listener implements EntityListener<TNewMarkState4> {

    @Override
    public void preInsert(TNewMarkState4 entity, PreInsertContext<TNewMarkState4> context) {
    }

    @Override
    public void preUpdate(TNewMarkState4 entity, PreUpdateContext<TNewMarkState4> context) {
    }

    @Override
    public void preDelete(TNewMarkState4 entity, PreDeleteContext<TNewMarkState4> context) {
    }

    @Override
    public void postInsert(TNewMarkState4 entity, PostInsertContext<TNewMarkState4> context) {
    }

    @Override
    public void postUpdate(TNewMarkState4 entity, PostUpdateContext<TNewMarkState4> context) {
    }

    @Override
    public void postDelete(TNewMarkState4 entity, PostDeleteContext<TNewMarkState4> context) {
    }
}
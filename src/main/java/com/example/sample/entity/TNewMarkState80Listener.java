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
public class TNewMarkState80Listener implements EntityListener<TNewMarkState80> {

    @Override
    public void preInsert(TNewMarkState80 entity, PreInsertContext<TNewMarkState80> context) {
    }

    @Override
    public void preUpdate(TNewMarkState80 entity, PreUpdateContext<TNewMarkState80> context) {
    }

    @Override
    public void preDelete(TNewMarkState80 entity, PreDeleteContext<TNewMarkState80> context) {
    }

    @Override
    public void postInsert(TNewMarkState80 entity, PostInsertContext<TNewMarkState80> context) {
    }

    @Override
    public void postUpdate(TNewMarkState80 entity, PostUpdateContext<TNewMarkState80> context) {
    }

    @Override
    public void postDelete(TNewMarkState80 entity, PostDeleteContext<TNewMarkState80> context) {
    }
}
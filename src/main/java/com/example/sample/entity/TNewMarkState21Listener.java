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
public class TNewMarkState21Listener implements EntityListener<TNewMarkState21> {

    @Override
    public void preInsert(TNewMarkState21 entity, PreInsertContext<TNewMarkState21> context) {
    }

    @Override
    public void preUpdate(TNewMarkState21 entity, PreUpdateContext<TNewMarkState21> context) {
    }

    @Override
    public void preDelete(TNewMarkState21 entity, PreDeleteContext<TNewMarkState21> context) {
    }

    @Override
    public void postInsert(TNewMarkState21 entity, PostInsertContext<TNewMarkState21> context) {
    }

    @Override
    public void postUpdate(TNewMarkState21 entity, PostUpdateContext<TNewMarkState21> context) {
    }

    @Override
    public void postDelete(TNewMarkState21 entity, PostDeleteContext<TNewMarkState21> context) {
    }
}
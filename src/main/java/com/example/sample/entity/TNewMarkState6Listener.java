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
public class TNewMarkState6Listener implements EntityListener<TNewMarkState6> {

    @Override
    public void preInsert(TNewMarkState6 entity, PreInsertContext<TNewMarkState6> context) {
    }

    @Override
    public void preUpdate(TNewMarkState6 entity, PreUpdateContext<TNewMarkState6> context) {
    }

    @Override
    public void preDelete(TNewMarkState6 entity, PreDeleteContext<TNewMarkState6> context) {
    }

    @Override
    public void postInsert(TNewMarkState6 entity, PostInsertContext<TNewMarkState6> context) {
    }

    @Override
    public void postUpdate(TNewMarkState6 entity, PostUpdateContext<TNewMarkState6> context) {
    }

    @Override
    public void postDelete(TNewMarkState6 entity, PostDeleteContext<TNewMarkState6> context) {
    }
}
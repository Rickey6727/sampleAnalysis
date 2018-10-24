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
public class TNewMarkState99Listener implements EntityListener<TNewMarkState99> {

    @Override
    public void preInsert(TNewMarkState99 entity, PreInsertContext<TNewMarkState99> context) {
    }

    @Override
    public void preUpdate(TNewMarkState99 entity, PreUpdateContext<TNewMarkState99> context) {
    }

    @Override
    public void preDelete(TNewMarkState99 entity, PreDeleteContext<TNewMarkState99> context) {
    }

    @Override
    public void postInsert(TNewMarkState99 entity, PostInsertContext<TNewMarkState99> context) {
    }

    @Override
    public void postUpdate(TNewMarkState99 entity, PostUpdateContext<TNewMarkState99> context) {
    }

    @Override
    public void postDelete(TNewMarkState99 entity, PostDeleteContext<TNewMarkState99> context) {
    }
}
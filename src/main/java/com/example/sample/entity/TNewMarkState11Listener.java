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
public class TNewMarkState11Listener implements EntityListener<TNewMarkState11> {

    @Override
    public void preInsert(TNewMarkState11 entity, PreInsertContext<TNewMarkState11> context) {
    }

    @Override
    public void preUpdate(TNewMarkState11 entity, PreUpdateContext<TNewMarkState11> context) {
    }

    @Override
    public void preDelete(TNewMarkState11 entity, PreDeleteContext<TNewMarkState11> context) {
    }

    @Override
    public void postInsert(TNewMarkState11 entity, PostInsertContext<TNewMarkState11> context) {
    }

    @Override
    public void postUpdate(TNewMarkState11 entity, PostUpdateContext<TNewMarkState11> context) {
    }

    @Override
    public void postDelete(TNewMarkState11 entity, PostDeleteContext<TNewMarkState11> context) {
    }
}
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
public class TNewMarkState25Listener implements EntityListener<TNewMarkState25> {

    @Override
    public void preInsert(TNewMarkState25 entity, PreInsertContext<TNewMarkState25> context) {
    }

    @Override
    public void preUpdate(TNewMarkState25 entity, PreUpdateContext<TNewMarkState25> context) {
    }

    @Override
    public void preDelete(TNewMarkState25 entity, PreDeleteContext<TNewMarkState25> context) {
    }

    @Override
    public void postInsert(TNewMarkState25 entity, PostInsertContext<TNewMarkState25> context) {
    }

    @Override
    public void postUpdate(TNewMarkState25 entity, PostUpdateContext<TNewMarkState25> context) {
    }

    @Override
    public void postDelete(TNewMarkState25 entity, PostDeleteContext<TNewMarkState25> context) {
    }
}
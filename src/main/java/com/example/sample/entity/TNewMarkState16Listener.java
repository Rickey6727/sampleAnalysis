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
public class TNewMarkState16Listener implements EntityListener<TNewMarkState16> {

    @Override
    public void preInsert(TNewMarkState16 entity, PreInsertContext<TNewMarkState16> context) {
    }

    @Override
    public void preUpdate(TNewMarkState16 entity, PreUpdateContext<TNewMarkState16> context) {
    }

    @Override
    public void preDelete(TNewMarkState16 entity, PreDeleteContext<TNewMarkState16> context) {
    }

    @Override
    public void postInsert(TNewMarkState16 entity, PostInsertContext<TNewMarkState16> context) {
    }

    @Override
    public void postUpdate(TNewMarkState16 entity, PostUpdateContext<TNewMarkState16> context) {
    }

    @Override
    public void postDelete(TNewMarkState16 entity, PostDeleteContext<TNewMarkState16> context) {
    }
}
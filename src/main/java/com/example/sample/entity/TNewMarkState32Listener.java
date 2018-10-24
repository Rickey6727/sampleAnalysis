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
public class TNewMarkState32Listener implements EntityListener<TNewMarkState32> {

    @Override
    public void preInsert(TNewMarkState32 entity, PreInsertContext<TNewMarkState32> context) {
    }

    @Override
    public void preUpdate(TNewMarkState32 entity, PreUpdateContext<TNewMarkState32> context) {
    }

    @Override
    public void preDelete(TNewMarkState32 entity, PreDeleteContext<TNewMarkState32> context) {
    }

    @Override
    public void postInsert(TNewMarkState32 entity, PostInsertContext<TNewMarkState32> context) {
    }

    @Override
    public void postUpdate(TNewMarkState32 entity, PostUpdateContext<TNewMarkState32> context) {
    }

    @Override
    public void postDelete(TNewMarkState32 entity, PostDeleteContext<TNewMarkState32> context) {
    }
}
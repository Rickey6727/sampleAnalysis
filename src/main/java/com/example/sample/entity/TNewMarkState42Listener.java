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
public class TNewMarkState42Listener implements EntityListener<TNewMarkState42> {

    @Override
    public void preInsert(TNewMarkState42 entity, PreInsertContext<TNewMarkState42> context) {
    }

    @Override
    public void preUpdate(TNewMarkState42 entity, PreUpdateContext<TNewMarkState42> context) {
    }

    @Override
    public void preDelete(TNewMarkState42 entity, PreDeleteContext<TNewMarkState42> context) {
    }

    @Override
    public void postInsert(TNewMarkState42 entity, PostInsertContext<TNewMarkState42> context) {
    }

    @Override
    public void postUpdate(TNewMarkState42 entity, PostUpdateContext<TNewMarkState42> context) {
    }

    @Override
    public void postDelete(TNewMarkState42 entity, PostDeleteContext<TNewMarkState42> context) {
    }
}
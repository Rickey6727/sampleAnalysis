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
public class TNewMarkState5Listener implements EntityListener<TNewMarkState5> {

    @Override
    public void preInsert(TNewMarkState5 entity, PreInsertContext<TNewMarkState5> context) {
    }

    @Override
    public void preUpdate(TNewMarkState5 entity, PreUpdateContext<TNewMarkState5> context) {
    }

    @Override
    public void preDelete(TNewMarkState5 entity, PreDeleteContext<TNewMarkState5> context) {
    }

    @Override
    public void postInsert(TNewMarkState5 entity, PostInsertContext<TNewMarkState5> context) {
    }

    @Override
    public void postUpdate(TNewMarkState5 entity, PostUpdateContext<TNewMarkState5> context) {
    }

    @Override
    public void postDelete(TNewMarkState5 entity, PostDeleteContext<TNewMarkState5> context) {
    }
}
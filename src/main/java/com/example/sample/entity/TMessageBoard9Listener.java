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
public class TMessageBoard9Listener implements EntityListener<TMessageBoard9> {

    @Override
    public void preInsert(TMessageBoard9 entity, PreInsertContext<TMessageBoard9> context) {
    }

    @Override
    public void preUpdate(TMessageBoard9 entity, PreUpdateContext<TMessageBoard9> context) {
    }

    @Override
    public void preDelete(TMessageBoard9 entity, PreDeleteContext<TMessageBoard9> context) {
    }

    @Override
    public void postInsert(TMessageBoard9 entity, PostInsertContext<TMessageBoard9> context) {
    }

    @Override
    public void postUpdate(TMessageBoard9 entity, PostUpdateContext<TMessageBoard9> context) {
    }

    @Override
    public void postDelete(TMessageBoard9 entity, PostDeleteContext<TMessageBoard9> context) {
    }
}
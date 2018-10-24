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
public class TMessageBoard43Listener implements EntityListener<TMessageBoard43> {

    @Override
    public void preInsert(TMessageBoard43 entity, PreInsertContext<TMessageBoard43> context) {
    }

    @Override
    public void preUpdate(TMessageBoard43 entity, PreUpdateContext<TMessageBoard43> context) {
    }

    @Override
    public void preDelete(TMessageBoard43 entity, PreDeleteContext<TMessageBoard43> context) {
    }

    @Override
    public void postInsert(TMessageBoard43 entity, PostInsertContext<TMessageBoard43> context) {
    }

    @Override
    public void postUpdate(TMessageBoard43 entity, PostUpdateContext<TMessageBoard43> context) {
    }

    @Override
    public void postDelete(TMessageBoard43 entity, PostDeleteContext<TMessageBoard43> context) {
    }
}
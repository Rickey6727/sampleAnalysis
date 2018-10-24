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
public class TMessageBoard27Listener implements EntityListener<TMessageBoard27> {

    @Override
    public void preInsert(TMessageBoard27 entity, PreInsertContext<TMessageBoard27> context) {
    }

    @Override
    public void preUpdate(TMessageBoard27 entity, PreUpdateContext<TMessageBoard27> context) {
    }

    @Override
    public void preDelete(TMessageBoard27 entity, PreDeleteContext<TMessageBoard27> context) {
    }

    @Override
    public void postInsert(TMessageBoard27 entity, PostInsertContext<TMessageBoard27> context) {
    }

    @Override
    public void postUpdate(TMessageBoard27 entity, PostUpdateContext<TMessageBoard27> context) {
    }

    @Override
    public void postDelete(TMessageBoard27 entity, PostDeleteContext<TMessageBoard27> context) {
    }
}
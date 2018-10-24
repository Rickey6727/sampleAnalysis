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
public class TNotice27Listener implements EntityListener<TNotice27> {

    @Override
    public void preInsert(TNotice27 entity, PreInsertContext<TNotice27> context) {
    }

    @Override
    public void preUpdate(TNotice27 entity, PreUpdateContext<TNotice27> context) {
    }

    @Override
    public void preDelete(TNotice27 entity, PreDeleteContext<TNotice27> context) {
    }

    @Override
    public void postInsert(TNotice27 entity, PostInsertContext<TNotice27> context) {
    }

    @Override
    public void postUpdate(TNotice27 entity, PostUpdateContext<TNotice27> context) {
    }

    @Override
    public void postDelete(TNotice27 entity, PostDeleteContext<TNotice27> context) {
    }
}
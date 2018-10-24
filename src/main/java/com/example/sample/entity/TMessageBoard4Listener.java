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
public class TMessageBoard4Listener implements EntityListener<TMessageBoard4> {

    @Override
    public void preInsert(TMessageBoard4 entity, PreInsertContext<TMessageBoard4> context) {
    }

    @Override
    public void preUpdate(TMessageBoard4 entity, PreUpdateContext<TMessageBoard4> context) {
    }

    @Override
    public void preDelete(TMessageBoard4 entity, PreDeleteContext<TMessageBoard4> context) {
    }

    @Override
    public void postInsert(TMessageBoard4 entity, PostInsertContext<TMessageBoard4> context) {
    }

    @Override
    public void postUpdate(TMessageBoard4 entity, PostUpdateContext<TMessageBoard4> context) {
    }

    @Override
    public void postDelete(TMessageBoard4 entity, PostDeleteContext<TMessageBoard4> context) {
    }
}
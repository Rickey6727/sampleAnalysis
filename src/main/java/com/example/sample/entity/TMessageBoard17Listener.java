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
public class TMessageBoard17Listener implements EntityListener<TMessageBoard17> {

    @Override
    public void preInsert(TMessageBoard17 entity, PreInsertContext<TMessageBoard17> context) {
    }

    @Override
    public void preUpdate(TMessageBoard17 entity, PreUpdateContext<TMessageBoard17> context) {
    }

    @Override
    public void preDelete(TMessageBoard17 entity, PreDeleteContext<TMessageBoard17> context) {
    }

    @Override
    public void postInsert(TMessageBoard17 entity, PostInsertContext<TMessageBoard17> context) {
    }

    @Override
    public void postUpdate(TMessageBoard17 entity, PostUpdateContext<TMessageBoard17> context) {
    }

    @Override
    public void postDelete(TMessageBoard17 entity, PostDeleteContext<TMessageBoard17> context) {
    }
}
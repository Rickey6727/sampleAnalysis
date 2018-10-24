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
public class TMessageBoard13Listener implements EntityListener<TMessageBoard13> {

    @Override
    public void preInsert(TMessageBoard13 entity, PreInsertContext<TMessageBoard13> context) {
    }

    @Override
    public void preUpdate(TMessageBoard13 entity, PreUpdateContext<TMessageBoard13> context) {
    }

    @Override
    public void preDelete(TMessageBoard13 entity, PreDeleteContext<TMessageBoard13> context) {
    }

    @Override
    public void postInsert(TMessageBoard13 entity, PostInsertContext<TMessageBoard13> context) {
    }

    @Override
    public void postUpdate(TMessageBoard13 entity, PostUpdateContext<TMessageBoard13> context) {
    }

    @Override
    public void postDelete(TMessageBoard13 entity, PostDeleteContext<TMessageBoard13> context) {
    }
}
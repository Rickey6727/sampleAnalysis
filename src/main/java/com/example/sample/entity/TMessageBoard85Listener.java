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
public class TMessageBoard85Listener implements EntityListener<TMessageBoard85> {

    @Override
    public void preInsert(TMessageBoard85 entity, PreInsertContext<TMessageBoard85> context) {
    }

    @Override
    public void preUpdate(TMessageBoard85 entity, PreUpdateContext<TMessageBoard85> context) {
    }

    @Override
    public void preDelete(TMessageBoard85 entity, PreDeleteContext<TMessageBoard85> context) {
    }

    @Override
    public void postInsert(TMessageBoard85 entity, PostInsertContext<TMessageBoard85> context) {
    }

    @Override
    public void postUpdate(TMessageBoard85 entity, PostUpdateContext<TMessageBoard85> context) {
    }

    @Override
    public void postDelete(TMessageBoard85 entity, PostDeleteContext<TMessageBoard85> context) {
    }
}
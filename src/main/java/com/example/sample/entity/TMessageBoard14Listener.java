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
public class TMessageBoard14Listener implements EntityListener<TMessageBoard14> {

    @Override
    public void preInsert(TMessageBoard14 entity, PreInsertContext<TMessageBoard14> context) {
    }

    @Override
    public void preUpdate(TMessageBoard14 entity, PreUpdateContext<TMessageBoard14> context) {
    }

    @Override
    public void preDelete(TMessageBoard14 entity, PreDeleteContext<TMessageBoard14> context) {
    }

    @Override
    public void postInsert(TMessageBoard14 entity, PostInsertContext<TMessageBoard14> context) {
    }

    @Override
    public void postUpdate(TMessageBoard14 entity, PostUpdateContext<TMessageBoard14> context) {
    }

    @Override
    public void postDelete(TMessageBoard14 entity, PostDeleteContext<TMessageBoard14> context) {
    }
}
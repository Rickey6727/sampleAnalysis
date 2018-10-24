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
public class TMessageBoard11Listener implements EntityListener<TMessageBoard11> {

    @Override
    public void preInsert(TMessageBoard11 entity, PreInsertContext<TMessageBoard11> context) {
    }

    @Override
    public void preUpdate(TMessageBoard11 entity, PreUpdateContext<TMessageBoard11> context) {
    }

    @Override
    public void preDelete(TMessageBoard11 entity, PreDeleteContext<TMessageBoard11> context) {
    }

    @Override
    public void postInsert(TMessageBoard11 entity, PostInsertContext<TMessageBoard11> context) {
    }

    @Override
    public void postUpdate(TMessageBoard11 entity, PostUpdateContext<TMessageBoard11> context) {
    }

    @Override
    public void postDelete(TMessageBoard11 entity, PostDeleteContext<TMessageBoard11> context) {
    }
}
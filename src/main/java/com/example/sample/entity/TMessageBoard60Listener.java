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
public class TMessageBoard60Listener implements EntityListener<TMessageBoard60> {

    @Override
    public void preInsert(TMessageBoard60 entity, PreInsertContext<TMessageBoard60> context) {
    }

    @Override
    public void preUpdate(TMessageBoard60 entity, PreUpdateContext<TMessageBoard60> context) {
    }

    @Override
    public void preDelete(TMessageBoard60 entity, PreDeleteContext<TMessageBoard60> context) {
    }

    @Override
    public void postInsert(TMessageBoard60 entity, PostInsertContext<TMessageBoard60> context) {
    }

    @Override
    public void postUpdate(TMessageBoard60 entity, PostUpdateContext<TMessageBoard60> context) {
    }

    @Override
    public void postDelete(TMessageBoard60 entity, PostDeleteContext<TMessageBoard60> context) {
    }
}
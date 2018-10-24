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
public class TMessageBoard33Listener implements EntityListener<TMessageBoard33> {

    @Override
    public void preInsert(TMessageBoard33 entity, PreInsertContext<TMessageBoard33> context) {
    }

    @Override
    public void preUpdate(TMessageBoard33 entity, PreUpdateContext<TMessageBoard33> context) {
    }

    @Override
    public void preDelete(TMessageBoard33 entity, PreDeleteContext<TMessageBoard33> context) {
    }

    @Override
    public void postInsert(TMessageBoard33 entity, PostInsertContext<TMessageBoard33> context) {
    }

    @Override
    public void postUpdate(TMessageBoard33 entity, PostUpdateContext<TMessageBoard33> context) {
    }

    @Override
    public void postDelete(TMessageBoard33 entity, PostDeleteContext<TMessageBoard33> context) {
    }
}
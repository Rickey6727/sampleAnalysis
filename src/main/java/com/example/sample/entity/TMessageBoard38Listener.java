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
public class TMessageBoard38Listener implements EntityListener<TMessageBoard38> {

    @Override
    public void preInsert(TMessageBoard38 entity, PreInsertContext<TMessageBoard38> context) {
    }

    @Override
    public void preUpdate(TMessageBoard38 entity, PreUpdateContext<TMessageBoard38> context) {
    }

    @Override
    public void preDelete(TMessageBoard38 entity, PreDeleteContext<TMessageBoard38> context) {
    }

    @Override
    public void postInsert(TMessageBoard38 entity, PostInsertContext<TMessageBoard38> context) {
    }

    @Override
    public void postUpdate(TMessageBoard38 entity, PostUpdateContext<TMessageBoard38> context) {
    }

    @Override
    public void postDelete(TMessageBoard38 entity, PostDeleteContext<TMessageBoard38> context) {
    }
}
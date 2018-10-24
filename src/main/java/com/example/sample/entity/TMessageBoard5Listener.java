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
public class TMessageBoard5Listener implements EntityListener<TMessageBoard5> {

    @Override
    public void preInsert(TMessageBoard5 entity, PreInsertContext<TMessageBoard5> context) {
    }

    @Override
    public void preUpdate(TMessageBoard5 entity, PreUpdateContext<TMessageBoard5> context) {
    }

    @Override
    public void preDelete(TMessageBoard5 entity, PreDeleteContext<TMessageBoard5> context) {
    }

    @Override
    public void postInsert(TMessageBoard5 entity, PostInsertContext<TMessageBoard5> context) {
    }

    @Override
    public void postUpdate(TMessageBoard5 entity, PostUpdateContext<TMessageBoard5> context) {
    }

    @Override
    public void postDelete(TMessageBoard5 entity, PostDeleteContext<TMessageBoard5> context) {
    }
}
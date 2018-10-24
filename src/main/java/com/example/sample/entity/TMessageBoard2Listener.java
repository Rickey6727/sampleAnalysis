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
public class TMessageBoard2Listener implements EntityListener<TMessageBoard2> {

    @Override
    public void preInsert(TMessageBoard2 entity, PreInsertContext<TMessageBoard2> context) {
    }

    @Override
    public void preUpdate(TMessageBoard2 entity, PreUpdateContext<TMessageBoard2> context) {
    }

    @Override
    public void preDelete(TMessageBoard2 entity, PreDeleteContext<TMessageBoard2> context) {
    }

    @Override
    public void postInsert(TMessageBoard2 entity, PostInsertContext<TMessageBoard2> context) {
    }

    @Override
    public void postUpdate(TMessageBoard2 entity, PostUpdateContext<TMessageBoard2> context) {
    }

    @Override
    public void postDelete(TMessageBoard2 entity, PostDeleteContext<TMessageBoard2> context) {
    }
}
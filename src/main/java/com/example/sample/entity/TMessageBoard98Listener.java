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
public class TMessageBoard98Listener implements EntityListener<TMessageBoard98> {

    @Override
    public void preInsert(TMessageBoard98 entity, PreInsertContext<TMessageBoard98> context) {
    }

    @Override
    public void preUpdate(TMessageBoard98 entity, PreUpdateContext<TMessageBoard98> context) {
    }

    @Override
    public void preDelete(TMessageBoard98 entity, PreDeleteContext<TMessageBoard98> context) {
    }

    @Override
    public void postInsert(TMessageBoard98 entity, PostInsertContext<TMessageBoard98> context) {
    }

    @Override
    public void postUpdate(TMessageBoard98 entity, PostUpdateContext<TMessageBoard98> context) {
    }

    @Override
    public void postDelete(TMessageBoard98 entity, PostDeleteContext<TMessageBoard98> context) {
    }
}
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
public class TMessageBoard20Listener implements EntityListener<TMessageBoard20> {

    @Override
    public void preInsert(TMessageBoard20 entity, PreInsertContext<TMessageBoard20> context) {
    }

    @Override
    public void preUpdate(TMessageBoard20 entity, PreUpdateContext<TMessageBoard20> context) {
    }

    @Override
    public void preDelete(TMessageBoard20 entity, PreDeleteContext<TMessageBoard20> context) {
    }

    @Override
    public void postInsert(TMessageBoard20 entity, PostInsertContext<TMessageBoard20> context) {
    }

    @Override
    public void postUpdate(TMessageBoard20 entity, PostUpdateContext<TMessageBoard20> context) {
    }

    @Override
    public void postDelete(TMessageBoard20 entity, PostDeleteContext<TMessageBoard20> context) {
    }
}
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
public class TMessageBoard91Listener implements EntityListener<TMessageBoard91> {

    @Override
    public void preInsert(TMessageBoard91 entity, PreInsertContext<TMessageBoard91> context) {
    }

    @Override
    public void preUpdate(TMessageBoard91 entity, PreUpdateContext<TMessageBoard91> context) {
    }

    @Override
    public void preDelete(TMessageBoard91 entity, PreDeleteContext<TMessageBoard91> context) {
    }

    @Override
    public void postInsert(TMessageBoard91 entity, PostInsertContext<TMessageBoard91> context) {
    }

    @Override
    public void postUpdate(TMessageBoard91 entity, PostUpdateContext<TMessageBoard91> context) {
    }

    @Override
    public void postDelete(TMessageBoard91 entity, PostDeleteContext<TMessageBoard91> context) {
    }
}
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
public class TMessageBoard26Listener implements EntityListener<TMessageBoard26> {

    @Override
    public void preInsert(TMessageBoard26 entity, PreInsertContext<TMessageBoard26> context) {
    }

    @Override
    public void preUpdate(TMessageBoard26 entity, PreUpdateContext<TMessageBoard26> context) {
    }

    @Override
    public void preDelete(TMessageBoard26 entity, PreDeleteContext<TMessageBoard26> context) {
    }

    @Override
    public void postInsert(TMessageBoard26 entity, PostInsertContext<TMessageBoard26> context) {
    }

    @Override
    public void postUpdate(TMessageBoard26 entity, PostUpdateContext<TMessageBoard26> context) {
    }

    @Override
    public void postDelete(TMessageBoard26 entity, PostDeleteContext<TMessageBoard26> context) {
    }
}
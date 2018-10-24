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
public class TMessageBoard3Listener implements EntityListener<TMessageBoard3> {

    @Override
    public void preInsert(TMessageBoard3 entity, PreInsertContext<TMessageBoard3> context) {
    }

    @Override
    public void preUpdate(TMessageBoard3 entity, PreUpdateContext<TMessageBoard3> context) {
    }

    @Override
    public void preDelete(TMessageBoard3 entity, PreDeleteContext<TMessageBoard3> context) {
    }

    @Override
    public void postInsert(TMessageBoard3 entity, PostInsertContext<TMessageBoard3> context) {
    }

    @Override
    public void postUpdate(TMessageBoard3 entity, PostUpdateContext<TMessageBoard3> context) {
    }

    @Override
    public void postDelete(TMessageBoard3 entity, PostDeleteContext<TMessageBoard3> context) {
    }
}
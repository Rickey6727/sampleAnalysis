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
public class TMessageBoard21Listener implements EntityListener<TMessageBoard21> {

    @Override
    public void preInsert(TMessageBoard21 entity, PreInsertContext<TMessageBoard21> context) {
    }

    @Override
    public void preUpdate(TMessageBoard21 entity, PreUpdateContext<TMessageBoard21> context) {
    }

    @Override
    public void preDelete(TMessageBoard21 entity, PreDeleteContext<TMessageBoard21> context) {
    }

    @Override
    public void postInsert(TMessageBoard21 entity, PostInsertContext<TMessageBoard21> context) {
    }

    @Override
    public void postUpdate(TMessageBoard21 entity, PostUpdateContext<TMessageBoard21> context) {
    }

    @Override
    public void postDelete(TMessageBoard21 entity, PostDeleteContext<TMessageBoard21> context) {
    }
}
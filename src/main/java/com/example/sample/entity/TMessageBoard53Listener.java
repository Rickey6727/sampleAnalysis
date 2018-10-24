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
public class TMessageBoard53Listener implements EntityListener<TMessageBoard53> {

    @Override
    public void preInsert(TMessageBoard53 entity, PreInsertContext<TMessageBoard53> context) {
    }

    @Override
    public void preUpdate(TMessageBoard53 entity, PreUpdateContext<TMessageBoard53> context) {
    }

    @Override
    public void preDelete(TMessageBoard53 entity, PreDeleteContext<TMessageBoard53> context) {
    }

    @Override
    public void postInsert(TMessageBoard53 entity, PostInsertContext<TMessageBoard53> context) {
    }

    @Override
    public void postUpdate(TMessageBoard53 entity, PostUpdateContext<TMessageBoard53> context) {
    }

    @Override
    public void postDelete(TMessageBoard53 entity, PostDeleteContext<TMessageBoard53> context) {
    }
}
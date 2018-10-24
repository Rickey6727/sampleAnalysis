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
public class TMessageBoard1Listener implements EntityListener<TMessageBoard1> {

    @Override
    public void preInsert(TMessageBoard1 entity, PreInsertContext<TMessageBoard1> context) {
    }

    @Override
    public void preUpdate(TMessageBoard1 entity, PreUpdateContext<TMessageBoard1> context) {
    }

    @Override
    public void preDelete(TMessageBoard1 entity, PreDeleteContext<TMessageBoard1> context) {
    }

    @Override
    public void postInsert(TMessageBoard1 entity, PostInsertContext<TMessageBoard1> context) {
    }

    @Override
    public void postUpdate(TMessageBoard1 entity, PostUpdateContext<TMessageBoard1> context) {
    }

    @Override
    public void postDelete(TMessageBoard1 entity, PostDeleteContext<TMessageBoard1> context) {
    }
}
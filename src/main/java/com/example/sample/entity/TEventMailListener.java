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
public class TEventMailListener implements EntityListener<TEventMail> {

    @Override
    public void preInsert(TEventMail entity, PreInsertContext<TEventMail> context) {
    }

    @Override
    public void preUpdate(TEventMail entity, PreUpdateContext<TEventMail> context) {
    }

    @Override
    public void preDelete(TEventMail entity, PreDeleteContext<TEventMail> context) {
    }

    @Override
    public void postInsert(TEventMail entity, PostInsertContext<TEventMail> context) {
    }

    @Override
    public void postUpdate(TEventMail entity, PostUpdateContext<TEventMail> context) {
    }

    @Override
    public void postDelete(TEventMail entity, PostDeleteContext<TEventMail> context) {
    }
}
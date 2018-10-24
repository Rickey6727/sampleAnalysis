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
public class TConsumeItemOwn8Listener implements EntityListener<TConsumeItemOwn8> {

    @Override
    public void preInsert(TConsumeItemOwn8 entity, PreInsertContext<TConsumeItemOwn8> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwn8 entity, PreUpdateContext<TConsumeItemOwn8> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwn8 entity, PreDeleteContext<TConsumeItemOwn8> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwn8 entity, PostInsertContext<TConsumeItemOwn8> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwn8 entity, PostUpdateContext<TConsumeItemOwn8> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwn8 entity, PostDeleteContext<TConsumeItemOwn8> context) {
    }
}
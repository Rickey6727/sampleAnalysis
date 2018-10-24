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
public class TConsumeItemOwn15Listener implements EntityListener<TConsumeItemOwn15> {

    @Override
    public void preInsert(TConsumeItemOwn15 entity, PreInsertContext<TConsumeItemOwn15> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwn15 entity, PreUpdateContext<TConsumeItemOwn15> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwn15 entity, PreDeleteContext<TConsumeItemOwn15> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwn15 entity, PostInsertContext<TConsumeItemOwn15> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwn15 entity, PostUpdateContext<TConsumeItemOwn15> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwn15 entity, PostDeleteContext<TConsumeItemOwn15> context) {
    }
}
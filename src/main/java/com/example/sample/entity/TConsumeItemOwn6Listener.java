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
public class TConsumeItemOwn6Listener implements EntityListener<TConsumeItemOwn6> {

    @Override
    public void preInsert(TConsumeItemOwn6 entity, PreInsertContext<TConsumeItemOwn6> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwn6 entity, PreUpdateContext<TConsumeItemOwn6> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwn6 entity, PreDeleteContext<TConsumeItemOwn6> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwn6 entity, PostInsertContext<TConsumeItemOwn6> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwn6 entity, PostUpdateContext<TConsumeItemOwn6> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwn6 entity, PostDeleteContext<TConsumeItemOwn6> context) {
    }
}
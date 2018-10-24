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
public class TConsumeItemOwn50Listener implements EntityListener<TConsumeItemOwn50> {

    @Override
    public void preInsert(TConsumeItemOwn50 entity, PreInsertContext<TConsumeItemOwn50> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwn50 entity, PreUpdateContext<TConsumeItemOwn50> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwn50 entity, PreDeleteContext<TConsumeItemOwn50> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwn50 entity, PostInsertContext<TConsumeItemOwn50> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwn50 entity, PostUpdateContext<TConsumeItemOwn50> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwn50 entity, PostDeleteContext<TConsumeItemOwn50> context) {
    }
}
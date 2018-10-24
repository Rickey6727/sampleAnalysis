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
public class TConsumeItemOwn3Listener implements EntityListener<TConsumeItemOwn3> {

    @Override
    public void preInsert(TConsumeItemOwn3 entity, PreInsertContext<TConsumeItemOwn3> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwn3 entity, PreUpdateContext<TConsumeItemOwn3> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwn3 entity, PreDeleteContext<TConsumeItemOwn3> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwn3 entity, PostInsertContext<TConsumeItemOwn3> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwn3 entity, PostUpdateContext<TConsumeItemOwn3> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwn3 entity, PostDeleteContext<TConsumeItemOwn3> context) {
    }
}
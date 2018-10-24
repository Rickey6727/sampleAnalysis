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
public class TConsumeItemOwn12Listener implements EntityListener<TConsumeItemOwn12> {

    @Override
    public void preInsert(TConsumeItemOwn12 entity, PreInsertContext<TConsumeItemOwn12> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwn12 entity, PreUpdateContext<TConsumeItemOwn12> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwn12 entity, PreDeleteContext<TConsumeItemOwn12> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwn12 entity, PostInsertContext<TConsumeItemOwn12> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwn12 entity, PostUpdateContext<TConsumeItemOwn12> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwn12 entity, PostDeleteContext<TConsumeItemOwn12> context) {
    }
}
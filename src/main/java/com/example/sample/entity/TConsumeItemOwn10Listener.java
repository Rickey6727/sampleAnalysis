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
public class TConsumeItemOwn10Listener implements EntityListener<TConsumeItemOwn10> {

    @Override
    public void preInsert(TConsumeItemOwn10 entity, PreInsertContext<TConsumeItemOwn10> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwn10 entity, PreUpdateContext<TConsumeItemOwn10> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwn10 entity, PreDeleteContext<TConsumeItemOwn10> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwn10 entity, PostInsertContext<TConsumeItemOwn10> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwn10 entity, PostUpdateContext<TConsumeItemOwn10> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwn10 entity, PostDeleteContext<TConsumeItemOwn10> context) {
    }
}
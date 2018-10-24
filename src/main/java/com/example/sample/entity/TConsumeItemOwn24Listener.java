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
public class TConsumeItemOwn24Listener implements EntityListener<TConsumeItemOwn24> {

    @Override
    public void preInsert(TConsumeItemOwn24 entity, PreInsertContext<TConsumeItemOwn24> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwn24 entity, PreUpdateContext<TConsumeItemOwn24> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwn24 entity, PreDeleteContext<TConsumeItemOwn24> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwn24 entity, PostInsertContext<TConsumeItemOwn24> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwn24 entity, PostUpdateContext<TConsumeItemOwn24> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwn24 entity, PostDeleteContext<TConsumeItemOwn24> context) {
    }
}
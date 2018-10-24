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
public class TConsumeItemOwn21Listener implements EntityListener<TConsumeItemOwn21> {

    @Override
    public void preInsert(TConsumeItemOwn21 entity, PreInsertContext<TConsumeItemOwn21> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwn21 entity, PreUpdateContext<TConsumeItemOwn21> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwn21 entity, PreDeleteContext<TConsumeItemOwn21> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwn21 entity, PostInsertContext<TConsumeItemOwn21> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwn21 entity, PostUpdateContext<TConsumeItemOwn21> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwn21 entity, PostDeleteContext<TConsumeItemOwn21> context) {
    }
}
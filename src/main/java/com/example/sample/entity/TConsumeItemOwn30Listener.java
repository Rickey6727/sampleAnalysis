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
public class TConsumeItemOwn30Listener implements EntityListener<TConsumeItemOwn30> {

    @Override
    public void preInsert(TConsumeItemOwn30 entity, PreInsertContext<TConsumeItemOwn30> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwn30 entity, PreUpdateContext<TConsumeItemOwn30> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwn30 entity, PreDeleteContext<TConsumeItemOwn30> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwn30 entity, PostInsertContext<TConsumeItemOwn30> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwn30 entity, PostUpdateContext<TConsumeItemOwn30> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwn30 entity, PostDeleteContext<TConsumeItemOwn30> context) {
    }
}
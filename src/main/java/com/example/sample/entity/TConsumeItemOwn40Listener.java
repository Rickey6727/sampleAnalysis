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
public class TConsumeItemOwn40Listener implements EntityListener<TConsumeItemOwn40> {

    @Override
    public void preInsert(TConsumeItemOwn40 entity, PreInsertContext<TConsumeItemOwn40> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwn40 entity, PreUpdateContext<TConsumeItemOwn40> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwn40 entity, PreDeleteContext<TConsumeItemOwn40> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwn40 entity, PostInsertContext<TConsumeItemOwn40> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwn40 entity, PostUpdateContext<TConsumeItemOwn40> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwn40 entity, PostDeleteContext<TConsumeItemOwn40> context) {
    }
}
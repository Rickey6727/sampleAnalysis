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
public class TConsumeItemOwn99Listener implements EntityListener<TConsumeItemOwn99> {

    @Override
    public void preInsert(TConsumeItemOwn99 entity, PreInsertContext<TConsumeItemOwn99> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwn99 entity, PreUpdateContext<TConsumeItemOwn99> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwn99 entity, PreDeleteContext<TConsumeItemOwn99> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwn99 entity, PostInsertContext<TConsumeItemOwn99> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwn99 entity, PostUpdateContext<TConsumeItemOwn99> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwn99 entity, PostDeleteContext<TConsumeItemOwn99> context) {
    }
}
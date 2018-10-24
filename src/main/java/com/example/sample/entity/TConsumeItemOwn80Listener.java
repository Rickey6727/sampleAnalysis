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
public class TConsumeItemOwn80Listener implements EntityListener<TConsumeItemOwn80> {

    @Override
    public void preInsert(TConsumeItemOwn80 entity, PreInsertContext<TConsumeItemOwn80> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwn80 entity, PreUpdateContext<TConsumeItemOwn80> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwn80 entity, PreDeleteContext<TConsumeItemOwn80> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwn80 entity, PostInsertContext<TConsumeItemOwn80> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwn80 entity, PostUpdateContext<TConsumeItemOwn80> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwn80 entity, PostDeleteContext<TConsumeItemOwn80> context) {
    }
}
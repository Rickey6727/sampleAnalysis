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
public class TConsumeItemOwn4Listener implements EntityListener<TConsumeItemOwn4> {

    @Override
    public void preInsert(TConsumeItemOwn4 entity, PreInsertContext<TConsumeItemOwn4> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwn4 entity, PreUpdateContext<TConsumeItemOwn4> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwn4 entity, PreDeleteContext<TConsumeItemOwn4> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwn4 entity, PostInsertContext<TConsumeItemOwn4> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwn4 entity, PostUpdateContext<TConsumeItemOwn4> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwn4 entity, PostDeleteContext<TConsumeItemOwn4> context) {
    }
}
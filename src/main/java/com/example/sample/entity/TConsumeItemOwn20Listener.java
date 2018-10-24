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
public class TConsumeItemOwn20Listener implements EntityListener<TConsumeItemOwn20> {

    @Override
    public void preInsert(TConsumeItemOwn20 entity, PreInsertContext<TConsumeItemOwn20> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwn20 entity, PreUpdateContext<TConsumeItemOwn20> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwn20 entity, PreDeleteContext<TConsumeItemOwn20> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwn20 entity, PostInsertContext<TConsumeItemOwn20> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwn20 entity, PostUpdateContext<TConsumeItemOwn20> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwn20 entity, PostDeleteContext<TConsumeItemOwn20> context) {
    }
}
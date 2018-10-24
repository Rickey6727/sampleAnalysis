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
public class TConsumeItemOwn32Listener implements EntityListener<TConsumeItemOwn32> {

    @Override
    public void preInsert(TConsumeItemOwn32 entity, PreInsertContext<TConsumeItemOwn32> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwn32 entity, PreUpdateContext<TConsumeItemOwn32> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwn32 entity, PreDeleteContext<TConsumeItemOwn32> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwn32 entity, PostInsertContext<TConsumeItemOwn32> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwn32 entity, PostUpdateContext<TConsumeItemOwn32> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwn32 entity, PostDeleteContext<TConsumeItemOwn32> context) {
    }
}
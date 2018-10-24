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
public class TConsumeItemOwn7Listener implements EntityListener<TConsumeItemOwn7> {

    @Override
    public void preInsert(TConsumeItemOwn7 entity, PreInsertContext<TConsumeItemOwn7> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwn7 entity, PreUpdateContext<TConsumeItemOwn7> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwn7 entity, PreDeleteContext<TConsumeItemOwn7> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwn7 entity, PostInsertContext<TConsumeItemOwn7> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwn7 entity, PostUpdateContext<TConsumeItemOwn7> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwn7 entity, PostDeleteContext<TConsumeItemOwn7> context) {
    }
}
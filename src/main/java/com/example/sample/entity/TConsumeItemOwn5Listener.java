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
public class TConsumeItemOwn5Listener implements EntityListener<TConsumeItemOwn5> {

    @Override
    public void preInsert(TConsumeItemOwn5 entity, PreInsertContext<TConsumeItemOwn5> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwn5 entity, PreUpdateContext<TConsumeItemOwn5> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwn5 entity, PreDeleteContext<TConsumeItemOwn5> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwn5 entity, PostInsertContext<TConsumeItemOwn5> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwn5 entity, PostUpdateContext<TConsumeItemOwn5> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwn5 entity, PostDeleteContext<TConsumeItemOwn5> context) {
    }
}
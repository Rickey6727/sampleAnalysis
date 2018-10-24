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
public class TConsumeItemOwn9Listener implements EntityListener<TConsumeItemOwn9> {

    @Override
    public void preInsert(TConsumeItemOwn9 entity, PreInsertContext<TConsumeItemOwn9> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwn9 entity, PreUpdateContext<TConsumeItemOwn9> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwn9 entity, PreDeleteContext<TConsumeItemOwn9> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwn9 entity, PostInsertContext<TConsumeItemOwn9> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwn9 entity, PostUpdateContext<TConsumeItemOwn9> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwn9 entity, PostDeleteContext<TConsumeItemOwn9> context) {
    }
}
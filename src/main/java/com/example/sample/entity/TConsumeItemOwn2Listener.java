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
public class TConsumeItemOwn2Listener implements EntityListener<TConsumeItemOwn2> {

    @Override
    public void preInsert(TConsumeItemOwn2 entity, PreInsertContext<TConsumeItemOwn2> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwn2 entity, PreUpdateContext<TConsumeItemOwn2> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwn2 entity, PreDeleteContext<TConsumeItemOwn2> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwn2 entity, PostInsertContext<TConsumeItemOwn2> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwn2 entity, PostUpdateContext<TConsumeItemOwn2> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwn2 entity, PostDeleteContext<TConsumeItemOwn2> context) {
    }
}
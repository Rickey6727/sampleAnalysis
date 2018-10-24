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
public class TConsumeItemOwn1Listener implements EntityListener<TConsumeItemOwn1> {

    @Override
    public void preInsert(TConsumeItemOwn1 entity, PreInsertContext<TConsumeItemOwn1> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwn1 entity, PreUpdateContext<TConsumeItemOwn1> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwn1 entity, PreDeleteContext<TConsumeItemOwn1> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwn1 entity, PostInsertContext<TConsumeItemOwn1> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwn1 entity, PostUpdateContext<TConsumeItemOwn1> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwn1 entity, PostDeleteContext<TConsumeItemOwn1> context) {
    }
}
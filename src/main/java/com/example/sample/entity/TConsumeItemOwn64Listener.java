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
public class TConsumeItemOwn64Listener implements EntityListener<TConsumeItemOwn64> {

    @Override
    public void preInsert(TConsumeItemOwn64 entity, PreInsertContext<TConsumeItemOwn64> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwn64 entity, PreUpdateContext<TConsumeItemOwn64> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwn64 entity, PreDeleteContext<TConsumeItemOwn64> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwn64 entity, PostInsertContext<TConsumeItemOwn64> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwn64 entity, PostUpdateContext<TConsumeItemOwn64> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwn64 entity, PostDeleteContext<TConsumeItemOwn64> context) {
    }
}
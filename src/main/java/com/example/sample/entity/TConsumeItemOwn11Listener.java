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
public class TConsumeItemOwn11Listener implements EntityListener<TConsumeItemOwn11> {

    @Override
    public void preInsert(TConsumeItemOwn11 entity, PreInsertContext<TConsumeItemOwn11> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwn11 entity, PreUpdateContext<TConsumeItemOwn11> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwn11 entity, PreDeleteContext<TConsumeItemOwn11> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwn11 entity, PostInsertContext<TConsumeItemOwn11> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwn11 entity, PostUpdateContext<TConsumeItemOwn11> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwn11 entity, PostDeleteContext<TConsumeItemOwn11> context) {
    }
}
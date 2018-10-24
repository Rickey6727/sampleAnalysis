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
public class TConsumeItemOwn25Listener implements EntityListener<TConsumeItemOwn25> {

    @Override
    public void preInsert(TConsumeItemOwn25 entity, PreInsertContext<TConsumeItemOwn25> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwn25 entity, PreUpdateContext<TConsumeItemOwn25> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwn25 entity, PreDeleteContext<TConsumeItemOwn25> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwn25 entity, PostInsertContext<TConsumeItemOwn25> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwn25 entity, PostUpdateContext<TConsumeItemOwn25> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwn25 entity, PostDeleteContext<TConsumeItemOwn25> context) {
    }
}
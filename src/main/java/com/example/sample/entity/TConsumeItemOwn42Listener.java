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
public class TConsumeItemOwn42Listener implements EntityListener<TConsumeItemOwn42> {

    @Override
    public void preInsert(TConsumeItemOwn42 entity, PreInsertContext<TConsumeItemOwn42> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwn42 entity, PreUpdateContext<TConsumeItemOwn42> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwn42 entity, PreDeleteContext<TConsumeItemOwn42> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwn42 entity, PostInsertContext<TConsumeItemOwn42> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwn42 entity, PostUpdateContext<TConsumeItemOwn42> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwn42 entity, PostDeleteContext<TConsumeItemOwn42> context) {
    }
}
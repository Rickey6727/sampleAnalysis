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
public class TConsumeItemOwnLimitedTime50Listener implements EntityListener<TConsumeItemOwnLimitedTime50> {

    @Override
    public void preInsert(TConsumeItemOwnLimitedTime50 entity, PreInsertContext<TConsumeItemOwnLimitedTime50> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwnLimitedTime50 entity, PreUpdateContext<TConsumeItemOwnLimitedTime50> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwnLimitedTime50 entity, PreDeleteContext<TConsumeItemOwnLimitedTime50> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwnLimitedTime50 entity, PostInsertContext<TConsumeItemOwnLimitedTime50> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwnLimitedTime50 entity, PostUpdateContext<TConsumeItemOwnLimitedTime50> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwnLimitedTime50 entity, PostDeleteContext<TConsumeItemOwnLimitedTime50> context) {
    }
}
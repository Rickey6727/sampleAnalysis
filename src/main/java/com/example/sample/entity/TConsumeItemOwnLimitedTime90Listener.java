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
public class TConsumeItemOwnLimitedTime90Listener implements EntityListener<TConsumeItemOwnLimitedTime90> {

    @Override
    public void preInsert(TConsumeItemOwnLimitedTime90 entity, PreInsertContext<TConsumeItemOwnLimitedTime90> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwnLimitedTime90 entity, PreUpdateContext<TConsumeItemOwnLimitedTime90> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwnLimitedTime90 entity, PreDeleteContext<TConsumeItemOwnLimitedTime90> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwnLimitedTime90 entity, PostInsertContext<TConsumeItemOwnLimitedTime90> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwnLimitedTime90 entity, PostUpdateContext<TConsumeItemOwnLimitedTime90> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwnLimitedTime90 entity, PostDeleteContext<TConsumeItemOwnLimitedTime90> context) {
    }
}
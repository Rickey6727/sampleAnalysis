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
public class TConsumeItemOwnLimitedTime1Listener implements EntityListener<TConsumeItemOwnLimitedTime1> {

    @Override
    public void preInsert(TConsumeItemOwnLimitedTime1 entity, PreInsertContext<TConsumeItemOwnLimitedTime1> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwnLimitedTime1 entity, PreUpdateContext<TConsumeItemOwnLimitedTime1> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwnLimitedTime1 entity, PreDeleteContext<TConsumeItemOwnLimitedTime1> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwnLimitedTime1 entity, PostInsertContext<TConsumeItemOwnLimitedTime1> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwnLimitedTime1 entity, PostUpdateContext<TConsumeItemOwnLimitedTime1> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwnLimitedTime1 entity, PostDeleteContext<TConsumeItemOwnLimitedTime1> context) {
    }
}
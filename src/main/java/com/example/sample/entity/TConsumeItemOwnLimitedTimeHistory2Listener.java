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
public class TConsumeItemOwnLimitedTimeHistory2Listener implements EntityListener<TConsumeItemOwnLimitedTimeHistory2> {

    @Override
    public void preInsert(TConsumeItemOwnLimitedTimeHistory2 entity, PreInsertContext<TConsumeItemOwnLimitedTimeHistory2> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwnLimitedTimeHistory2 entity, PreUpdateContext<TConsumeItemOwnLimitedTimeHistory2> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwnLimitedTimeHistory2 entity, PreDeleteContext<TConsumeItemOwnLimitedTimeHistory2> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwnLimitedTimeHistory2 entity, PostInsertContext<TConsumeItemOwnLimitedTimeHistory2> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwnLimitedTimeHistory2 entity, PostUpdateContext<TConsumeItemOwnLimitedTimeHistory2> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwnLimitedTimeHistory2 entity, PostDeleteContext<TConsumeItemOwnLimitedTimeHistory2> context) {
    }
}
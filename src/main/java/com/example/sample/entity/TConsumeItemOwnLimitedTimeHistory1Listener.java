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
public class TConsumeItemOwnLimitedTimeHistory1Listener implements EntityListener<TConsumeItemOwnLimitedTimeHistory1> {

    @Override
    public void preInsert(TConsumeItemOwnLimitedTimeHistory1 entity, PreInsertContext<TConsumeItemOwnLimitedTimeHistory1> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwnLimitedTimeHistory1 entity, PreUpdateContext<TConsumeItemOwnLimitedTimeHistory1> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwnLimitedTimeHistory1 entity, PreDeleteContext<TConsumeItemOwnLimitedTimeHistory1> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwnLimitedTimeHistory1 entity, PostInsertContext<TConsumeItemOwnLimitedTimeHistory1> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwnLimitedTimeHistory1 entity, PostUpdateContext<TConsumeItemOwnLimitedTimeHistory1> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwnLimitedTimeHistory1 entity, PostDeleteContext<TConsumeItemOwnLimitedTimeHistory1> context) {
    }
}
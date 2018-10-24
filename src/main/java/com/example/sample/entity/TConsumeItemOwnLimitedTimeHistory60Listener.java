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
public class TConsumeItemOwnLimitedTimeHistory60Listener implements EntityListener<TConsumeItemOwnLimitedTimeHistory60> {

    @Override
    public void preInsert(TConsumeItemOwnLimitedTimeHistory60 entity, PreInsertContext<TConsumeItemOwnLimitedTimeHistory60> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwnLimitedTimeHistory60 entity, PreUpdateContext<TConsumeItemOwnLimitedTimeHistory60> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwnLimitedTimeHistory60 entity, PreDeleteContext<TConsumeItemOwnLimitedTimeHistory60> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwnLimitedTimeHistory60 entity, PostInsertContext<TConsumeItemOwnLimitedTimeHistory60> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwnLimitedTimeHistory60 entity, PostUpdateContext<TConsumeItemOwnLimitedTimeHistory60> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwnLimitedTimeHistory60 entity, PostDeleteContext<TConsumeItemOwnLimitedTimeHistory60> context) {
    }
}
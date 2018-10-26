package com.example.sample.entity.operation;

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
public class MConsumeItemLimitedTimeListener implements EntityListener<MConsumeItemLimitedTime> {

    @Override
    public void preInsert(MConsumeItemLimitedTime entity, PreInsertContext<MConsumeItemLimitedTime> context) {
    }

    @Override
    public void preUpdate(MConsumeItemLimitedTime entity, PreUpdateContext<MConsumeItemLimitedTime> context) {
    }

    @Override
    public void preDelete(MConsumeItemLimitedTime entity, PreDeleteContext<MConsumeItemLimitedTime> context) {
    }

    @Override
    public void postInsert(MConsumeItemLimitedTime entity, PostInsertContext<MConsumeItemLimitedTime> context) {
    }

    @Override
    public void postUpdate(MConsumeItemLimitedTime entity, PostUpdateContext<MConsumeItemLimitedTime> context) {
    }

    @Override
    public void postDelete(MConsumeItemLimitedTime entity, PostDeleteContext<MConsumeItemLimitedTime> context) {
    }
}
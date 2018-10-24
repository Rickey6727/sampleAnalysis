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
public class TConsumeItemOwnLimitedTime2Listener implements EntityListener<TConsumeItemOwnLimitedTime2> {

    @Override
    public void preInsert(TConsumeItemOwnLimitedTime2 entity, PreInsertContext<TConsumeItemOwnLimitedTime2> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwnLimitedTime2 entity, PreUpdateContext<TConsumeItemOwnLimitedTime2> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwnLimitedTime2 entity, PreDeleteContext<TConsumeItemOwnLimitedTime2> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwnLimitedTime2 entity, PostInsertContext<TConsumeItemOwnLimitedTime2> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwnLimitedTime2 entity, PostUpdateContext<TConsumeItemOwnLimitedTime2> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwnLimitedTime2 entity, PostDeleteContext<TConsumeItemOwnLimitedTime2> context) {
    }
}
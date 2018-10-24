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
public class TConsumeItemOwnLimitedTime3Listener implements EntityListener<TConsumeItemOwnLimitedTime3> {

    @Override
    public void preInsert(TConsumeItemOwnLimitedTime3 entity, PreInsertContext<TConsumeItemOwnLimitedTime3> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwnLimitedTime3 entity, PreUpdateContext<TConsumeItemOwnLimitedTime3> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwnLimitedTime3 entity, PreDeleteContext<TConsumeItemOwnLimitedTime3> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwnLimitedTime3 entity, PostInsertContext<TConsumeItemOwnLimitedTime3> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwnLimitedTime3 entity, PostUpdateContext<TConsumeItemOwnLimitedTime3> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwnLimitedTime3 entity, PostDeleteContext<TConsumeItemOwnLimitedTime3> context) {
    }
}
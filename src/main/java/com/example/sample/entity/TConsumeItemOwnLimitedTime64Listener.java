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
public class TConsumeItemOwnLimitedTime64Listener implements EntityListener<TConsumeItemOwnLimitedTime64> {

    @Override
    public void preInsert(TConsumeItemOwnLimitedTime64 entity, PreInsertContext<TConsumeItemOwnLimitedTime64> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwnLimitedTime64 entity, PreUpdateContext<TConsumeItemOwnLimitedTime64> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwnLimitedTime64 entity, PreDeleteContext<TConsumeItemOwnLimitedTime64> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwnLimitedTime64 entity, PostInsertContext<TConsumeItemOwnLimitedTime64> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwnLimitedTime64 entity, PostUpdateContext<TConsumeItemOwnLimitedTime64> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwnLimitedTime64 entity, PostDeleteContext<TConsumeItemOwnLimitedTime64> context) {
    }
}
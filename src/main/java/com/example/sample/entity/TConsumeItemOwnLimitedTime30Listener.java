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
public class TConsumeItemOwnLimitedTime30Listener implements EntityListener<TConsumeItemOwnLimitedTime30> {

    @Override
    public void preInsert(TConsumeItemOwnLimitedTime30 entity, PreInsertContext<TConsumeItemOwnLimitedTime30> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwnLimitedTime30 entity, PreUpdateContext<TConsumeItemOwnLimitedTime30> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwnLimitedTime30 entity, PreDeleteContext<TConsumeItemOwnLimitedTime30> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwnLimitedTime30 entity, PostInsertContext<TConsumeItemOwnLimitedTime30> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwnLimitedTime30 entity, PostUpdateContext<TConsumeItemOwnLimitedTime30> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwnLimitedTime30 entity, PostDeleteContext<TConsumeItemOwnLimitedTime30> context) {
    }
}
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
public class TConsumeItemOwnLimitedTime32Listener implements EntityListener<TConsumeItemOwnLimitedTime32> {

    @Override
    public void preInsert(TConsumeItemOwnLimitedTime32 entity, PreInsertContext<TConsumeItemOwnLimitedTime32> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwnLimitedTime32 entity, PreUpdateContext<TConsumeItemOwnLimitedTime32> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwnLimitedTime32 entity, PreDeleteContext<TConsumeItemOwnLimitedTime32> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwnLimitedTime32 entity, PostInsertContext<TConsumeItemOwnLimitedTime32> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwnLimitedTime32 entity, PostUpdateContext<TConsumeItemOwnLimitedTime32> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwnLimitedTime32 entity, PostDeleteContext<TConsumeItemOwnLimitedTime32> context) {
    }
}
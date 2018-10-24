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
public class TConsumeItemOwnLimitedTime10Listener implements EntityListener<TConsumeItemOwnLimitedTime10> {

    @Override
    public void preInsert(TConsumeItemOwnLimitedTime10 entity, PreInsertContext<TConsumeItemOwnLimitedTime10> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwnLimitedTime10 entity, PreUpdateContext<TConsumeItemOwnLimitedTime10> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwnLimitedTime10 entity, PreDeleteContext<TConsumeItemOwnLimitedTime10> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwnLimitedTime10 entity, PostInsertContext<TConsumeItemOwnLimitedTime10> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwnLimitedTime10 entity, PostUpdateContext<TConsumeItemOwnLimitedTime10> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwnLimitedTime10 entity, PostDeleteContext<TConsumeItemOwnLimitedTime10> context) {
    }
}
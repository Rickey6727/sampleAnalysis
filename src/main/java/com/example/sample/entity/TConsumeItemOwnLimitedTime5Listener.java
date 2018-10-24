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
public class TConsumeItemOwnLimitedTime5Listener implements EntityListener<TConsumeItemOwnLimitedTime5> {

    @Override
    public void preInsert(TConsumeItemOwnLimitedTime5 entity, PreInsertContext<TConsumeItemOwnLimitedTime5> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwnLimitedTime5 entity, PreUpdateContext<TConsumeItemOwnLimitedTime5> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwnLimitedTime5 entity, PreDeleteContext<TConsumeItemOwnLimitedTime5> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwnLimitedTime5 entity, PostInsertContext<TConsumeItemOwnLimitedTime5> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwnLimitedTime5 entity, PostUpdateContext<TConsumeItemOwnLimitedTime5> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwnLimitedTime5 entity, PostDeleteContext<TConsumeItemOwnLimitedTime5> context) {
    }
}
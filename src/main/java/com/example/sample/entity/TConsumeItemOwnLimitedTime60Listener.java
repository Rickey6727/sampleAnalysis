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
public class TConsumeItemOwnLimitedTime60Listener implements EntityListener<TConsumeItemOwnLimitedTime60> {

    @Override
    public void preInsert(TConsumeItemOwnLimitedTime60 entity, PreInsertContext<TConsumeItemOwnLimitedTime60> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwnLimitedTime60 entity, PreUpdateContext<TConsumeItemOwnLimitedTime60> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwnLimitedTime60 entity, PreDeleteContext<TConsumeItemOwnLimitedTime60> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwnLimitedTime60 entity, PostInsertContext<TConsumeItemOwnLimitedTime60> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwnLimitedTime60 entity, PostUpdateContext<TConsumeItemOwnLimitedTime60> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwnLimitedTime60 entity, PostDeleteContext<TConsumeItemOwnLimitedTime60> context) {
    }
}
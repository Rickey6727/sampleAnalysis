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
public class TConsumeItemOwnLimitedTime24Listener implements EntityListener<TConsumeItemOwnLimitedTime24> {

    @Override
    public void preInsert(TConsumeItemOwnLimitedTime24 entity, PreInsertContext<TConsumeItemOwnLimitedTime24> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwnLimitedTime24 entity, PreUpdateContext<TConsumeItemOwnLimitedTime24> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwnLimitedTime24 entity, PreDeleteContext<TConsumeItemOwnLimitedTime24> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwnLimitedTime24 entity, PostInsertContext<TConsumeItemOwnLimitedTime24> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwnLimitedTime24 entity, PostUpdateContext<TConsumeItemOwnLimitedTime24> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwnLimitedTime24 entity, PostDeleteContext<TConsumeItemOwnLimitedTime24> context) {
    }
}
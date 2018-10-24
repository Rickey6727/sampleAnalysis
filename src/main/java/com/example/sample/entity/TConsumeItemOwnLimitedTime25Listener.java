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
public class TConsumeItemOwnLimitedTime25Listener implements EntityListener<TConsumeItemOwnLimitedTime25> {

    @Override
    public void preInsert(TConsumeItemOwnLimitedTime25 entity, PreInsertContext<TConsumeItemOwnLimitedTime25> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwnLimitedTime25 entity, PreUpdateContext<TConsumeItemOwnLimitedTime25> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwnLimitedTime25 entity, PreDeleteContext<TConsumeItemOwnLimitedTime25> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwnLimitedTime25 entity, PostInsertContext<TConsumeItemOwnLimitedTime25> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwnLimitedTime25 entity, PostUpdateContext<TConsumeItemOwnLimitedTime25> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwnLimitedTime25 entity, PostDeleteContext<TConsumeItemOwnLimitedTime25> context) {
    }
}
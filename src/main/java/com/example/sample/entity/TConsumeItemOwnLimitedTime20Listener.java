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
public class TConsumeItemOwnLimitedTime20Listener implements EntityListener<TConsumeItemOwnLimitedTime20> {

    @Override
    public void preInsert(TConsumeItemOwnLimitedTime20 entity, PreInsertContext<TConsumeItemOwnLimitedTime20> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwnLimitedTime20 entity, PreUpdateContext<TConsumeItemOwnLimitedTime20> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwnLimitedTime20 entity, PreDeleteContext<TConsumeItemOwnLimitedTime20> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwnLimitedTime20 entity, PostInsertContext<TConsumeItemOwnLimitedTime20> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwnLimitedTime20 entity, PostUpdateContext<TConsumeItemOwnLimitedTime20> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwnLimitedTime20 entity, PostDeleteContext<TConsumeItemOwnLimitedTime20> context) {
    }
}
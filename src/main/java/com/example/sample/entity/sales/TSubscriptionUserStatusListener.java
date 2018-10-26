package com.example.sample.entity.sales;

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
public class TSubscriptionUserStatusListener implements EntityListener<TSubscriptionUserStatus> {

    @Override
    public void preInsert(TSubscriptionUserStatus entity, PreInsertContext<TSubscriptionUserStatus> context) {
    }

    @Override
    public void preUpdate(TSubscriptionUserStatus entity, PreUpdateContext<TSubscriptionUserStatus> context) {
    }

    @Override
    public void preDelete(TSubscriptionUserStatus entity, PreDeleteContext<TSubscriptionUserStatus> context) {
    }

    @Override
    public void postInsert(TSubscriptionUserStatus entity, PostInsertContext<TSubscriptionUserStatus> context) {
    }

    @Override
    public void postUpdate(TSubscriptionUserStatus entity, PostUpdateContext<TSubscriptionUserStatus> context) {
    }

    @Override
    public void postDelete(TSubscriptionUserStatus entity, PostDeleteContext<TSubscriptionUserStatus> context) {
    }
}
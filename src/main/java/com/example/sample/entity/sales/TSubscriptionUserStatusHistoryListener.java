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
public class TSubscriptionUserStatusHistoryListener implements EntityListener<TSubscriptionUserStatusHistory> {

    @Override
    public void preInsert(TSubscriptionUserStatusHistory entity, PreInsertContext<TSubscriptionUserStatusHistory> context) {
    }

    @Override
    public void preUpdate(TSubscriptionUserStatusHistory entity, PreUpdateContext<TSubscriptionUserStatusHistory> context) {
    }

    @Override
    public void preDelete(TSubscriptionUserStatusHistory entity, PreDeleteContext<TSubscriptionUserStatusHistory> context) {
    }

    @Override
    public void postInsert(TSubscriptionUserStatusHistory entity, PostInsertContext<TSubscriptionUserStatusHistory> context) {
    }

    @Override
    public void postUpdate(TSubscriptionUserStatusHistory entity, PostUpdateContext<TSubscriptionUserStatusHistory> context) {
    }

    @Override
    public void postDelete(TSubscriptionUserStatusHistory entity, PostDeleteContext<TSubscriptionUserStatusHistory> context) {
    }
}
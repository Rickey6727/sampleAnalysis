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
public class TSubscriptionFreeGachaHistoryListener implements EntityListener<TSubscriptionFreeGachaHistory> {

    @Override
    public void preInsert(TSubscriptionFreeGachaHistory entity, PreInsertContext<TSubscriptionFreeGachaHistory> context) {
    }

    @Override
    public void preUpdate(TSubscriptionFreeGachaHistory entity, PreUpdateContext<TSubscriptionFreeGachaHistory> context) {
    }

    @Override
    public void preDelete(TSubscriptionFreeGachaHistory entity, PreDeleteContext<TSubscriptionFreeGachaHistory> context) {
    }

    @Override
    public void postInsert(TSubscriptionFreeGachaHistory entity, PostInsertContext<TSubscriptionFreeGachaHistory> context) {
    }

    @Override
    public void postUpdate(TSubscriptionFreeGachaHistory entity, PostUpdateContext<TSubscriptionFreeGachaHistory> context) {
    }

    @Override
    public void postDelete(TSubscriptionFreeGachaHistory entity, PostDeleteContext<TSubscriptionFreeGachaHistory> context) {
    }
}
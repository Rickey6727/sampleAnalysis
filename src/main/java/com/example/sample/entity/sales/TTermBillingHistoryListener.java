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
public class TTermBillingHistoryListener implements EntityListener<TTermBillingHistory> {

    @Override
    public void preInsert(TTermBillingHistory entity, PreInsertContext<TTermBillingHistory> context) {
    }

    @Override
    public void preUpdate(TTermBillingHistory entity, PreUpdateContext<TTermBillingHistory> context) {
    }

    @Override
    public void preDelete(TTermBillingHistory entity, PreDeleteContext<TTermBillingHistory> context) {
    }

    @Override
    public void postInsert(TTermBillingHistory entity, PostInsertContext<TTermBillingHistory> context) {
    }

    @Override
    public void postUpdate(TTermBillingHistory entity, PostUpdateContext<TTermBillingHistory> context) {
    }

    @Override
    public void postDelete(TTermBillingHistory entity, PostDeleteContext<TTermBillingHistory> context) {
    }
}
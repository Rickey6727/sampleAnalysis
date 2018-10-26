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
public class TTermBillingCountHistoryListener implements EntityListener<TTermBillingCountHistory> {

    @Override
    public void preInsert(TTermBillingCountHistory entity, PreInsertContext<TTermBillingCountHistory> context) {
    }

    @Override
    public void preUpdate(TTermBillingCountHistory entity, PreUpdateContext<TTermBillingCountHistory> context) {
    }

    @Override
    public void preDelete(TTermBillingCountHistory entity, PreDeleteContext<TTermBillingCountHistory> context) {
    }

    @Override
    public void postInsert(TTermBillingCountHistory entity, PostInsertContext<TTermBillingCountHistory> context) {
    }

    @Override
    public void postUpdate(TTermBillingCountHistory entity, PostUpdateContext<TTermBillingCountHistory> context) {
    }

    @Override
    public void postDelete(TTermBillingCountHistory entity, PostDeleteContext<TTermBillingCountHistory> context) {
    }
}
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
public class TBillingHistoryListener implements EntityListener<TBillingHistory> {

    @Override
    public void preInsert(TBillingHistory entity, PreInsertContext<TBillingHistory> context) {
    }

    @Override
    public void preUpdate(TBillingHistory entity, PreUpdateContext<TBillingHistory> context) {
    }

    @Override
    public void preDelete(TBillingHistory entity, PreDeleteContext<TBillingHistory> context) {
    }

    @Override
    public void postInsert(TBillingHistory entity, PostInsertContext<TBillingHistory> context) {
    }

    @Override
    public void postUpdate(TBillingHistory entity, PostUpdateContext<TBillingHistory> context) {
    }

    @Override
    public void postDelete(TBillingHistory entity, PostDeleteContext<TBillingHistory> context) {
    }
}
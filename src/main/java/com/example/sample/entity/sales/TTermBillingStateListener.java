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
public class TTermBillingStateListener implements EntityListener<TTermBillingState> {

    @Override
    public void preInsert(TTermBillingState entity, PreInsertContext<TTermBillingState> context) {
    }

    @Override
    public void preUpdate(TTermBillingState entity, PreUpdateContext<TTermBillingState> context) {
    }

    @Override
    public void preDelete(TTermBillingState entity, PreDeleteContext<TTermBillingState> context) {
    }

    @Override
    public void postInsert(TTermBillingState entity, PostInsertContext<TTermBillingState> context) {
    }

    @Override
    public void postUpdate(TTermBillingState entity, PostUpdateContext<TTermBillingState> context) {
    }

    @Override
    public void postDelete(TTermBillingState entity, PostDeleteContext<TTermBillingState> context) {
    }
}
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
public class MTermBillingDaysListener implements EntityListener<MTermBillingDays> {

    @Override
    public void preInsert(MTermBillingDays entity, PreInsertContext<MTermBillingDays> context) {
    }

    @Override
    public void preUpdate(MTermBillingDays entity, PreUpdateContext<MTermBillingDays> context) {
    }

    @Override
    public void preDelete(MTermBillingDays entity, PreDeleteContext<MTermBillingDays> context) {
    }

    @Override
    public void postInsert(MTermBillingDays entity, PostInsertContext<MTermBillingDays> context) {
    }

    @Override
    public void postUpdate(MTermBillingDays entity, PostUpdateContext<MTermBillingDays> context) {
    }

    @Override
    public void postDelete(MTermBillingDays entity, PostDeleteContext<MTermBillingDays> context) {
    }
}
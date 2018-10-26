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
public class TBillingMonthlyStageAccountListener implements EntityListener<TBillingMonthlyStageAccount> {

    @Override
    public void preInsert(TBillingMonthlyStageAccount entity, PreInsertContext<TBillingMonthlyStageAccount> context) {
    }

    @Override
    public void preUpdate(TBillingMonthlyStageAccount entity, PreUpdateContext<TBillingMonthlyStageAccount> context) {
    }

    @Override
    public void preDelete(TBillingMonthlyStageAccount entity, PreDeleteContext<TBillingMonthlyStageAccount> context) {
    }

    @Override
    public void postInsert(TBillingMonthlyStageAccount entity, PostInsertContext<TBillingMonthlyStageAccount> context) {
    }

    @Override
    public void postUpdate(TBillingMonthlyStageAccount entity, PostUpdateContext<TBillingMonthlyStageAccount> context) {
    }

    @Override
    public void postDelete(TBillingMonthlyStageAccount entity, PostDeleteContext<TBillingMonthlyStageAccount> context) {
    }
}
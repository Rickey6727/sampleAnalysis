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
public class TBillingMonthlyStageFirstAccountListener implements EntityListener<TBillingMonthlyStageFirstAccount> {

    @Override
    public void preInsert(TBillingMonthlyStageFirstAccount entity, PreInsertContext<TBillingMonthlyStageFirstAccount> context) {
    }

    @Override
    public void preUpdate(TBillingMonthlyStageFirstAccount entity, PreUpdateContext<TBillingMonthlyStageFirstAccount> context) {
    }

    @Override
    public void preDelete(TBillingMonthlyStageFirstAccount entity, PreDeleteContext<TBillingMonthlyStageFirstAccount> context) {
    }

    @Override
    public void postInsert(TBillingMonthlyStageFirstAccount entity, PostInsertContext<TBillingMonthlyStageFirstAccount> context) {
    }

    @Override
    public void postUpdate(TBillingMonthlyStageFirstAccount entity, PostUpdateContext<TBillingMonthlyStageFirstAccount> context) {
    }

    @Override
    public void postDelete(TBillingMonthlyStageFirstAccount entity, PostDeleteContext<TBillingMonthlyStageFirstAccount> context) {
    }
}
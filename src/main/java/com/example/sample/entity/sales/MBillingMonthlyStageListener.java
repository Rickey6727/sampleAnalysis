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
public class MBillingMonthlyStageListener implements EntityListener<MBillingMonthlyStage> {

    @Override
    public void preInsert(MBillingMonthlyStage entity, PreInsertContext<MBillingMonthlyStage> context) {
    }

    @Override
    public void preUpdate(MBillingMonthlyStage entity, PreUpdateContext<MBillingMonthlyStage> context) {
    }

    @Override
    public void preDelete(MBillingMonthlyStage entity, PreDeleteContext<MBillingMonthlyStage> context) {
    }

    @Override
    public void postInsert(MBillingMonthlyStage entity, PostInsertContext<MBillingMonthlyStage> context) {
    }

    @Override
    public void postUpdate(MBillingMonthlyStage entity, PostUpdateContext<MBillingMonthlyStage> context) {
    }

    @Override
    public void postDelete(MBillingMonthlyStage entity, PostDeleteContext<MBillingMonthlyStage> context) {
    }
}
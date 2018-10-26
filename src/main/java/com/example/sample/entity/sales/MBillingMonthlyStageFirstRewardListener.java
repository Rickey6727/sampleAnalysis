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
public class MBillingMonthlyStageFirstRewardListener implements EntityListener<MBillingMonthlyStageFirstReward> {

    @Override
    public void preInsert(MBillingMonthlyStageFirstReward entity, PreInsertContext<MBillingMonthlyStageFirstReward> context) {
    }

    @Override
    public void preUpdate(MBillingMonthlyStageFirstReward entity, PreUpdateContext<MBillingMonthlyStageFirstReward> context) {
    }

    @Override
    public void preDelete(MBillingMonthlyStageFirstReward entity, PreDeleteContext<MBillingMonthlyStageFirstReward> context) {
    }

    @Override
    public void postInsert(MBillingMonthlyStageFirstReward entity, PostInsertContext<MBillingMonthlyStageFirstReward> context) {
    }

    @Override
    public void postUpdate(MBillingMonthlyStageFirstReward entity, PostUpdateContext<MBillingMonthlyStageFirstReward> context) {
    }

    @Override
    public void postDelete(MBillingMonthlyStageFirstReward entity, PostDeleteContext<MBillingMonthlyStageFirstReward> context) {
    }
}
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
public class MBillingMonthlyStageRewardListener implements EntityListener<MBillingMonthlyStageReward> {

    @Override
    public void preInsert(MBillingMonthlyStageReward entity, PreInsertContext<MBillingMonthlyStageReward> context) {
    }

    @Override
    public void preUpdate(MBillingMonthlyStageReward entity, PreUpdateContext<MBillingMonthlyStageReward> context) {
    }

    @Override
    public void preDelete(MBillingMonthlyStageReward entity, PreDeleteContext<MBillingMonthlyStageReward> context) {
    }

    @Override
    public void postInsert(MBillingMonthlyStageReward entity, PostInsertContext<MBillingMonthlyStageReward> context) {
    }

    @Override
    public void postUpdate(MBillingMonthlyStageReward entity, PostUpdateContext<MBillingMonthlyStageReward> context) {
    }

    @Override
    public void postDelete(MBillingMonthlyStageReward entity, PostDeleteContext<MBillingMonthlyStageReward> context) {
    }
}
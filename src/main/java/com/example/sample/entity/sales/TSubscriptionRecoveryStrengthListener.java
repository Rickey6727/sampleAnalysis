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
public class TSubscriptionRecoveryStrengthListener implements EntityListener<TSubscriptionRecoveryStrength> {

    @Override
    public void preInsert(TSubscriptionRecoveryStrength entity, PreInsertContext<TSubscriptionRecoveryStrength> context) {
    }

    @Override
    public void preUpdate(TSubscriptionRecoveryStrength entity, PreUpdateContext<TSubscriptionRecoveryStrength> context) {
    }

    @Override
    public void preDelete(TSubscriptionRecoveryStrength entity, PreDeleteContext<TSubscriptionRecoveryStrength> context) {
    }

    @Override
    public void postInsert(TSubscriptionRecoveryStrength entity, PostInsertContext<TSubscriptionRecoveryStrength> context) {
    }

    @Override
    public void postUpdate(TSubscriptionRecoveryStrength entity, PostUpdateContext<TSubscriptionRecoveryStrength> context) {
    }

    @Override
    public void postDelete(TSubscriptionRecoveryStrength entity, PostDeleteContext<TSubscriptionRecoveryStrength> context) {
    }
}
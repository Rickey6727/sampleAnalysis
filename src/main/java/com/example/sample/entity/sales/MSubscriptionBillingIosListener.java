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
public class MSubscriptionBillingIosListener implements EntityListener<MSubscriptionBillingIos> {

    @Override
    public void preInsert(MSubscriptionBillingIos entity, PreInsertContext<MSubscriptionBillingIos> context) {
    }

    @Override
    public void preUpdate(MSubscriptionBillingIos entity, PreUpdateContext<MSubscriptionBillingIos> context) {
    }

    @Override
    public void preDelete(MSubscriptionBillingIos entity, PreDeleteContext<MSubscriptionBillingIos> context) {
    }

    @Override
    public void postInsert(MSubscriptionBillingIos entity, PostInsertContext<MSubscriptionBillingIos> context) {
    }

    @Override
    public void postUpdate(MSubscriptionBillingIos entity, PostUpdateContext<MSubscriptionBillingIos> context) {
    }

    @Override
    public void postDelete(MSubscriptionBillingIos entity, PostDeleteContext<MSubscriptionBillingIos> context) {
    }
}
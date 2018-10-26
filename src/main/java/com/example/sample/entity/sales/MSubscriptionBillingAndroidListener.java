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
public class MSubscriptionBillingAndroidListener implements EntityListener<MSubscriptionBillingAndroid> {

    @Override
    public void preInsert(MSubscriptionBillingAndroid entity, PreInsertContext<MSubscriptionBillingAndroid> context) {
    }

    @Override
    public void preUpdate(MSubscriptionBillingAndroid entity, PreUpdateContext<MSubscriptionBillingAndroid> context) {
    }

    @Override
    public void preDelete(MSubscriptionBillingAndroid entity, PreDeleteContext<MSubscriptionBillingAndroid> context) {
    }

    @Override
    public void postInsert(MSubscriptionBillingAndroid entity, PostInsertContext<MSubscriptionBillingAndroid> context) {
    }

    @Override
    public void postUpdate(MSubscriptionBillingAndroid entity, PostUpdateContext<MSubscriptionBillingAndroid> context) {
    }

    @Override
    public void postDelete(MSubscriptionBillingAndroid entity, PostDeleteContext<MSubscriptionBillingAndroid> context) {
    }
}
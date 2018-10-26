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
public class TBillingAndroidListener implements EntityListener<TBillingAndroid> {

    @Override
    public void preInsert(TBillingAndroid entity, PreInsertContext<TBillingAndroid> context) {
    }

    @Override
    public void preUpdate(TBillingAndroid entity, PreUpdateContext<TBillingAndroid> context) {
    }

    @Override
    public void preDelete(TBillingAndroid entity, PreDeleteContext<TBillingAndroid> context) {
    }

    @Override
    public void postInsert(TBillingAndroid entity, PostInsertContext<TBillingAndroid> context) {
    }

    @Override
    public void postUpdate(TBillingAndroid entity, PostUpdateContext<TBillingAndroid> context) {
    }

    @Override
    public void postDelete(TBillingAndroid entity, PostDeleteContext<TBillingAndroid> context) {
    }
}
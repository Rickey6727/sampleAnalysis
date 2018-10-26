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
public class MBillingAndroidListener implements EntityListener<MBillingAndroid> {

    @Override
    public void preInsert(MBillingAndroid entity, PreInsertContext<MBillingAndroid> context) {
    }

    @Override
    public void preUpdate(MBillingAndroid entity, PreUpdateContext<MBillingAndroid> context) {
    }

    @Override
    public void preDelete(MBillingAndroid entity, PreDeleteContext<MBillingAndroid> context) {
    }

    @Override
    public void postInsert(MBillingAndroid entity, PostInsertContext<MBillingAndroid> context) {
    }

    @Override
    public void postUpdate(MBillingAndroid entity, PostUpdateContext<MBillingAndroid> context) {
    }

    @Override
    public void postDelete(MBillingAndroid entity, PostDeleteContext<MBillingAndroid> context) {
    }
}
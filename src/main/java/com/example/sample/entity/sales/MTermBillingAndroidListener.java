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
public class MTermBillingAndroidListener implements EntityListener<MTermBillingAndroid> {

    @Override
    public void preInsert(MTermBillingAndroid entity, PreInsertContext<MTermBillingAndroid> context) {
    }

    @Override
    public void preUpdate(MTermBillingAndroid entity, PreUpdateContext<MTermBillingAndroid> context) {
    }

    @Override
    public void preDelete(MTermBillingAndroid entity, PreDeleteContext<MTermBillingAndroid> context) {
    }

    @Override
    public void postInsert(MTermBillingAndroid entity, PostInsertContext<MTermBillingAndroid> context) {
    }

    @Override
    public void postUpdate(MTermBillingAndroid entity, PostUpdateContext<MTermBillingAndroid> context) {
    }

    @Override
    public void postDelete(MTermBillingAndroid entity, PostDeleteContext<MTermBillingAndroid> context) {
    }
}
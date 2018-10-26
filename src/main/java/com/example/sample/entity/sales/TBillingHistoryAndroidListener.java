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
public class TBillingHistoryAndroidListener implements EntityListener<TBillingHistoryAndroid> {

    @Override
    public void preInsert(TBillingHistoryAndroid entity, PreInsertContext<TBillingHistoryAndroid> context) {
    }

    @Override
    public void preUpdate(TBillingHistoryAndroid entity, PreUpdateContext<TBillingHistoryAndroid> context) {
    }

    @Override
    public void preDelete(TBillingHistoryAndroid entity, PreDeleteContext<TBillingHistoryAndroid> context) {
    }

    @Override
    public void postInsert(TBillingHistoryAndroid entity, PostInsertContext<TBillingHistoryAndroid> context) {
    }

    @Override
    public void postUpdate(TBillingHistoryAndroid entity, PostUpdateContext<TBillingHistoryAndroid> context) {
    }

    @Override
    public void postDelete(TBillingHistoryAndroid entity, PostDeleteContext<TBillingHistoryAndroid> context) {
    }
}
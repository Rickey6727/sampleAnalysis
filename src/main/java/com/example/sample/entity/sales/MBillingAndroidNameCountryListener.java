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
public class MBillingAndroidNameCountryListener implements EntityListener<MBillingAndroidNameCountry> {

    @Override
    public void preInsert(MBillingAndroidNameCountry entity, PreInsertContext<MBillingAndroidNameCountry> context) {
    }

    @Override
    public void preUpdate(MBillingAndroidNameCountry entity, PreUpdateContext<MBillingAndroidNameCountry> context) {
    }

    @Override
    public void preDelete(MBillingAndroidNameCountry entity, PreDeleteContext<MBillingAndroidNameCountry> context) {
    }

    @Override
    public void postInsert(MBillingAndroidNameCountry entity, PostInsertContext<MBillingAndroidNameCountry> context) {
    }

    @Override
    public void postUpdate(MBillingAndroidNameCountry entity, PostUpdateContext<MBillingAndroidNameCountry> context) {
    }

    @Override
    public void postDelete(MBillingAndroidNameCountry entity, PostDeleteContext<MBillingAndroidNameCountry> context) {
    }
}
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
public class MBillingNameCountryListener implements EntityListener<MBillingNameCountry> {

    @Override
    public void preInsert(MBillingNameCountry entity, PreInsertContext<MBillingNameCountry> context) {
    }

    @Override
    public void preUpdate(MBillingNameCountry entity, PreUpdateContext<MBillingNameCountry> context) {
    }

    @Override
    public void preDelete(MBillingNameCountry entity, PreDeleteContext<MBillingNameCountry> context) {
    }

    @Override
    public void postInsert(MBillingNameCountry entity, PostInsertContext<MBillingNameCountry> context) {
    }

    @Override
    public void postUpdate(MBillingNameCountry entity, PostUpdateContext<MBillingNameCountry> context) {
    }

    @Override
    public void postDelete(MBillingNameCountry entity, PostDeleteContext<MBillingNameCountry> context) {
    }
}
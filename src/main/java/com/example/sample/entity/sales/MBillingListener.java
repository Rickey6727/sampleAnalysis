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
public class MBillingListener implements EntityListener<MBilling> {

    @Override
    public void preInsert(MBilling entity, PreInsertContext<MBilling> context) {
    }

    @Override
    public void preUpdate(MBilling entity, PreUpdateContext<MBilling> context) {
    }

    @Override
    public void preDelete(MBilling entity, PreDeleteContext<MBilling> context) {
    }

    @Override
    public void postInsert(MBilling entity, PostInsertContext<MBilling> context) {
    }

    @Override
    public void postUpdate(MBilling entity, PostUpdateContext<MBilling> context) {
    }

    @Override
    public void postDelete(MBilling entity, PostDeleteContext<MBilling> context) {
    }
}
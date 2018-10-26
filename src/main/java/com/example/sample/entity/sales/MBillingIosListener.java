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
public class MBillingIosListener implements EntityListener<MBillingIos> {

    @Override
    public void preInsert(MBillingIos entity, PreInsertContext<MBillingIos> context) {
    }

    @Override
    public void preUpdate(MBillingIos entity, PreUpdateContext<MBillingIos> context) {
    }

    @Override
    public void preDelete(MBillingIos entity, PreDeleteContext<MBillingIos> context) {
    }

    @Override
    public void postInsert(MBillingIos entity, PostInsertContext<MBillingIos> context) {
    }

    @Override
    public void postUpdate(MBillingIos entity, PostUpdateContext<MBillingIos> context) {
    }

    @Override
    public void postDelete(MBillingIos entity, PostDeleteContext<MBillingIos> context) {
    }
}
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
public class MTermBillingIosListener implements EntityListener<MTermBillingIos> {

    @Override
    public void preInsert(MTermBillingIos entity, PreInsertContext<MTermBillingIos> context) {
    }

    @Override
    public void preUpdate(MTermBillingIos entity, PreUpdateContext<MTermBillingIos> context) {
    }

    @Override
    public void preDelete(MTermBillingIos entity, PreDeleteContext<MTermBillingIos> context) {
    }

    @Override
    public void postInsert(MTermBillingIos entity, PostInsertContext<MTermBillingIos> context) {
    }

    @Override
    public void postUpdate(MTermBillingIos entity, PostUpdateContext<MTermBillingIos> context) {
    }

    @Override
    public void postDelete(MTermBillingIos entity, PostDeleteContext<MTermBillingIos> context) {
    }
}
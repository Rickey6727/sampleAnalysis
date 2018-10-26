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
public class TBeginnerBillingListener implements EntityListener<TBeginnerBilling> {

    @Override
    public void preInsert(TBeginnerBilling entity, PreInsertContext<TBeginnerBilling> context) {
    }

    @Override
    public void preUpdate(TBeginnerBilling entity, PreUpdateContext<TBeginnerBilling> context) {
    }

    @Override
    public void preDelete(TBeginnerBilling entity, PreDeleteContext<TBeginnerBilling> context) {
    }

    @Override
    public void postInsert(TBeginnerBilling entity, PostInsertContext<TBeginnerBilling> context) {
    }

    @Override
    public void postUpdate(TBeginnerBilling entity, PostUpdateContext<TBeginnerBilling> context) {
    }

    @Override
    public void postDelete(TBeginnerBilling entity, PostDeleteContext<TBeginnerBilling> context) {
    }
}
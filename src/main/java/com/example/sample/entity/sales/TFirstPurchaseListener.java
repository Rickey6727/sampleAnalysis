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
public class TFirstPurchaseListener implements EntityListener<TFirstPurchase> {

    @Override
    public void preInsert(TFirstPurchase entity, PreInsertContext<TFirstPurchase> context) {
    }

    @Override
    public void preUpdate(TFirstPurchase entity, PreUpdateContext<TFirstPurchase> context) {
    }

    @Override
    public void preDelete(TFirstPurchase entity, PreDeleteContext<TFirstPurchase> context) {
    }

    @Override
    public void postInsert(TFirstPurchase entity, PostInsertContext<TFirstPurchase> context) {
    }

    @Override
    public void postUpdate(TFirstPurchase entity, PostUpdateContext<TFirstPurchase> context) {
    }

    @Override
    public void postDelete(TFirstPurchase entity, PostDeleteContext<TFirstPurchase> context) {
    }
}
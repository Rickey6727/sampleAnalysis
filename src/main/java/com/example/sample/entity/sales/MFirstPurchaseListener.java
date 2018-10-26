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
public class MFirstPurchaseListener implements EntityListener<MFirstPurchase> {

    @Override
    public void preInsert(MFirstPurchase entity, PreInsertContext<MFirstPurchase> context) {
    }

    @Override
    public void preUpdate(MFirstPurchase entity, PreUpdateContext<MFirstPurchase> context) {
    }

    @Override
    public void preDelete(MFirstPurchase entity, PreDeleteContext<MFirstPurchase> context) {
    }

    @Override
    public void postInsert(MFirstPurchase entity, PostInsertContext<MFirstPurchase> context) {
    }

    @Override
    public void postUpdate(MFirstPurchase entity, PostUpdateContext<MFirstPurchase> context) {
    }

    @Override
    public void postDelete(MFirstPurchase entity, PostDeleteContext<MFirstPurchase> context) {
    }
}
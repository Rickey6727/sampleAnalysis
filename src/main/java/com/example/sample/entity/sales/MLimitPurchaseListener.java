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
public class MLimitPurchaseListener implements EntityListener<MLimitPurchase> {

    @Override
    public void preInsert(MLimitPurchase entity, PreInsertContext<MLimitPurchase> context) {
    }

    @Override
    public void preUpdate(MLimitPurchase entity, PreUpdateContext<MLimitPurchase> context) {
    }

    @Override
    public void preDelete(MLimitPurchase entity, PreDeleteContext<MLimitPurchase> context) {
    }

    @Override
    public void postInsert(MLimitPurchase entity, PostInsertContext<MLimitPurchase> context) {
    }

    @Override
    public void postUpdate(MLimitPurchase entity, PostUpdateContext<MLimitPurchase> context) {
    }

    @Override
    public void postDelete(MLimitPurchase entity, PostDeleteContext<MLimitPurchase> context) {
    }
}
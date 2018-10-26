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
public class MLimitPurchaseItemListener implements EntityListener<MLimitPurchaseItem> {

    @Override
    public void preInsert(MLimitPurchaseItem entity, PreInsertContext<MLimitPurchaseItem> context) {
    }

    @Override
    public void preUpdate(MLimitPurchaseItem entity, PreUpdateContext<MLimitPurchaseItem> context) {
    }

    @Override
    public void preDelete(MLimitPurchaseItem entity, PreDeleteContext<MLimitPurchaseItem> context) {
    }

    @Override
    public void postInsert(MLimitPurchaseItem entity, PostInsertContext<MLimitPurchaseItem> context) {
    }

    @Override
    public void postUpdate(MLimitPurchaseItem entity, PostUpdateContext<MLimitPurchaseItem> context) {
    }

    @Override
    public void postDelete(MLimitPurchaseItem entity, PostDeleteContext<MLimitPurchaseItem> context) {
    }
}
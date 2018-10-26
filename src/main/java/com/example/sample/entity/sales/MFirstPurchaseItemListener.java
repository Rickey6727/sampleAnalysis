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
public class MFirstPurchaseItemListener implements EntityListener<MFirstPurchaseItem> {

    @Override
    public void preInsert(MFirstPurchaseItem entity, PreInsertContext<MFirstPurchaseItem> context) {
    }

    @Override
    public void preUpdate(MFirstPurchaseItem entity, PreUpdateContext<MFirstPurchaseItem> context) {
    }

    @Override
    public void preDelete(MFirstPurchaseItem entity, PreDeleteContext<MFirstPurchaseItem> context) {
    }

    @Override
    public void postInsert(MFirstPurchaseItem entity, PostInsertContext<MFirstPurchaseItem> context) {
    }

    @Override
    public void postUpdate(MFirstPurchaseItem entity, PostUpdateContext<MFirstPurchaseItem> context) {
    }

    @Override
    public void postDelete(MFirstPurchaseItem entity, PostDeleteContext<MFirstPurchaseItem> context) {
    }
}
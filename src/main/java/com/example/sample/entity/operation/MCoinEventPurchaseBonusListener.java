package com.example.sample.entity.operation;

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
public class MCoinEventPurchaseBonusListener implements EntityListener<MCoinEventPurchaseBonus> {

    @Override
    public void preInsert(MCoinEventPurchaseBonus entity, PreInsertContext<MCoinEventPurchaseBonus> context) {
    }

    @Override
    public void preUpdate(MCoinEventPurchaseBonus entity, PreUpdateContext<MCoinEventPurchaseBonus> context) {
    }

    @Override
    public void preDelete(MCoinEventPurchaseBonus entity, PreDeleteContext<MCoinEventPurchaseBonus> context) {
    }

    @Override
    public void postInsert(MCoinEventPurchaseBonus entity, PostInsertContext<MCoinEventPurchaseBonus> context) {
    }

    @Override
    public void postUpdate(MCoinEventPurchaseBonus entity, PostUpdateContext<MCoinEventPurchaseBonus> context) {
    }

    @Override
    public void postDelete(MCoinEventPurchaseBonus entity, PostDeleteContext<MCoinEventPurchaseBonus> context) {
    }
}
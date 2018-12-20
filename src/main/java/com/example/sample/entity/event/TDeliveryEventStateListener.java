package com.example.sample.entity.event;

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
public class TDeliveryEventStateListener implements EntityListener<TDeliveryEventState> {

    @Override
    public void preInsert(TDeliveryEventState entity, PreInsertContext<TDeliveryEventState> context) {
    }

    @Override
    public void preUpdate(TDeliveryEventState entity, PreUpdateContext<TDeliveryEventState> context) {
    }

    @Override
    public void preDelete(TDeliveryEventState entity, PreDeleteContext<TDeliveryEventState> context) {
    }

    @Override
    public void postInsert(TDeliveryEventState entity, PostInsertContext<TDeliveryEventState> context) {
    }

    @Override
    public void postUpdate(TDeliveryEventState entity, PostUpdateContext<TDeliveryEventState> context) {
    }

    @Override
    public void postDelete(TDeliveryEventState entity, PostDeleteContext<TDeliveryEventState> context) {
    }
}
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
public class MDeliveryEventListener implements EntityListener<MDeliveryEvent> {

    @Override
    public void preInsert(MDeliveryEvent entity, PreInsertContext<MDeliveryEvent> context) {
    }

    @Override
    public void preUpdate(MDeliveryEvent entity, PreUpdateContext<MDeliveryEvent> context) {
    }

    @Override
    public void preDelete(MDeliveryEvent entity, PreDeleteContext<MDeliveryEvent> context) {
    }

    @Override
    public void postInsert(MDeliveryEvent entity, PostInsertContext<MDeliveryEvent> context) {
    }

    @Override
    public void postUpdate(MDeliveryEvent entity, PostUpdateContext<MDeliveryEvent> context) {
    }

    @Override
    public void postDelete(MDeliveryEvent entity, PostDeleteContext<MDeliveryEvent> context) {
    }
}
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
public class MCoinEventBridgeListener implements EntityListener<MCoinEventBridge> {

    @Override
    public void preInsert(MCoinEventBridge entity, PreInsertContext<MCoinEventBridge> context) {
    }

    @Override
    public void preUpdate(MCoinEventBridge entity, PreUpdateContext<MCoinEventBridge> context) {
    }

    @Override
    public void preDelete(MCoinEventBridge entity, PreDeleteContext<MCoinEventBridge> context) {
    }

    @Override
    public void postInsert(MCoinEventBridge entity, PostInsertContext<MCoinEventBridge> context) {
    }

    @Override
    public void postUpdate(MCoinEventBridge entity, PostUpdateContext<MCoinEventBridge> context) {
    }

    @Override
    public void postDelete(MCoinEventBridge entity, PostDeleteContext<MCoinEventBridge> context) {
    }
}
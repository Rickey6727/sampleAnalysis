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
public class MCoinEventListener implements EntityListener<MCoinEvent> {

    @Override
    public void preInsert(MCoinEvent entity, PreInsertContext<MCoinEvent> context) {
    }

    @Override
    public void preUpdate(MCoinEvent entity, PreUpdateContext<MCoinEvent> context) {
    }

    @Override
    public void preDelete(MCoinEvent entity, PreDeleteContext<MCoinEvent> context) {
    }

    @Override
    public void postInsert(MCoinEvent entity, PostInsertContext<MCoinEvent> context) {
    }

    @Override
    public void postUpdate(MCoinEvent entity, PostUpdateContext<MCoinEvent> context) {
    }

    @Override
    public void postDelete(MCoinEvent entity, PostDeleteContext<MCoinEvent> context) {
    }
}
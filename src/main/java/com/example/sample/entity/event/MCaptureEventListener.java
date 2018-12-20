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
public class MCaptureEventListener implements EntityListener<MCaptureEvent> {

    @Override
    public void preInsert(MCaptureEvent entity, PreInsertContext<MCaptureEvent> context) {
    }

    @Override
    public void preUpdate(MCaptureEvent entity, PreUpdateContext<MCaptureEvent> context) {
    }

    @Override
    public void preDelete(MCaptureEvent entity, PreDeleteContext<MCaptureEvent> context) {
    }

    @Override
    public void postInsert(MCaptureEvent entity, PostInsertContext<MCaptureEvent> context) {
    }

    @Override
    public void postUpdate(MCaptureEvent entity, PostUpdateContext<MCaptureEvent> context) {
    }

    @Override
    public void postDelete(MCaptureEvent entity, PostDeleteContext<MCaptureEvent> context) {
    }
}
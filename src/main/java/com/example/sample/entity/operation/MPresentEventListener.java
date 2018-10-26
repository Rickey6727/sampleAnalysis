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
public class MPresentEventListener implements EntityListener<MPresentEvent> {

    @Override
    public void preInsert(MPresentEvent entity, PreInsertContext<MPresentEvent> context) {
    }

    @Override
    public void preUpdate(MPresentEvent entity, PreUpdateContext<MPresentEvent> context) {
    }

    @Override
    public void preDelete(MPresentEvent entity, PreDeleteContext<MPresentEvent> context) {
    }

    @Override
    public void postInsert(MPresentEvent entity, PostInsertContext<MPresentEvent> context) {
    }

    @Override
    public void postUpdate(MPresentEvent entity, PostUpdateContext<MPresentEvent> context) {
    }

    @Override
    public void postDelete(MPresentEvent entity, PostDeleteContext<MPresentEvent> context) {
    }
}
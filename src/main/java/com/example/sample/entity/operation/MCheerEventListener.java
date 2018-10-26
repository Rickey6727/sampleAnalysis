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
public class MCheerEventListener implements EntityListener<MCheerEvent> {

    @Override
    public void preInsert(MCheerEvent entity, PreInsertContext<MCheerEvent> context) {
    }

    @Override
    public void preUpdate(MCheerEvent entity, PreUpdateContext<MCheerEvent> context) {
    }

    @Override
    public void preDelete(MCheerEvent entity, PreDeleteContext<MCheerEvent> context) {
    }

    @Override
    public void postInsert(MCheerEvent entity, PostInsertContext<MCheerEvent> context) {
    }

    @Override
    public void postUpdate(MCheerEvent entity, PostUpdateContext<MCheerEvent> context) {
    }

    @Override
    public void postDelete(MCheerEvent entity, PostDeleteContext<MCheerEvent> context) {
    }
}
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
public class MEventListener implements EntityListener<MEvent> {

    @Override
    public void preInsert(MEvent entity, PreInsertContext<MEvent> context) {
    }

    @Override
    public void preUpdate(MEvent entity, PreUpdateContext<MEvent> context) {
    }

    @Override
    public void preDelete(MEvent entity, PreDeleteContext<MEvent> context) {
    }

    @Override
    public void postInsert(MEvent entity, PostInsertContext<MEvent> context) {
    }

    @Override
    public void postUpdate(MEvent entity, PostUpdateContext<MEvent> context) {
    }

    @Override
    public void postDelete(MEvent entity, PostDeleteContext<MEvent> context) {
    }
}
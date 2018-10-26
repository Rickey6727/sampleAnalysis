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
public class MRaiseEventListener implements EntityListener<MRaiseEvent> {

    @Override
    public void preInsert(MRaiseEvent entity, PreInsertContext<MRaiseEvent> context) {
    }

    @Override
    public void preUpdate(MRaiseEvent entity, PreUpdateContext<MRaiseEvent> context) {
    }

    @Override
    public void preDelete(MRaiseEvent entity, PreDeleteContext<MRaiseEvent> context) {
    }

    @Override
    public void postInsert(MRaiseEvent entity, PostInsertContext<MRaiseEvent> context) {
    }

    @Override
    public void postUpdate(MRaiseEvent entity, PostUpdateContext<MRaiseEvent> context) {
    }

    @Override
    public void postDelete(MRaiseEvent entity, PostDeleteContext<MRaiseEvent> context) {
    }
}
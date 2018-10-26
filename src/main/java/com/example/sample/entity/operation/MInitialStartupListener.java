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
public class MInitialStartupListener implements EntityListener<MInitialStartup> {

    @Override
    public void preInsert(MInitialStartup entity, PreInsertContext<MInitialStartup> context) {
    }

    @Override
    public void preUpdate(MInitialStartup entity, PreUpdateContext<MInitialStartup> context) {
    }

    @Override
    public void preDelete(MInitialStartup entity, PreDeleteContext<MInitialStartup> context) {
    }

    @Override
    public void postInsert(MInitialStartup entity, PostInsertContext<MInitialStartup> context) {
    }

    @Override
    public void postUpdate(MInitialStartup entity, PostUpdateContext<MInitialStartup> context) {
    }

    @Override
    public void postDelete(MInitialStartup entity, PostDeleteContext<MInitialStartup> context) {
    }
}
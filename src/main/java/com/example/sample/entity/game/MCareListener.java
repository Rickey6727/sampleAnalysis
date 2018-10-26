package com.example.sample.entity.game;

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
public class MCareListener implements EntityListener<MCare> {

    @Override
    public void preInsert(MCare entity, PreInsertContext<MCare> context) {
    }

    @Override
    public void preUpdate(MCare entity, PreUpdateContext<MCare> context) {
    }

    @Override
    public void preDelete(MCare entity, PreDeleteContext<MCare> context) {
    }

    @Override
    public void postInsert(MCare entity, PostInsertContext<MCare> context) {
    }

    @Override
    public void postUpdate(MCare entity, PostUpdateContext<MCare> context) {
    }

    @Override
    public void postDelete(MCare entity, PostDeleteContext<MCare> context) {
    }
}
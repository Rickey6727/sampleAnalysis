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
public class MCoinEventUrlListener implements EntityListener<MCoinEventUrl> {

    @Override
    public void preInsert(MCoinEventUrl entity, PreInsertContext<MCoinEventUrl> context) {
    }

    @Override
    public void preUpdate(MCoinEventUrl entity, PreUpdateContext<MCoinEventUrl> context) {
    }

    @Override
    public void preDelete(MCoinEventUrl entity, PreDeleteContext<MCoinEventUrl> context) {
    }

    @Override
    public void postInsert(MCoinEventUrl entity, PostInsertContext<MCoinEventUrl> context) {
    }

    @Override
    public void postUpdate(MCoinEventUrl entity, PostUpdateContext<MCoinEventUrl> context) {
    }

    @Override
    public void postDelete(MCoinEventUrl entity, PostDeleteContext<MCoinEventUrl> context) {
    }
}